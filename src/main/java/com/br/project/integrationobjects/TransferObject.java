package com.br.project.integrationobjects;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


/**
 * Classe padrão de retorno de informações para o frontend
 * 
 * @author Lucas Vale
 * @since 01/11/2019
 * @version 1.0.0
 *
 */
@Data
@Component
@Scope(value="prototype")
public class TransferObject<T> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<T> data;
	private Integer status;
	private String message;
	private String messageError;
	@JsonIgnore
	private Exception error;
	

	/**
	 *  
	 * Método que retorna um transferObject genérico
	 * 
	 * @author Jean Fernandes
	 * @since 19/05/2019
	 * @version 1.0.0
	 * 
	 * @param transferObject
	 * @param list
	 * @return
	 */			
	public TransferObject<T> getTransferObject(TransferObject<T> transferObject, List<T> list) {
		
		transferObject.setData(list);
		transferObject.setStatus(ResponseEntity.status(HttpStatus.OK).build().getStatusCodeValue());
		transferObject.setMessage("Sucesso");
		
		return transferObject;
	}
	
	/**
	 *  
	 * Método que retorna um transferObject genérico com status parametrizado
	 * 
	 * @author Ricardo Oliveira
	 * @since 26/07/2019
	 * @version 1.0.0
	 * 
	 * @param transferObject
	 * @param list
	 * @return
	 */
	public TransferObject<T> getTransferObject(TransferObject<T> transferObject, List<T> list, HttpStatus httpStatus) {
		
		transferObject.setData(list);
		transferObject.setStatus(ResponseEntity.status(httpStatus).build().getStatusCodeValue());
		transferObject.setMessage("Sucesso");
		
		return transferObject;
	}
		
}
