package com.br.project.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Exception especifica para tratamento de campos
 * 
 * @author Lucas Vale
 * @since 01/11/2019
 * @version 1.0.0
 * 
 * @see Exception
 *
 */
public class FieldsException extends Exception {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(FieldsException.class);
	private static final String errorLogMsg = "Ocorreu um exceção em um dos atributos do sistemas --> ";
	
	public FieldsException() {
		
	}
	
	public FieldsException(String msg) {
		super(msg);
		LOGGER.error(errorLogMsg, msg);
	}
	
	public FieldsException(String msg, Throwable cause){
        super(msg, cause);
		LOGGER.error(errorLogMsg, msg);
    }

}
