package com.yash.SpringIOCAssignment_5.model;

public class SetterMessage {

	private String message=null;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SetterMessage [message=" + message + "]";
	}
	
	

	
}
