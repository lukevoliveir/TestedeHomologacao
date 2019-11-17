package com.br.project.business;

import org.springframework.stereotype.Service;

import com.br.project.dto.CreateUserReqDTO;
import com.br.project.dto.CreateUserResDTO;
import com.br.project.dto.DeleteUserReqDTO;
import com.br.project.dto.DeleteUserResDTO;
import com.br.project.dto.UpdateUserReqDTO;
import com.br.project.dto.UpdateUserResDTO;

/**
 * Metodo que Cria, Atualiza e deleta o usuario
 * 
 * @author lucas.vale
 *
 */

@Service
public interface BusinessUser {
	
	
	/**
	 * Criar Usuario
	 * @param req
	 * @return
	 */
	CreateUserResDTO formOfUser(CreateUserReqDTO req);
	
	
	/**
	 *Atualizar Usuario
	 * @param req
	 * @return
	 */
	UpdateUserResDTO updateOfUser(UpdateUserReqDTO req);
	
	/**
	 * Deletar Usuario
	 * @param req
	 * @return
	 */
	DeleteUserResDTO deleteOfUser(DeleteUserReqDTO req);

}
