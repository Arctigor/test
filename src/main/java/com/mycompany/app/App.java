package com.mycompany.app;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.jboss.weld.environment.se.events.ContainerInitialized;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;

/**
 * Hello world!
 * 
 */
@ApplicationScoped
public class App {
	private static final XLogger LOG = XLoggerFactory.getXLogger(App.class);

	public App() {

	}

	public void printHello(@Observes ContainerInitialized event) {

		LOG.info("Hello Weld");

	}
}
