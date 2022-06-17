package com.pichincha.prueba.demo.exception;

public class StoreException extends Exception {

	private static final long serialVersionUID = -1393415637717906283L;
	private String message;
	
	public StoreException(String message, Throwable throwable) {
		super(message, throwable);
		this.message = message;
	}
}
