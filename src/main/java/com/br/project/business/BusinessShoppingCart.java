package com.br.project.business;

import org.springframework.stereotype.Service;

import com.br.project.dto.CreateShoppingCartReqDTO;
import com.br.project.dto.CreateShoppingCartResDTO;
import com.br.project.dto.DeleteShoppingCartReqDTO;
import com.br.project.dto.DeleteShoppingCartResDTO;
import com.br.project.dto.UpdateShoppingCartReqDTO;
import com.br.project.dto.UpdateShoppingCartResDTO;

@Service
public interface BusinessShoppingCart {
	
	CreateShoppingCartResDTO formOfShoppingCart(CreateShoppingCartReqDTO req);
	
	UpdateShoppingCartResDTO updateformOfShoppingCart(UpdateShoppingCartReqDTO req);
	
	DeleteShoppingCartResDTO deleteformOfShoppingCart(DeleteShoppingCartReqDTO req);
}
