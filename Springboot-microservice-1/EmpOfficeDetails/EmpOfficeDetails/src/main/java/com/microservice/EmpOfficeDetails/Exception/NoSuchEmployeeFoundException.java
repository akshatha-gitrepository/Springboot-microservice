package com.microservice.EmpOfficeDetails.Exception;

public class NoSuchEmployeeFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NoSuchEmployeeFoundException(String msg) {
		super(msg);
	}

}
