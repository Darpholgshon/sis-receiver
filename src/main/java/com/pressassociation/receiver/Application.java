/*
 * Copyright (c) The Press Association Limited 1988-2010
 *
 * All rights reserved. No part of this work may be reproduced or
 * transmitted, in any form or by any means, or adapted (including for
 * the purposes of error correction) without the written permission of
 * the copyright owner except in accordance with the provisions of the
 * Copyright, Designs and Patents Act 1988 or under the terms of a
 * Licence entered into with the copyright owner.
 *
 * Warning: the doing of an unauthorised act in relation to a copyright
 * work may result in both a civil claim for damages and a criminal
 * prosecution.
 *
 */
package com.pressassociation.receiver;

import org.apache.camel.CamelContext;
import org.apache.camel.ServiceStatus;
import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * Bootstrap for Apache Camel powered receiver. Refer to camel-context for defined
 * routes and config.
 *
 * @author stevenr
 *
 */
@Configuration
@ComponentScan
public class Application implements CommandLineRunner, ApplicationContextAware {

    private ApplicationContext applicationContext;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings)
            throws Exception {
        CamelContext camelContext = applicationContext.getBean(CamelContext.class);

        while(camelContext.getStatus().equals(ServiceStatus.Started)){
            Thread.sleep(100);
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        this.applicationContext = applicationContext;
    }
}
