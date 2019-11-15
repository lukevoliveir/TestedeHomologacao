package com.br.project.exceptions;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.br.project.constants.ExceptionsConstants;
import com.br.project.integrationobjects.TransferObject;

/**
 * Classe que trata exceptions retornando um objectTransfer
 * 
 * @author Lucas Vale
 * @since 01/11/2019 
 * @version 1.0.0
 *
 */
public class ExceptionHandler<T> {
	
	private Exception e;
	
	@Autowired
	private ExceptionsConstants exceptionsConstants;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandler.class);

	@Autowired
	private TransferObject<T> transferObjectException;
	
	public ExceptionHandler(Exception e) {
		this.e = e;
	}
	
	public TransferObject<T> build() {
		
		transferObjectException.setData(null);
		transferObjectException.setStatus(ResponseEntity.badRequest().build().getStatusCodeValue());
		transferObjectException.setMessage(exceptionsConstants.getErrorMessageDefault() + " -->");
		transferObjectException.setMessageError(e.getMessage());
		LOGGER.error(e.getMessage());
		
		return transferObjectException;
		
	}
	
	
	
	
}
