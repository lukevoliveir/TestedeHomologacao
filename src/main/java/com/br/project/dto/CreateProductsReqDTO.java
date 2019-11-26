package com.br.project.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class CreateProductsReqDTO {
	
	private Integer id;
	private String nameProducts;
	private String typeProducts;
	private String amount;
	private String value;
	

}
