package com.br.project.interfaces;

import org.springframework.http.ResponseEntity;

import com.br.project.dto.CreateShoppingCartReqDTO;
import com.br.project.dto.CreateShoppingCartResDTO;
import com.br.project.dto.DeleteShoppingCartReqDTO;
import com.br.project.dto.DeleteShoppingCartResDTO;
import com.br.project.dto.UpdateShoppingCartReqDTO;
import com.br.project.dto.UpdateShoppingCartResDTO;
import com.br.project.integrationobjects.TransferObject;

public interface ShoppingCartRessourcesSignature {
	
	public ResponseEntity<TransferObject<CreateShoppingCartResDTO>> formOfShoppingCart(CreateShoppingCartReqDTO req);
	
	public ResponseEntity<TransferObject<UpdateShoppingCartResDTO>> updateformOfShoppingCart(UpdateShoppingCartReqDTO req);
	
	public ResponseEntity<TransferObject<DeleteShoppingCartResDTO>> deleteformOfShoppingCart(DeleteShoppingCartReqDTO req);

}
