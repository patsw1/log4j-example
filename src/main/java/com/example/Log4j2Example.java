package com.example;

import org.apache.logging.log4j.*;

public class Log4j2Example {
	Logger logger = LogManager.getLogger();
	Logger fileLogger = LogManager.getLogger("fileLogger");
	Logger flumeLogger = LogManager.getLogger("flumeLogger");
	
	private void init() {
		logger.info("(logger) testing info");
		logger.warn("(logger) testing warn");
		logger.error("(logger) testing error");
		fileLogger.info("(fileLogger) testing info");
		fileLogger.warn("(fileLogger) testing warn");
		fileLogger.error("(fileLogger) testing error");
		flumeLogger.info("(flumeLogger) testing info");
		flumeLogger.warn("(flumeLogger) testing warn");
		flumeLogger.error("(flumeLogger) testing error");
	}

	public static void main(String[] args) {
		Log4j2Example log4j2Example = new Log4j2Example();
		log4j2Example.init();
	}
}
