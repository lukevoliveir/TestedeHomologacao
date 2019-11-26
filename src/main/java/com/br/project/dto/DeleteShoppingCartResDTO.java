package com.br.project.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DeleteShoppingCartResDTO {
	
	private Integer idShoppingCart;
	private Integer idProducts;
	private String nameUser;
	private String typeProducts;
	private String amount;

}
