package com.br.project.constants;

import java.io.FileInputStream;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;


/**
 * Classe responsável por disponibilizar as constantes utilizadas no sistema
 * 
 * @author Lucas Vale
 * @since 01/11/2019
 * @version 1.0.0
 * 
 * @see HttpErrorConstants
 * @see Languages
 * @see ResourceConstants
 * @see SwaggerConstants
 * @see ConfigConstants
 *
 */
public abstract class Constants {
	
	protected static Locale locale = new Locale("pt", "br");
	
	protected static ResourceBundle defaultMessage						= ResourceBundle.getBundle("defaultMessage", locale);
	protected static ResourceBundle messagesResourceBundle 				= getPath("messages_pt_BR.properties");
	protected static ResourceBundle httpErrorResourceBundle 			= getPath("http-message-error_pt_BR.properties");
	protected static ResourceBundle wsdlConfigurationResourceBundle 	= getPath("wsdlConfiguration.properties");
	protected static ResourceBundle configResourceBundle 				= getPath("config.properties");
	protected static ResourceBundle ExceptionResourceBundle 			= getPath("exceptionMessages.properties");
	
	
	private static PropertyResourceBundle getPath(String fileName){
		
		FileInputStream fis = null;
		PropertyResourceBundle propertyResourceBundle = null;
		try {
			String currentPath = defaultMessage.getString("com.project.pathProperties");
			fis = new FileInputStream(currentPath + "/" + fileName);
			propertyResourceBundle = new PropertyResourceBundle(fis);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return propertyResourceBundle;
	}
	
}
