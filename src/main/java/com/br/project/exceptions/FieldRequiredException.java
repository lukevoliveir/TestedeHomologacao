package com.br.project.exceptions;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.br.project.constants.ExceptionsConstants;

import org.slf4j.Logger;

public class FieldRequiredException extends RuntimeException{
    
	private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = LoggerFactory.getLogger(FieldRequiredException.class);
    
    @Autowired
	private ExceptionsConstants exceptionsConstants;

    private final List<FieldMessage> fieldMessages = new ArrayList<>();

    public FieldRequiredException(String msg) {
        super(msg);
        LOGGER.error(msg);
    }

    public FieldRequiredException(String msg, Throwable cause) {
        super(msg, cause);
        LOGGER.error(msg,cause.getMessage());
    }

    public FieldRequiredException(List<FieldMessage> fieldMessages) {
        if(fieldMessages == null || fieldMessages.isEmpty()){
            this.fieldMessages.add(new FieldMessage("", exceptionsConstants.getErrorMessageDefault()));
        }

        this.fieldMessages.addAll(fieldMessages);
    }

    public List<FieldMessage> getFieldMessages() {
        return fieldMessages;
    }
}
