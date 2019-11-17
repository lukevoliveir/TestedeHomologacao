package com.br.project.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class EmailNotificationReqDTO {
	
	private Integer idUser;
	private Integer idProducts;
	private String typeProducts;
	private String typeUser;

}
