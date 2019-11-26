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

import com.br.project.business.BusinessProducts;
import com.br.project.dto.CreateProductsReqDTO;
import com.br.project.dto.CreateProductsResDTO;
import com.br.project.dto.DeleteProductsReqDTO;
import com.br.project.dto.DeleteProductsResDTO;
import com.br.project.dto.UpdateProductsReqDTO;
import com.br.project.dto.UpdateProductsResDTO;
import com.br.project.integrationobjects.TransferObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api
@CrossOrigin
@RestController
@RequestMapping("/TDD-HML/products/v1")
public class ProductsResources {
	
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductsResources.class);
	
	@Autowired
	private TransferObject<CreateProductsResDTO> transferObject;
	
	@Autowired
	private TransferObject<UpdateProductsResDTO> transferObjectUpdate;
	
	@Autowired
	private TransferObject<DeleteProductsResDTO> transferObjectDelete;
	
	@Autowired
	private BusinessProducts business;
	
	
	@ApiOperation(value = "MS-11 Serviço disponivel para cadastro de produtos", notes = "Cadastro de produtos")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Retorna apenas o codigo http pertinente a solicitação", response = PaymenteModeResources.class) })
	@ResponseBody
	@PostMapping(value = "/paymente-register", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TransferObject<CreateProductsResDTO>> formOfProducts(@RequestBody CreateProductsReqDTO req){
		
		CreateProductsResDTO res = business.formOfProducts(req);
		
		TransferObject<CreateProductsResDTO> entity = transferObject.getTransferObject(transferObject, Arrays.asList(res), HttpStatus.CREATED);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(entity);
		
	}
	
	@ApiOperation(value = "MS-12 Serviço disponivel para atualizar tipo de produtos", notes = "Atualizar produtos")
	@ApiResponses(value = { @ApiResponse (code = 201, message = "Retorna apenas o codigo http pertinente a solicitação", response = PaymenteModeResources.class)})
	@ResponseBody
	@PatchMapping(value = "/update-register", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TransferObject<UpdateProductsResDTO>> updateFormProducts(@RequestBody UpdateProductsReqDTO req){
		
		UpdateProductsResDTO res = business.updateFormProducts(req);
		
		TransferObject<UpdateProductsResDTO> entity = transferObjectUpdate.getTransferObject(transferObjectUpdate, Arrays.asList(res), HttpStatus.UPGRADE_REQUIRED);
		
		return ResponseEntity.status(HttpStatus.UPGRADE_REQUIRED).body(entity);
		
	}
	
	@ApiOperation(value = "MS-13 Serviço disponivel para deletar produtos", notes = "Deletar o produtos")
	@ApiResponses(value = { @ApiResponse (code = 201, message = "Retorna apenas o codigo http pertinente a solicitação", response = PaymenteModeResources.class)})
	@ResponseBody
	@DeleteMapping(value = "/delete-registe", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TransferObject<DeleteProductsResDTO>> deleteFormProducts(@RequestBody DeleteProductsReqDTO req){
		
		
		DeleteProductsResDTO res = business.deleteFormProducts(req);
		
		TransferObject<DeleteProductsResDTO> entity = transferObjectDelete.getTransferObject(transferObjectDelete, Arrays.asList(res), HttpStatus.OK);
		
		return ResponseEntity.status(HttpStatus.OK).body(entity);
		
	}

}
