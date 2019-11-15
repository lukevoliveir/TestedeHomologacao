package com.br.project.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Classe que guarda a o campo e a mensagem de erro da aplicação
 * 
 * @author Lucas Valse
 * @since 01/11/2019 
 * @version 1.0.0
 *
 */

@Data
@AllArgsConstructor

public class FieldMessage {

	private String fieldName;
    private String message;

}
