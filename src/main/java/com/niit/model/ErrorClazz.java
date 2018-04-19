package com.niit.model;

public class ErrorClazz {
	
	int code;
	String message;
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public ErrorClazz(int code, String message) 
	{
		super();
		this.code = code;
		this.message = message;
	}
	
	
}



