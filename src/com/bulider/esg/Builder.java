package com.bulider.esg;

import java.util.Date;

public abstract class Builder {
	protected AutoMessage msg;
	
	abstract void buildSubject();
	abstract void buildBody();
	
	public void buildTo(String to) {
		msg.setTo(to);
	};
	public void buildFrom(String from) {
		msg.setFrom(from);
	};
	public void buildSendDate() {
		msg.setSendDate(new Date());
	}
	public void sendMessage() {
		msg.send();
	}
	
}
