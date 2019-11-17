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

import com.br.project.business.BusinessPaymente;
import com.br.project.dto.DeletePayementeResDTO;
import com.br.project.dto.DeletePaymenteReqDTO;
import com.br.project.dto.PaymenteRegisterReqDTO;
import com.br.project.dto.PaymenteRegisterResDTO;
import com.br.project.dto.UpdatePaymenteReqDTO;
import com.br.project.dto.UpdatePaymenteResDTO;
import com.br.project.integrationobjects.TransferObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 
 * @author lucas.vale
 *
 */

@Api
@CrossOrigin
@RestController
@RequestMapping("/TDD-HML/paymente/v1")
public class PaymenteModeResources {
	
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory.getLogger(PaymenteModeResources.class);
	
	@Autowired
	private TransferObject<PaymenteRegisterResDTO> transferObject;
	
	@Autowired
	private TransferObject<UpdatePaymenteResDTO> transferObjectUpdate; 
	
	@Autowired
	private TransferObject<DeletePayementeResDTO> tranferObjecteDelete;
	
	@Autowired
	private BusinessPaymente business;
	
	
	@ApiOperation(value = "MS-01 Serviço disponivel para cadastro de pagamento", notes = "Cadastro de pagamento")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Retorna apenas o codigo http pertinente a solicitação", response = PaymenteModeResources.class) })
	@ResponseBody
	@PostMapping(value = "/paymente-register", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TransferObject<PaymenteRegisterResDTO>> formOfPaymente(@RequestBody PaymenteRegisterReqDTO req){
		
		PaymenteRegisterResDTO res = business.formOfPaymente(req);
		
		TransferObject<PaymenteRegisterResDTO> entity = transferObject.getTransferObject(transferObject, Arrays.asList(res), HttpStatus.CREATED);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(entity);
		
	}
	
	@ApiOperation(value = "MS-02 Serviço disponivel para atualizar forma de pagameto", notes = "Atualizar pagamento")
	@ApiResponses(value = { @ApiResponse (code = 201, message = "Retorna apenas o codigo http pertinente a solicitação", response = PaymenteModeResources.class)})
	@ResponseBody
	@PatchMapping(value = "/update-register", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TransferObject<UpdatePaymenteResDTO>> updateFormPaymente(@RequestBody UpdatePaymenteReqDTO req){
		
		UpdatePaymenteResDTO res = business.updateFormPaymente(req);
		
		TransferObject<UpdatePaymenteResDTO> entity = transferObjectUpdate.getTransferObject(transferObjectUpdate, Arrays.asList(res), HttpStatus.CREATED);
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(entity);
	}
	
	
	@ApiOperation(value = "MS-03 Serviço disponivel para deletar forma de pagameto", notes = "Deletar o pagamento")
	@ApiResponses(value = { @ApiResponse (code = 201, message = "Retorna apenas o codigo http pertinente a solicitação", response = PaymenteModeResources.class)})
	@ResponseBody
	@DeleteMapping(value = "/delete-registe", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TransferObject<DeletePayementeResDTO>> deleteFormPaymente(@RequestBody DeletePaymenteReqDTO req){
		
		
		DeletePayementeResDTO res = business.deleteFormPaymente(req);
		
		TransferObject<DeletePayementeResDTO> entity = tranferObjecteDelete.getTransferObject(tranferObjecteDelete, Arrays.asList(res), HttpStatus.CREATED);
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(entity);
	}
	


	

}
