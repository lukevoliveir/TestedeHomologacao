package com.br.project.constants;

/**
 * Classe responsável por disponibilizar todas as constantes de configuração do Swagger
 * 
 * @author Lucas Vale
 * @since 01/01/2019
 * @version 1.0.0
 * 
 * @see Constants
 *
 */
public abstract class  SwaggerConstants extends Constants{
	
	public static String title 				= messagesResourceBundle.getString("original.swagger.title");
	public static String description 		= messagesResourceBundle.getString("original.swagger.description");
	public static String version 			= messagesResourceBundle.getString("original.swagger.version");
	public static String termsOfServiceUrl 	= messagesResourceBundle.getString("original.swagger.termsOfServiceUrl");
	public static String license 			= messagesResourceBundle.getString("original.swagger.license");
	public static String licenseUrl			= messagesResourceBundle.getString("original.swagger.licenseUrl");
	public static String basePackage		= messagesResourceBundle.getString("original.swagger.basePackage");
	public static String vendorExtensions 	= messagesResourceBundle.getString("original.swagger.vendorExtensions");
	public static String name 				= messagesResourceBundle.getString("original.swagger.contact.name");
	public static String url 				= messagesResourceBundle.getString("original.swagger.contact.url");
	public static String email 				= messagesResourceBundle.getString("original.swagger.contact.email");
	
	public SwaggerConstants() {
		
	}
	
}
