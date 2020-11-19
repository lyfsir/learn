package com.bulider.esg;

import java.util.Date;

public abstract class AutoMessage {
	private String to;
	private String from;
	private String subject;
	private String body;
	private Date sendDate; 
	
	//send方法起到的作用仅仅是打印作用
	public void send() {
		System.out.println("发送人："+to);
		System.out.println("接收人："+from);
		System.out.println("标题："+subject);
		System.out.println("内容："+body);
		System.out.println("日期："+sendDate);
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	
	
}
