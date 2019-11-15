package com.br.project.constants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;


/**
 * Classe responsável por disponibilizar todas as informações de configuração do Swagger
 * 
 * @author Lucas Vale
 * @since 28/10/2019
 * @version 1.0.0
 *
 */


@Component
public class SwaggerConfiguration {
	
	private static final String path = "com.br.project.swagger.";
	
	@Autowired
	private ConfigurableEnvironment configurableEnvironment;

	public ConfigurableEnvironment getConfigurableEnvironment() {
		return configurableEnvironment;
	}

	public String getTitle() {
		return configurableEnvironment.getProperty(path.concat("title"));
	}

	public String getDescription() {
		return configurableEnvironment.getProperty(path.concat("description"));
	}

	public String getVersion() {
		return configurableEnvironment.getProperty(path.concat("version"));
	}

	public String getTermsOfServiceUrl() {
		return configurableEnvironment.getProperty(path.concat("termsOfServiceUrl"));
	}

	public String getLicense() {
		return configurableEnvironment.getProperty(path.concat("license"));
	}

	public String getLicenseUrl() {
		return configurableEnvironment.getProperty(path.concat("licenseUrl"));
	}

	public String getBasePackage() {
		return configurableEnvironment.getProperty(path.concat("basePackage"));
	}

	public String getVendorExtensions() {
		return configurableEnvironment.getProperty(path.concat("vendorExtensions"));
	}

	public String getName() {
		return configurableEnvironment.getProperty(path.concat("contact.name"));
	}

	public String getUrl() {
		return configurableEnvironment.getProperty(path.concat("contact.url"));
	}

	public String getEmail() {
		return configurableEnvironment.getProperty(path.concat("contact.email"));
	}
	

}
