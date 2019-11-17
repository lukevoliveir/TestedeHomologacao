package com.br.project.business;

import org.springframework.stereotype.Service;

import com.br.project.dto.EmailNotificationReqDTO;
import com.br.project.dto.EmailNotificationResDTO;

/**
 *  mentos pra envio de e-mail
 * @author lucas.vale
 *
 */

@Service
public interface BusinessEmailNotification {
	
	/**
	 * 
	 * @param req
	 * @return
	 */
	
	EmailNotificationResDTO noticationEmail(EmailNotificationReqDTO req);

}
