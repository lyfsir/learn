package com.factory.factorymethod.logger.factory;

import com.factory.factorymethod.logger.product.FileLogger;
import com.factory.factorymethod.logger.product.Logger;

//FileLoggerFactory:文件日志工厂
public class FileLoggerFactory implements LoggerFactory{
	
	@Override
	public Logger createLogger() {
		Logger logger=new FileLogger();
		return logger;
	}

}
