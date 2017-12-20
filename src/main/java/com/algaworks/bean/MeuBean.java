package com.algaworks.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;


@ManagedBean
@RequestScoped
public class MeuBean {
	
	private String nome;
	private int quantidadeCaracteres;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void transformar() {
		this.nome = this.nome.toUpperCase();
		this.quantidadeCaracteres = this.nome.length();
	}
	
	public int getQuantidadeCaracteres() {
		return quantidadeCaracteres;
	}

}
