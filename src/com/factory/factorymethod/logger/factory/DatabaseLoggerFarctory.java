package com.factory.factorymethod.logger.factory;

import com.factory.factorymethod.logger.product.DatabaseLogger;
import com.factory.factorymethod.logger.product.Logger;

//DatabaseLoggerFarctory:数据库日志工厂
public class DatabaseLoggerFarctory implements LoggerFactory {
	
	@Override
	public Logger createLogger() {
		Logger logger=new DatabaseLogger();
		return logger;
	}

}
