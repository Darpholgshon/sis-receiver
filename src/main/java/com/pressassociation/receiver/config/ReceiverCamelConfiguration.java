package com.pressassociation.receiver.config;

import com.google.common.collect.Lists;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.properties.PropertiesComponent;
import org.apache.camel.spring.javaconfig.CamelConfiguration;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 09/12/2014 13:36
 * <p/>
 * ****************************************************************************************
 */
@Configuration
public class ReceiverCamelConfiguration extends CamelConfiguration {
  protected static final Log LOG = LogFactory.getLog(ReceiverCamelConfiguration.class);

  @Override
  protected void setupCamelContext(CamelContext camelContext)
          throws Exception {
    LOG.debug("Camel Context is being configured...");
    //((SpringCamelContext) camelContext).setManagementName("#name#");

    // Add in properties.
    PropertiesComponent pc = new PropertiesComponent();
    pc.setLocation("classpath:application.properties");
    camelContext.addComponent("properties", pc);
  }

  @Override
  public List<RouteBuilder> routes() {
    LOG.debug("Camel Context is adding routes...");
    return Lists.newArrayList(getApplicationContext().getBeansOfType(RouteBuilder.class).values());
  }
}
