package com.br.project.business;

import org.springframework.stereotype.Service;

import com.br.project.business.impl.BussinessPaymenteImpl;
import com.br.project.dto.PaymenteReqDTO;
import com.br.project.dto.PaymenteResDTO;



/**
 * 
 * @author lucas.vale
 *  @see BussinessPaymenteImpl
 */

@Service
public interface BussinessPaymente {
	
	
	

	PaymenteResDTO formOfPaymente(PaymenteReqDTO req);
		


}
