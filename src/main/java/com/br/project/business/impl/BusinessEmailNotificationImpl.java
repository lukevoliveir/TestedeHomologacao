package com.br.project.business.impl;

import org.springframework.stereotype.Service;

import com.br.project.business.BusinessEmailNotification;
import com.br.project.dto.EmailNotificationReqDTO;
import com.br.project.dto.EmailNotificationResDTO;

@Service
public class BusinessEmailNotificationImpl implements BusinessEmailNotification{

	@Override
	public EmailNotificationResDTO noticationEmail(EmailNotificationReqDTO req) {
		

		return null;
	}

}
