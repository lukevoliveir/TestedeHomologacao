package com.br.project.interfaces;

import org.springframework.http.ResponseEntity;

import com.br.project.dto.PaymenteReqDTO;
import com.br.project.dto.PaymenteResDTO;
import com.br.project.integrationobjects.TransferObject;

/**
 * Servico disponivel para a forma de pagamento
 * 
 * @author lucas.vale
 *
 *
 */

public interface PaymenteResourcesSignature {
	
	/**
	 * @author lucas.vale
	 * @param req
	 * @return 
	 */
	
	public ResponseEntity<TransferObject<PaymenteResDTO>> formOfPaymente(PaymenteReqDTO req);

}
