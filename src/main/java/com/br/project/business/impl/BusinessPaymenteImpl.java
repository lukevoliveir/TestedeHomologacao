package com.br.project.business.impl;

import org.springframework.stereotype.Service;

import com.br.project.business.BusinessPaymente;
import com.br.project.dto.DeletePayementeResDTO;
import com.br.project.dto.DeletePaymenteReqDTO;
import com.br.project.dto.PaymenteRegisterReqDTO;
import com.br.project.dto.PaymenteRegisterResDTO;
import com.br.project.dto.UpdatePaymenteReqDTO;
import com.br.project.dto.UpdatePaymenteResDTO;

@Service
public class BusinessPaymenteImpl implements BusinessPaymente{

	@Override
	public PaymenteRegisterResDTO formOfPaymente(PaymenteRegisterReqDTO req) {
		
		PaymenteRegisterResDTO res = new PaymenteRegisterResDTO();
		
		res.setId(req.getId());
		res.setPaymente(req.getPaymente());
		res.setType(req.getType());
		
		return res;
	}

	@Override
	public UpdatePaymenteResDTO updateFormPaymente(UpdatePaymenteReqDTO req) {
		UpdatePaymenteResDTO res = new UpdatePaymenteResDTO();
		
		res.setId(req.getId());
		res.setPaymente(req.getPaymente());
		res.setType(req.getType());
		
		return res;
	}

	@Override
	public DeletePayementeResDTO deleteFormPaymente(DeletePaymenteReqDTO req) {
		DeletePayementeResDTO res = new DeletePayementeResDTO();
		
		res.setId(req.getId());
		res.setPaymente(req.getPaymente());
		res.setType(req.getType());
		
		return null;
	}
	
	
	

}
