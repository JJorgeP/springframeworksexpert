package com.jjpsistem.brewer.model;

public enum Sabor {
	
	ADICICADA("Adocicada"),
	AMARGA("Amarga"),
	FORTE("Forte"),
	FRUTADA("Frutada"),
	SUAVE("Suave");
	
	private String descricao;
	
	Sabor(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
