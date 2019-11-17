package com.br.project.resources;

import java.util.Arrays;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.project.business.BussinessPaymente;
import com.br.project.dto.PaymenteReqDTO;
import com.br.project.dto.PaymenteResDTO;
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
	private TransferObject<PaymenteResDTO> transferObject;
	
//	@Autowired
//	private BussinessPaymente bussiness;
//	
	
	@ApiOperation(value = "MS-01 Serviço disponivel para cadastro de pagamento", notes = "Cadastro de pagamento")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Retorna apenas o codigo http pertinente a solicitação", response = PaymenteModeResources.class) })
	@ResponseBody
	@PostMapping(value = "/paymente-register", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TransferObject<PaymenteResDTO>> formOfPaymente(@RequestBody PaymenteReqDTO req){
		
//		PaymenteResDTO res = bussiness.formOfPaymente(req);
		
//		TransferObject<PaymenteResDTO> entty = transferObject.getTransferObject(transferObject, Arrays.asList(res), HttpStatus.CREATED);
		
		return null;
		
	}


	

}
