package com.br.project.business.impl;

import org.springframework.stereotype.Service;

import com.br.project.business.BusinessShoppingCart;
import com.br.project.dto.CreateShoppingCartReqDTO;
import com.br.project.dto.CreateShoppingCartResDTO;
import com.br.project.dto.DeleteShoppingCartReqDTO;
import com.br.project.dto.DeleteShoppingCartResDTO;
import com.br.project.dto.UpdateShoppingCartReqDTO;
import com.br.project.dto.UpdateShoppingCartResDTO;

@Service
public class BusinessShoppingCartImpl implements BusinessShoppingCart {

	@Override
	public CreateShoppingCartResDTO formOfShoppingCart(CreateShoppingCartReqDTO req) {
		
		CreateShoppingCartResDTO res = new CreateShoppingCartResDTO();
		
		res.setAmount(req.getAmount());
		res.setIdProducts(req.getIdProducts());
		res.setIdShoppingCart(req.getIdShoppingCart());
		res.setNameUser(req.getNameUser());
		res.setTypeProducts(req.getTypeProducts());
		
		
		return null;
	}

	@Override
	public UpdateShoppingCartResDTO updateformOfShoppingCart(UpdateShoppingCartReqDTO req) {
		UpdateShoppingCartResDTO res = new UpdateShoppingCartResDTO();
		
		res.setAmount(req.getAmount());
		res.setIdProducts(req.getIdProducts());
		res.setIdShoppingCart(req.getIdShoppingCart());
		res.setNameUser(req.getNameUser());
		res.setTypeProducts(req.getTypeProducts());
		
		return res;
	}

	@Override
	public DeleteShoppingCartResDTO deleteformOfShoppingCart(DeleteShoppingCartReqDTO req) {
		
		DeleteShoppingCartResDTO res = new DeleteShoppingCartResDTO();
		
		res.setAmount(req.getAmount());
		res.setIdProducts(req.getIdProducts());
		res.setIdShoppingCart(req.getIdShoppingCart());
		res.setNameUser(req.getNameUser());
		res.setTypeProducts(req.getTypeProducts());
		
		return null;
	}

}
