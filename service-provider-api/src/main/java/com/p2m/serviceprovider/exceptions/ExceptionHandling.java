package com.p2m.serviceprovider.exceptions;

public class ExceptionHandling extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionHandling() {
		super();
	}

	public ExceptionHandling(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ExceptionHandling(String message, Throwable cause) {
		super(message, cause);
	}

	public ExceptionHandling(String message) {
		super(message);
	}

	public ExceptionHandling(Throwable cause) {
		super(cause);
	}
}
