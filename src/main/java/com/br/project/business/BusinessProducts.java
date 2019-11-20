package com.br.project.business;

import org.springframework.stereotype.Service;

import com.br.project.dto.CreateProductsReqDTO;
import com.br.project.dto.CreateProductsResDTO;
import com.br.project.dto.DeleteProductsReqDTO;
import com.br.project.dto.DeleteProductsResDTO;
import com.br.project.dto.UpdateProductsReqDTO;
import com.br.project.dto.UpdateProductsResDTO;

@Service
public interface BusinessProducts {
	
	CreateProductsResDTO formOfProducts(CreateProductsReqDTO req);
	
	UpdateProductsResDTO updateFormProducts(UpdateProductsReqDTO req);
	
	DeleteProductsResDTO deleteFormProducts(DeleteProductsReqDTO req);
	
	
}
