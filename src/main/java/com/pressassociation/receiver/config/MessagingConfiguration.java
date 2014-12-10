package com.pressassociation.receiver.config;

import org.apache.camel.component.jms.JmsComponent;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.jndi.JndiTemplate;

import javax.jms.ConnectionFactory;
import javax.naming.NamingException;
import java.util.Properties;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 09/12/2014 13:50
 * <p/>
 * ****************************************************************************************
 */
@Configuration
@PropertySource(value = "classpath:application.properties")
public class MessagingConfiguration implements ApplicationContextAware {
  protected static final Log LOG = LogFactory.getLog(MessagingConfiguration.class);

  private Environment env;

  @Bean
  public JndiTemplate jndiTemplate() {
    LOG.info("SSL Enabled and SSL path is: " + env.getProperty("mq.ssl.store.path"));
    System.setProperty("javax.net.ssl.keyStorePassword", env.getProperty("mq.ssl.store.password"));
    System.setProperty("javax.net.ssl.trustStorePassword", env.getProperty("mq.ssl.store.password"));
    System.setProperty("javax.net.ssl.keyStoreType", "jks");

    System.setProperty("javax.net.ssl.keyStore", env.getProperty("mq.ssl.store.path"));
    System.setProperty("javax.net.ssl.trustStore", env.getProperty("mq.ssl.store.path"));


    Properties props = new Properties();
    props.setProperty("java.naming.factory.initial", env.getProperty("java.naming.factory.initial"));
    props.setProperty("java.naming.provider.url", env.getProperty("java.naming.provider.url"));

    return new JndiTemplate(props);
  }

  @Bean
  public Object jmsQueueConnectionFactory()
          throws NamingException {
    JndiObjectFactoryBean factory = new JndiObjectFactoryBean();
    factory.setJndiTemplate(jndiTemplate());
    factory.setJndiName(env.getProperty("mq.connection.factory.name"));
    factory.afterPropertiesSet();

    return factory.getObject();
  }

  @Bean
  public JmsComponent websphereMQ()
          throws NamingException {
    JmsComponent component = new JmsComponent();
    component.setConnectionFactory((ConnectionFactory)jmsQueueConnectionFactory());

    return component;
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext)
          throws BeansException {
    env = applicationContext.getEnvironment();
  }
}
