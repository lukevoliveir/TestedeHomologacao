package com.br.project.constants;


/**
 * Classe responsável por disponibilizar todas as constantes das excpetions
 * 
 * @author Jean Fernandes
 * @since 07/06/2019
 * @version 1.0.0
 * 
 * @see Constants
 *
 */
public abstract class  ExceptionsConstants extends Constants{
	
	public static String errorMessageDefault 		= ExceptionResourceBundle.getString("com.br.project.exception.errorMessageDefault");
	public static String serverSOAPFaultException 	= ExceptionResourceBundle.getString("com.br.project.exception.serverSOAPFaultException");
	public abstract String getErrorMessageDefault();
	
}
