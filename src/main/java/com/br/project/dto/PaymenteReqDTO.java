package com.br.project.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PaymenteReqDTO {
	
	private String type;
	private String paymente;
	

}
