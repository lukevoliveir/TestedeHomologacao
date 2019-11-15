package com.br.project.exceptions;

import java.net.ConnectException;
import java.net.URISyntaxException;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.SOAPFaultException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

import com.fasterxml.jackson.core.JsonParseException;

import com.br.project.exceptions.StandardError;
import io.jsonwebtoken.MalformedJwtException;

/**
 * Classe que filtra todas as exceptions disparadas pela aplicação
 * 
 * @author Lucas Vale
 * @since 07/06/2019
 * @version 1.0.0
 *
 */

@ControllerAdvice
public class ResourceExceptionHandler {
	private static final Logger log = LoggerFactory.getLogger(ResourceExceptionHandler.class);

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<StandardError> methodArgumentNotValid(MethodArgumentNotValidException e,
			HttpServletRequest request) {

		log.error("Exceção a ser lançada quando a validação em um argumento anotado com @Valid falha.");
		ValidationError err = new ValidationError(HttpStatus.BAD_REQUEST.value(),
				"Exceção a ser lançada quando a validação em um argumento anotado com @Valid falha.", LocalDateTime.now(), e.getMessage(), 0, e);

		for (FieldError fe : e.getBindingResult().getFieldErrors()) {
			err.addError(fe.getField(), fe.getDefaultMessage());
		}
		log.error(err.getMessage());
		log.error("Exceção do tipo MethodArgumentNotValidException: ", e);

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
	}

	@ExceptionHandler(HttpClientErrorException.class)
	public ResponseEntity<StandardError> httpClientError(HttpClientErrorException e, HttpServletRequest request) {

		log.error("Exceção lançada quando um HTTP 4xx é recebido");
		ValidationError err = new ValidationError(HttpStatus.BAD_REQUEST.value(),
				"Exceção lançada quando um HTTP 4xx é recebido", LocalDateTime.now(), e.getMessage(), 0, e);
		log.error(err.getMessage());
		log.error("Exceção do tipo HttpClientErrorException: ", e);

		return ResponseEntity.status(e.getStatusCode()).body(err);
	}

	@ExceptionHandler(FieldRequiredException.class)
	public ResponseEntity<StandardError> fieldRequired(FieldRequiredException e, HttpServletRequest request) {

		log.error("Exceção lançada para campos obrigatórios na requisição");
		ValidationError err = new ValidationError(HttpStatus.BAD_REQUEST.value(),
				"Exceção lançada para campos obrigatórios na requisição", LocalDateTime.now(), e.getMessage(), 0, e);
		err.setErrors(e.getFieldMessages());

		log.error(err.getMessage());
		log.error("Exceção do tipo FieldRequiredException: ", e);

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);

	}

	@ExceptionHandler(URISyntaxException.class)
	public ResponseEntity<StandardError> uRISyntax(URISyntaxException e, HttpServletRequest request) {

		log.error("Exceção lançada para indicar que uma sequência não pôde ser analisada como uma referência de URI");
		ValidationError err = new ValidationError(HttpStatus.BAD_REQUEST.value(),
				"Exceção lançada para indicar que uma sequência não pôde ser analisada como uma referência de URI",
				LocalDateTime.now(), e.getMessage(), 0, e);
		log.error(err.getMessage());
		log.error("Exception do tipo URISyntaxException: ", e);

		return ResponseEntity.status(HttpStatus.URI_TOO_LONG.value()).body(err);

	}

	@ExceptionHandler(BusinessGenericException.class)
	public ResponseEntity<StandardError> uRISyntax(BusinessGenericException e, HttpServletRequest request) {

		log.error("Erro do tipo Exception filtrada pela BusinessGeneric, erro genérico");
		ValidationError err = new ValidationError(HttpStatus.BAD_REQUEST.value(),
				"Erro do tipo Exception filtrada pela BusinessGeneric, erro genérico", LocalDateTime.now(),
				e.getMessage(), 0, e);
		log.error(err.getMessage());
		log.error("Exceção do tipo BusinessGenericException: ", e);

		return ResponseEntity.status(HttpStatus.URI_TOO_LONG.value()).body(err);

	}

	@ExceptionHandler(SOAPFaultException.class)
	public ResponseEntity<StandardError> uRISyntax(SOAPFaultException e, HttpServletRequest request) {

		log.error("Ocorreu uma falha na requisição dos serviços SOAP");
		ValidationError err = new ValidationError(HttpStatus.BAD_REQUEST.value(),
				"Ocorreu uma falha na requisição dos serviços SOAP", LocalDateTime.now(), e.getMessage(), 0, e);
		log.error(err.getMessage());
		log.error("Exceção do tipo SOAPFaultException: ", e);

		return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(err);

	}

	@ExceptionHandler(ConnectException.class)
	public ResponseEntity<StandardError> uRISyntax(ConnectException e, HttpServletRequest request) {

		log.error(
				"Ocorreu um erro ao tentar conectar um socket a um endereço e porta remotos. Conexão era recusada remotamente (Nenhum processo está escutando no endereço / porta remotos)");
		ValidationError err = new ValidationError(HttpStatus.GATEWAY_TIMEOUT.value(),
				"Ocorreu um erro ao tentar conectar um socket a um endereço e porta remotos. Conexão era recusada remotamente (Nenhum processo está escutando no endereço / porta remotos)",
				LocalDateTime.now(), e.getMessage(), 0, e);
		log.error(err.getMessage());
		log.error("Exceção do tipo ConnectException: ", e);

		return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT.value()).body(err);

	}

	@ExceptionHandler(WebServiceException.class)
	public ResponseEntity<StandardError> uRISyntax(WebServiceException e, HttpServletRequest request) {

		log.error("Falha no processamento da solicitação");
		ValidationError err = new ValidationError(HttpStatus.GATEWAY_TIMEOUT.value(),
				"Falha no processamento da solicitação", LocalDateTime.now(), e.getMessage(), 0, e);
		log.error(err.getMessage());
		log.error("Exceção do tipo WebServiceException: ", e);

		return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT.value()).body(err);

	}

	@ExceptionHandler(MalformedJwtException.class)
	public ResponseEntity<StandardError> uRISyntax(MalformedJwtException e, HttpServletRequest request) {

		log.error("Exceção indicando que um JWT não foi construído corretamente e deve ser rejeitado");
		ValidationError err = new ValidationError(HttpStatus.BAD_REQUEST.value(),
				"Exceção indicando que um JWT não foi construído corretamente e deve ser rejeitado",
				LocalDateTime.now(), e.getMessage(), 0, e);
		log.error(err.getMessage());
		log.error("Exceção do tipo MalformedJwtException: ", e);

		return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(err);

	}

	@ExceptionHandler(JsonParseException.class)
	public ResponseEntity<StandardError> uRISyntax(JsonParseException e, HttpServletRequest request) {

		log.error("A sintaxe JSON não está em conforme com a especificação");
		ValidationError err = new ValidationError(HttpStatus.BAD_REQUEST.value(),
				"A sintaxe JSON não está em conforme com a especificação", LocalDateTime.now(), e.getMessage(), 0, e);
		log.error(err.getMessage());
		log.error("Exceção do tipo JsonParseException: ", e);

		return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(err);

	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<StandardError> uRISyntax(Exception e, HttpServletRequest request) {

		log.error("Exceção retornada quando não existe tratamento específico para o erro");
		ValidationError err = new ValidationError(HttpStatus.BAD_REQUEST.value(),
				"Exceção retornada quando não existe tratamento específico para o erro", LocalDateTime.now(),
				e.getMessage(), 0, e);
		log.error(err.getMessage());
		log.error("Exceção do tipo Exception: ", e);

		return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(err);

	}

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<StandardError> uRISyntax(IllegalArgumentException e, HttpServletRequest request) {

		log.error("Método recebeu um argumento ilegal ou inadequado");
		ValidationError err = new ValidationError(HttpStatus.BAD_REQUEST.value(),
				"Método recebeu um argumento ilegal ou inadequado", LocalDateTime.now(), e.getMessage(), 0, e);
		log.error(err.getMessage());
		log.error("Exceção do tipo IllegalArgumentException: ", e);

		return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(err);

	}
}
