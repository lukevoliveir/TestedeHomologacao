package com.br.project.exceptions;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que guarda a lista de erros e excpetions ocorridas na requisição
 * 
 * @author Lucas Valse
 * @since 01/11/2019 
 * @version 1.0.0
 *
 */
public class ValidationError extends StandardError {

    private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<>();

    public ValidationError(Integer status, String message, LocalDateTime dateTime, String messageError, Integer code, Exception e) {
        super(status, dateTime, message, messageError, code, e);
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void setErrors(List<FieldMessage> errors) {
        this.errors = errors;
    }

    public void addError(String fieldName, String message){
        errors.add(new FieldMessage(fieldName, message));
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((errors == null) ? 0 : errors.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof ValidationError)) {
			return false;
		}
		ValidationError other = (ValidationError) obj;
		if (errors == null) {
			if (other.errors != null) {
				return false;
			}
		} else if (!errors.equals(other.errors)) {
			return false;
		}
		return true;
	}
    
    

}
