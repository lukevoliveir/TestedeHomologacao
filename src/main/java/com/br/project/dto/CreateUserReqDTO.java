package com.br.project.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Entity
@Table(name = "User")
public class CreateUserReqDTO {
	
	@Id
	@GeneratedValue
	private Integer idUser;
	@Column(name = "tipo_usuario")
	private String typeUser;
	@Column(name = "nome")
	private String name;
	@Column(name = "telefone")
	private String phone;
	@Column(name = "documento")
	private String cpf;
	@Column(name = "email")
	private String email;

}
