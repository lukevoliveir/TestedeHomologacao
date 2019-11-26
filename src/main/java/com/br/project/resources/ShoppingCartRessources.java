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

import com.br.project.business.BusinessShoppingCart;
import com.br.project.dto.CreateShoppingCartReqDTO;
import com.br.project.dto.CreateShoppingCartResDTO;
import com.br.project.dto.DeleteProductsReqDTO;
import com.br.project.dto.DeleteProductsResDTO;
import com.br.project.dto.DeleteShoppingCartReqDTO;
import com.br.project.dto.DeleteShoppingCartResDTO;
import com.br.project.dto.UpdateProductsResDTO;
import com.br.project.dto.UpdateShoppingCartReqDTO;
import com.br.project.dto.UpdateShoppingCartResDTO;
import com.br.project.integrationobjects.TransferObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api
@CrossOrigin
@RestController
@RequestMapping("/TDD-HML/shoppingCart/v1")
public class ShoppingCartRessources {
	
	
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductsResources.class);
	
	@Autowired
	private TransferObject<CreateShoppingCartResDTO> transferObject;
	
	@Autowired
	private TransferObject<UpdateShoppingCartResDTO> transferObjectUpdate;

	@Autowired
	private TransferObject<DeleteShoppingCartResDTO> transferObjectDelete;
	
	@Autowired
	private BusinessShoppingCart business;
	
	
	@ApiOperation(value = "MS-08 Serviço disponivel para cadastro de produtos", notes = "Cadastro de produtos")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Retorna apenas o codigo http pertinente a solicitação", response = PaymenteModeResources.class) })
	@ResponseBody
	@PostMapping(value = "/paymente-register", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TransferObject<CreateShoppingCartResDTO>> formOfShoppingCart(@RequestBody CreateShoppingCartReqDTO req){
		
		CreateShoppingCartResDTO res = business.formOfShoppingCart(req);
		
		TransferObject<CreateShoppingCartResDTO> entity = transferObject.getTransferObject(transferObject, Arrays.asList(res), HttpStatus.CREATED);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(entity);
		
	}
	
	@ApiOperation(value = "MS-09 Serviço disponivel para atualizar tipo de produtos", notes = "Atualizar produtos")
	@ApiResponses(value = { @ApiResponse (code = 201, message = "Retorna apenas o codigo http pertinente a solicitação", response = PaymenteModeResources.class)})
	@ResponseBody
	@PatchMapping(value = "/update-register", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TransferObject<UpdateShoppingCartResDTO>> updateformOfShoppingCart(@RequestBody UpdateShoppingCartReqDTO req){
		
		UpdateShoppingCartResDTO res = business.updateformOfShoppingCart(req);
		
		TransferObject<UpdateShoppingCartResDTO> entity = transferObjectUpdate.getTransferObject(transferObjectUpdate, Arrays.asList(res), HttpStatus.UPGRADE_REQUIRED);
		
		return ResponseEntity.status(HttpStatus.UPGRADE_REQUIRED).body(entity);
		
	}
	
	@ApiOperation(value = "MS-10 Serviço disponivel para deletar produtos", notes = "Deletar o produtos")
	@ApiResponses(value = { @ApiResponse (code = 201, message = "Retorna apenas o codigo http pertinente a solicitação", response = PaymenteModeResources.class)})
	@ResponseBody
	@DeleteMapping(value = "/delete-registe", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TransferObject<DeleteShoppingCartResDTO>> deleteFormProducts(@RequestBody DeleteShoppingCartReqDTO req){
		
		
		DeleteShoppingCartResDTO res = business.deleteformOfShoppingCart(req);
		
		TransferObject<DeleteShoppingCartResDTO> entity = transferObjectDelete.getTransferObject(transferObjectDelete, Arrays.asList(res), HttpStatus.OK);
		
		return ResponseEntity.status(HttpStatus.OK).body(entity);
		
	}
	
}
