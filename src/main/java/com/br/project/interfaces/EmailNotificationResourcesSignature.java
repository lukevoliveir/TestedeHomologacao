package com.br.project.interfaces;

import org.springframework.http.ResponseEntity;

import com.br.project.dto.EmailNotificationReqDTO;
import com.br.project.dto.EmailNotificationResDTO;
import com.br.project.integrationobjects.TransferObject;


/**
 * Serviço disponivel para os metodo de envio de eamil
 * @author lucas.vale
 *
 */

public interface EmailNotificationResourcesSignature {
	
	/**
	 * 
	 * @param req
	 * @return
	 */
	
	public ResponseEntity<TransferObject<EmailNotificationResDTO>> noticationEmail(EmailNotificationReqDTO req);

}
