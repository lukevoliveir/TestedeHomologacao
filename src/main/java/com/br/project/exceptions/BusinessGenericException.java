package com.br.project.exceptions;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.br.project.constants.ExceptionsConstants;

import com.br.project.exceptions.FieldMessage;

public class BusinessGenericException extends Exception{
    
	private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessGenericException.class);

    private final List<FieldMessage> fieldMessages = new ArrayList<>();
    
    @Autowired
	private ExceptionsConstants exceptionsConstants;

    public BusinessGenericException(String msg) {
        super(msg);
        LOGGER.error(msg);
    }

    public BusinessGenericException(String msg, Throwable cause) {
        super(msg, cause);
        LOGGER.error(msg,cause.getMessage());
    }

    public BusinessGenericException(List<FieldMessage> fieldMessages) {
        if(fieldMessages == null || fieldMessages.isEmpty()){
            this.fieldMessages.add(new FieldMessage("", exceptionsConstants.getErrorMessageDefault()));
        }

        this.fieldMessages.addAll(fieldMessages);
    }

    public List<FieldMessage> getFieldMessages() {
        return fieldMessages;
    }
}
