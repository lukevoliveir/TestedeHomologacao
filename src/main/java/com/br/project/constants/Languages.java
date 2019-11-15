package com.br.project.constants;

public enum Languages {

	PT("messages_pt_BR"), EN("messages_en_US");
	
	private String language;
	
	private Languages(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}
	
}
