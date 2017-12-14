package com.algaworks.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaBean {
	private String nome;
	private String sobrenome;
	private String nomeCompleto;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public void dizerOla() {
		this.nomeCompleto = this.nome.toUpperCase()+" "+this.sobrenome.toUpperCase();
	}
	
	public String getNomeComplete() {
		return this.nomeCompleto;
	}
}
