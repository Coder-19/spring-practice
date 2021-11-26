package com.configuration.springConfiguration;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// the code below is used to create a class for configuring the logger to  show us the logging
// messages in the console
public class MyLoggerConfig {
	// the property below is used to get the root logger level
	private String rootLoggerLevel;
	// the property below is used to get the printed logger level
	private String printedLoggerLevel;
	
	// the code below is used to create a setter for rootLoggerLevel to set the value of the root
	// logger level
	public void setRootLoggerLevel(String rootLoggerLevel) {
		this.rootLoggerLevel = rootLoggerLevel;
	}
	
	// the code below is used to create a setter for the printed logger level to set the value 
	// of the printed logger
	public void setPrintedLoggerLevel(String printedLoggerLevel) {
		this.printedLoggerLevel = printedLoggerLevel;
	}
	
	
	// the code below is used to create an init-method for the logger 
	public void initLogger() {
		// the code below is used to parse the root level
		Level rootLevel = Level.parse(rootLoggerLevel);
		// the code below is used to parse the printed level
		Level printedLevel = Level.parse(printedLoggerLevel);
		
		// the code below is used to get the logger from the app context
		Logger applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName());
		
		// the code below is used to get the parent logger
		Logger loggerParent = applicationContextLogger.getParent();
		
		// the code below is used to set the root logging level
		loggerParent.setLevel(rootLevel);
		
		
		// the code below is used to set up the console handler
		ConsoleHandler consoleHandler = new ConsoleHandler();
		// the code below is used to set the level of the console handler
		consoleHandler.setLevel(printedLevel);
		// the code below is used to handle the formatter for the console handler
		consoleHandler.setFormatter(new SimpleFormatter());
		
		// the code below is used to add the handler to the logger
		loggerParent.addHandler(consoleHandler);
	}
	
}
