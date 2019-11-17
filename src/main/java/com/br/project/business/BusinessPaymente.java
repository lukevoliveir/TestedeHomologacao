package com.br.project.business;

import org.springframework.stereotype.Service;

import com.br.project.business.impl.BusinessPaymenteImpl;
import com.br.project.dto.DeletePayementeResDTO;
import com.br.project.dto.DeletePaymenteReqDTO;
import com.br.project.dto.PaymenteRegisterReqDTO;
import com.br.project.dto.PaymenteRegisterResDTO;
import com.br.project.dto.UpdatePaymenteReqDTO;
import com.br.project.dto.UpdatePaymenteResDTO;



/**
 * 
 *  Metodo de tipos de pagamentos
 * 
 * @author lucas.vale
 *  @see BusinessPaymenteImpl
 */

@Service
public interface BusinessPaymente {
	
	/**
	 * 
	 * Serviço que cadastra o pagamento
	 * @param req
	 * @return
	 * @see BusinessPaymenteImpl
	 * 
	 */
		
	PaymenteRegisterResDTO formOfPaymente(PaymenteRegisterReqDTO req);
	
	/**
	 * 
	 * Serviço que atualiza a forma de pagamento
	 * @param req
	 * @return
	 * @see BusinessPaymenteImpl
	 * 
	 */
	
	UpdatePaymenteResDTO updateFormPaymente(UpdatePaymenteReqDTO req);
	
	
	/**
	 * 
	 * Serviço que deleta a forma de pagamento
	 * @param req
	 * @return
	 * @see BusinessPaymenteImpl
	 * 
	 */
	
	DeletePayementeResDTO deleteFormPaymente(DeletePaymenteReqDTO req);


}
