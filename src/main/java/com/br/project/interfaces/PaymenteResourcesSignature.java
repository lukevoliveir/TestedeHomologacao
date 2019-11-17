package com.br.project.interfaces;

import org.springframework.http.ResponseEntity;

import com.br.project.dto.DeletePayementeResDTO;
import com.br.project.dto.DeletePaymenteReqDTO;
import com.br.project.dto.PaymenteRegisterReqDTO;
import com.br.project.dto.PaymenteRegisterResDTO;
import com.br.project.dto.UpdatePaymenteReqDTO;
import com.br.project.dto.UpdatePaymenteResDTO;
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
	 * 
	 * Metodo de Criar forma de pagamento
	 * @author lucas.vale
	 * @param req
	 * @return 
	 */
	
	public ResponseEntity<TransferObject<PaymenteRegisterResDTO>> formOfPaymente(PaymenteRegisterReqDTO req);
	
	/**
	 * 
	 * Metodo de Atualizar forma de pagamento
	 * @author lucas.vale
	 * @param req
	 * @return 
	 */
	
	public ResponseEntity<TransferObject<UpdatePaymenteResDTO>> updateFormPaymente(UpdatePaymenteReqDTO req);
	
	/**
	 * 
	 * Metodo de Deleta a forma de pagamento
	 * @author lucas.vale
	 * @param req
	 * @return 
	 */
	
	public ResponseEntity<TransferObject<DeletePayementeResDTO>> deleteFormPaymente(DeletePaymenteReqDTO req);
	
	
	
}
