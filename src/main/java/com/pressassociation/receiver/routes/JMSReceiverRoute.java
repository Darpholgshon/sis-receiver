package com.pressassociation.receiver.routes;

import com.pressassociation.receiver.service.FeedService;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

@Component
public class JMSReceiverRoute extends RouteBuilder {
	@Override
	public void configure() throws Exception {
		/*
		 *  Exception handlers
		 */
		onException(JMSException.class)
			.to("log:ERROR");

		onException(Exception.class)
			.to("log:ERROR");

		/*
		 *  Route definition
		 */
		from("jms:queue:{{mq.queue.name}}")
			.routeId(getClass().getSimpleName())
			.to("log:INFO")
			.bean(FeedService.class, "handleXML");

//			.choice()
//			.when(xpath("/hrdg:data/type='master'"))
//			.log("HRDG ->")
//			.inOnly("direct:hrdg")
//			.otherwise()
//			.log("XUP ->")
//										//.inOnly("direct:xup")
//			.log("${body}");

//		from("direct:hrdg")
//						.unmarshal(new JaxbDataFormat("com.pressassociation.racing.sis.model.hrdg"))
//						.log(LoggingLevel.INFO, "${body}");
//
//		from("direct:hrdg")
//						.unmarshal(new JaxbDataFormat("com.pressassociation.racing.sis.model.hrdg"))
//						.log(LoggingLevel.INFO, "${body}");
	}
}
