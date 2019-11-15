package com.br.project.exceptions;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class SomeException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(SomeException.class);

	public SomeException(String msg) {
		super(msg);
		LOGGER.error(msg);
	}
	
	public SomeException(String msg, Throwable cause) {
		super(msg, cause);
		LOGGER.error(msg, cause.getMessage());
	}
}