package com.bulider.esg;

public class WelcomeBuilder extends Builder{
	public WelcomeBuilder() {
		msg=new WelcomeMessage();
	}

	@Override
	void buildSubject() {
		msg.setBody("欢迎标题");
	}

	@Override
	void buildBody() {
		msg.setSubject("欢迎内容");
	}
}
