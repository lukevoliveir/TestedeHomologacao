package com.br.project.interfaces;

import org.springframework.http.ResponseEntity;

import com.br.project.dto.CreateProductsReqDTO;
import com.br.project.dto.CreateProductsResDTO;
import com.br.project.dto.DeleteProductsReqDTO;
import com.br.project.dto.DeleteProductsResDTO;
import com.br.project.dto.UpdateProductsReqDTO;
import com.br.project.dto.UpdateProductsResDTO;
import com.br.project.integrationobjects.TransferObject;

public interface ProductsResoucesSignature {

	public ResponseEntity<TransferObject<CreateProductsResDTO>> formOfProducts(CreateProductsReqDTO req);
	
	public ResponseEntity<TransferObject<UpdateProductsResDTO>> updateFormProducts(UpdateProductsReqDTO req);
	
	public ResponseEntity<TransferObject<DeleteProductsResDTO>> deleteFormProducts(DeleteProductsReqDTO req);
	
	
}
