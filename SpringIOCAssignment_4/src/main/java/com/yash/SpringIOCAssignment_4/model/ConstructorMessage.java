package com.yash.SpringIOCAssignment_4.model;

public class ConstructorMessage {

	private String message=null;

	public ConstructorMessage(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "ConstructorMessage [message=" + message + "]";
	}
	
	
	
}
