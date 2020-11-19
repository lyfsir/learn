package com.factory.factorymethod.logger.product;

//文件日志记录器，充当具体产品角色。
public class FileLogger implements Logger {

	@Override
	public void writeLog() {
		System.out.println("文件日志记录........");
	}

}
