package com.pbl4.model.bean;

public class Message {
	private String sender;
	private String content;
	public Message(String sender, String content) {
		super();
		this.sender = sender;
		this.content = content;
	}
	public Message() {
		
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
