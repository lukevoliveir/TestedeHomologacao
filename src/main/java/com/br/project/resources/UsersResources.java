package com.br.project.resources;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.project.business.BusinessUser;
import com.br.project.dto.CreateUserReqDTO;
import com.br.project.dto.CreateUserResDTO;
import com.br.project.dto.DeleteUserReqDTO;
import com.br.project.dto.DeleteUserResDTO;
import com.br.project.dto.UpdateUserReqDTO;
import com.br.project.dto.UpdateUserResDTO;
import com.br.project.integrationobjects.TransferObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api
@CrossOrigin
@RestController
@RequestMapping("/TDD-HML/Users/v1")
public class UsersResources {
	
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory.getLogger(PaymenteModeResources.class);
	
	@Autowired
	private TransferObject<CreateUserResDTO> transferObjectCreate;
	
	@Autowired
	private TransferObject<UpdateUserResDTO> transferObjectUpdate;
	
	@Autowired
	private TransferObject<DeleteUserResDTO> transferObjectDelete;
	
	@Autowired
	private BusinessUser businessUser;
	
	@ApiOperation(value = "MS-05 Serviço disponivel para cadastro de usuarios", notes = "Cadastro de pagamento")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Retorna apenas o codigo http pertinente a solicitação", response = PaymenteModeResources.class) })
	@ResponseBody
	@PostMapping(value = "/create-user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TransferObject<CreateUserResDTO>> formOfUser(@RequestBody CreateUserReqDTO req){
		
		CreateUserResDTO res = businessUser.formOfUser(req);
		
		TransferObject<CreateUserResDTO> entity = transferObjectCreate.getTransferObject(transferObjectCreate, Arrays.asList(res),HttpStatus.CREATED);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(entity);
	}
	
	@ApiOperation(value = "MS-06 Serviço disponivel para atualizar o cadastro do usuario", notes = "Atualizar pagamento")
	@ApiResponses(value = { @ApiResponse (code = 201, message = "Retorna apenas o codigo http pertinente a solicitação", response = PaymenteModeResources.class)})
	@ResponseBody
	@PatchMapping(value = "/update-user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TransferObject<UpdateUserResDTO>> updateOfUser(@RequestBody UpdateUserReqDTO req){
		
		UpdateUserResDTO res = businessUser.updateOfUser(req);
				
		TransferObject<UpdateUserResDTO> entity = transferObjectUpdate.getTransferObject(transferObjectUpdate, Arrays.asList(res), HttpStatus.CREATED);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(entity);
	}
	
	@ApiOperation(value = "MS-07 Serviço disponivel para deletar o cadastro de usuaruio", notes = "Deletar o pagamento")
	@ApiResponses(value = { @ApiResponse (code = 201, message = "Retorna apenas o codigo http pertinente a solicitação", response = PaymenteModeResources.class)})
	@ResponseBody
	@DeleteMapping(value = "/delete-user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TransferObject<DeleteUserResDTO>> deleteOfUser(@RequestBody DeleteUserReqDTO req){
		
		DeleteUserResDTO res = businessUser.deleteOfUser(req);
		
		TransferObject<DeleteUserResDTO> entity = transferObjectDelete.getTransferObject(transferObjectDelete, Arrays.asList(res), HttpStatus.CREATED);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(entity);
	}

}
