package com.algaworks.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean (name="cadastro")
@RequestScoped
public class CadastroBean {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void cadastrar() {
		FacesContext context = FacesContext.getCurrentInstance();
		
		FacesMessage mensagem = new FacesMessage(
				FacesMessage.SEVERITY_INFO,"Cadastro efetuado",
				"Cliente "+this.nome+" cadastrado com sucesso"
				);
		
		context.addMessage(null, mensagem);
	}
}
