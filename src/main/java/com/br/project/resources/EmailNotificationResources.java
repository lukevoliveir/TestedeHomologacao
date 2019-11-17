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

import com.br.project.business.BusinessEmailNotification;
import com.br.project.dto.EmailNotificationReqDTO;
import com.br.project.dto.EmailNotificationResDTO;
import com.br.project.integrationobjects.TransferObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api
@CrossOrigin
@RestController
@RequestMapping("/TDD-HML/emailNotification/v1")
public class EmailNotificationResources {
	
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory.getLogger(PaymenteModeResources.class);
	
	@Autowired
	private TransferObject<EmailNotificationResDTO> transferObject;
	
	@Autowired
	private BusinessEmailNotification businessEmailNotification;
	
	@ApiOperation(value = "MS-04 Serviço disponivel envio do email", notes = "Cadastro de pagamento")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Retorna apenas o codigo http pertinente a solicitação", response = PaymenteModeResources.class) })
	@ResponseBody
	@PostMapping(value = "/email-notification", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TransferObject<EmailNotificationResDTO>> noticationEmail(@RequestBody EmailNotificationReqDTO req){
		
		EmailNotificationResDTO res = businessEmailNotification.noticationEmail(req);
		
		TransferObject<EmailNotificationResDTO> entity = transferObject.getTransferObject(transferObject, Arrays.asList(res), HttpStatus.CREATED);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(entity);
	}
}
