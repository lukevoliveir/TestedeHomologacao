package com.br.project.constants;


/**
 * Classe responsável por disponibilizar todas as constantes dos resources/controllers
 * 
 * @author Lucas Vale
 * @since 01/11/2019
 * @version 1.0.0
 * 
 * @see Constants
 *
 */
public abstract class  ResourceConstants extends Constants{
	
	public static String userNotFound 		= messagesResourceBundle.getString("original.resource.userNotFound");
	public static String saveSuccess 		= messagesResourceBundle.getString("original.resource.saveSuccess");
	public static String deleteSuccess 		= messagesResourceBundle.getString("original.resource.deleteSuccess");
	public static String updateSuccess 		= messagesResourceBundle.getString("original.resource.updateSuccess");
	public static String profileSuccess 	= messagesResourceBundle.getString("original.resource.profileSuccess");
	public static String saveNotSuccess 	= messagesResourceBundle.getString("original.resource.saveNotSuccess");
	public static String deleteNotSuccess 	= messagesResourceBundle.getString("original.resource.deleteNotSuccess");
	public static String updateNotSuccess 	= messagesResourceBundle.getString("original.resource.updateNotSuccess");
	public static String resultNotFound 	= messagesResourceBundle.getString("original.resource.resultNotFound");	
	public static String smsSuccess 		= messagesResourceBundle.getString("original.resource.smsSuccess");
	public static String smsNotSuccess 		= messagesResourceBundle.getString("original.resource.smsNotSuccess");
	
}
