package com.br.project.business.impl;

import org.springframework.stereotype.Service;

import com.br.project.business.BusinessUser;
import com.br.project.dto.CreateUserReqDTO;
import com.br.project.dto.CreateUserResDTO;
import com.br.project.dto.DeleteUserReqDTO;
import com.br.project.dto.DeleteUserResDTO;
import com.br.project.dto.UpdateUserReqDTO;
import com.br.project.dto.UpdateUserResDTO;

@Service
public class BusinessUserImpl implements BusinessUser {

	@Override
	public CreateUserResDTO formOfUser(CreateUserReqDTO req) {
		CreateUserResDTO res = new CreateUserResDTO();
		
		res.setIdUser(req.getIdUser());
		res.setEmail(req.getEmail());
		res.setCpf(req.getCpf());
		res.setName(req.getName());
		res.setPhone(req.getPhone());
		res.setTypeUser(req.getTypeUser());
		
		return res;
	}

	@Override
	public UpdateUserResDTO updateOfUser(UpdateUserReqDTO req) {
		
		UpdateUserResDTO res = new UpdateUserResDTO();
		
		res.setIdUser(req.getIdUser());
		res.setEmail(req.getEmail());
		res.setCpf(req.getCpf());
		res.setName(req.getName());
		res.setPhone(req.getPhone());
		res.setTypeUser(req.getTypeUser());
		
		return res;
	}

	@Override
	public DeleteUserResDTO deleteOfUser(DeleteUserReqDTO req) {
		
		DeleteUserResDTO res = new DeleteUserResDTO();
		
		res.setIdUser(req.getIdUser());
		res.setEmail(req.getEmail());
		res.setCpf(req.getCpf());
		res.setName(req.getName());
		res.setPhone(req.getPhone());
		res.setTypeUser(req.getTypeUser());
		
		return res;
	}

}
