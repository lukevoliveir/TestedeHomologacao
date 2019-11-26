package com.br.project.business.impl;

import org.springframework.stereotype.Service;

import com.br.project.business.BusinessProducts;
import com.br.project.dto.CreateProductsReqDTO;
import com.br.project.dto.CreateProductsResDTO;
import com.br.project.dto.DeleteProductsReqDTO;
import com.br.project.dto.DeleteProductsResDTO;
import com.br.project.dto.UpdateProductsReqDTO;
import com.br.project.dto.UpdateProductsResDTO;

@Service
public class BusinessProductsImpl implements BusinessProducts {

	@Override
	public CreateProductsResDTO formOfProducts(CreateProductsReqDTO req) {
		CreateProductsResDTO res = new CreateProductsResDTO();
		
		res.setAmount(req.getAmount());
		res.setId(req.getId());
		res.setNameProducts(req.getTypeProducts());
		res.setTypeProducts(req.getTypeProducts());
		res.setValue(req.getValue());
		
		return res;
	}

	@Override
	public UpdateProductsResDTO updateFormProducts(UpdateProductsReqDTO req) {
		UpdateProductsResDTO res = new UpdateProductsResDTO();
		
		res.setAmount(req.getAmount());
		res.setId(req.getId());
		res.setNameProducts(req.getTypeProducts());
		res.setTypeProducts(req.getTypeProducts());
		res.setValue(req.getValue());
		
		return res;
	}

	@Override
	public DeleteProductsResDTO deleteFormProducts(DeleteProductsReqDTO req) {
		
		DeleteProductsResDTO res = new DeleteProductsResDTO();
		
		res.setAmount(req.getAmount());
		res.setId(req.getId());
		res.setNameProducts(req.getTypeProducts());
		res.setTypeProducts(req.getTypeProducts());
		res.setValue(req.getValue());
		
		return null;
	}

}
