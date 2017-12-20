package com.algaworks.model;

public enum TipoLancamento {
	RECEITA("Receita"),
	DESPEZA("Despeza");
	
	private String descricao;
	
	TipoLancamento(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
