package com.factory.factorymethod.logger.factory;

import com.factory.factorymethod.logger.product.Logger;

//日志记录器工厂接口，充当抽象工厂角色。
public interface LoggerFactory {
	Logger createLogger();
}
