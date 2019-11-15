package com.br.project.constants;


/**
 * Classe responsável por disponibilizar todas as constantes dos resources/controllers
 * 
 * @author Jean Fernandes
 * @since 27/05/2019
 * @version 1.0.0
 * 
 * @see Constants
 *
 */
public abstract class ConfigConstants extends Constants{
	
	// USUÁRIO DEFAULT
	public static String securityUsername = configResourceBundle.getString("com.project.security.username");
	public static String securityPassword = configResourceBundle.getString("com.project.security.password");
	
	// CONFIGURAÇÃO DO TOKEN
	public static String tokenExpirationTimeMillis 	= configResourceBundle.getString("com.project.token.expirationtimemillis");
	public static String tokenExpirationTimeHours 	= configResourceBundle.getString("com.project.token.expirationtimehours");
	public static String tokenExpirationTimeDays 	= configResourceBundle.getString("com.project.token.expirationtimedays");
	public static String tokenExpirationTimeYears 	= configResourceBundle.getString("com.project.token.expirationtimeyears");
	public static String tokenSecret 				= configResourceBundle.getString("com.project.token.secret");
	public static String tokenPrefix 				= configResourceBundle.getString("com.project.token.prefix");
	public static String tokenHeader 				= configResourceBundle.getString("com.project.token.header");
	
	public ConfigConstants() {
		
	}
	
}
