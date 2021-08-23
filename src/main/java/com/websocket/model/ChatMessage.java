package com.websocket.model;

public class ChatMessage {
	
	private String content;
	private String Sender;
	private messageType type;
	
	
	
	
	public enum messageType {
		CHAT,LEAVE,JOIN;
	}




	public String getContent() {
		return content;
	}




	public void setContent(String content) {
		this.content = content;
	}




	public String getSender() {
		return Sender;
	}




	public void setSender(String sender) {
		Sender = sender;
	}




	public messageType getType() {
		return type;
	}




	public void setType(messageType type) {
		this.type = type;
	}
	
	
	
}
