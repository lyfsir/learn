package com.factory.factorymethod.logger.client;

import com.factory.factorymethod.logger.factory.DatabaseLoggerFarctory;
import com.factory.factorymethod.logger.factory.FileLoggerFactory;
import com.factory.factorymethod.logger.factory.LoggerFactory;
import com.factory.factorymethod.logger.product.Logger;

public class Client {
	public static void main(String[] args) {
		LoggerFactory loggerFactory , loggerFactory2;	
		Logger logger;
		loggerFactory=new DatabaseLoggerFarctory();
		loggerFactory2=new FileLoggerFactory();
		logger=loggerFactory.createLogger();
		logger.writeLog();
		Logger logger2;
		logger2=loggerFactory2.createLogger();
		logger2.writeLog();
	}
}
