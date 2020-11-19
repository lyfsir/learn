package com.bulider.esg;

public class GoodbyeBuilder extends Builder{
	public GoodbyeBuilder() {
		msg=new GoodbyeMessage();
	}

	@Override
	void buildSubject() {
		msg.setSubject("欢送标题");
	}

	@Override
	void buildBody() {
		msg.setBody("欢送内容");
	}
}
