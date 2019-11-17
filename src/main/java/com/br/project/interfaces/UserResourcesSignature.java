package com.br.project.interfaces;

import org.springframework.http.ResponseEntity;

import com.br.project.dto.CreateUserReqDTO;
import com.br.project.dto.CreateUserResDTO;
import com.br.project.dto.DeleteUserReqDTO;
import com.br.project.dto.DeleteUserResDTO;
import com.br.project.dto.UpdateUserReqDTO;
import com.br.project.dto.UpdateUserResDTO;
import com.br.project.integrationobjects.TransferObject;

public interface UserResourcesSignature {
	
	/**
	 * 
	 * @param req
	 * @return
	 */
	public ResponseEntity<TransferObject<CreateUserResDTO>> formOfUser(CreateUserReqDTO req);
	
	/**
	 * 
	 * @param req
	 * @return
	 */
	public ResponseEntity<TransferObject<UpdateUserResDTO>> updateOfUser(UpdateUserReqDTO req);
	
	/**
	 * 
	 * @param req
	 * @return
	 */
	public ResponseEntity<TransferObject<DeleteUserResDTO>> deleteOfUser(DeleteUserReqDTO req);
}
