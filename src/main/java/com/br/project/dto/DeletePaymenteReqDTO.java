package com.br.project.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DeletePaymenteReqDTO {
	
	private Integer id;
	private String type;
	private String paymente;
	

}
