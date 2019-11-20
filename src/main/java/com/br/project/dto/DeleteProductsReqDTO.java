package com.br.project.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DeleteProductsReqDTO {
	
	private Integer id;
	private String nameProducts;
	private String typeProducts;
	private String qtd;
	private String much;

}
