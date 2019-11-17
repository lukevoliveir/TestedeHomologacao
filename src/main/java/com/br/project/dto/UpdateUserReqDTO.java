package com.br.project.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class UpdateUserReqDTO {
	
	private Integer idUser;
	private String typeUser;
	private String name;
	private String phone;
	private String cpf;
	private String email;

}
