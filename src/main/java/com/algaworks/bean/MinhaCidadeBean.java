package com.algaworks.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class MinhaCidadeBean {
	private String cidadeNatal;
	private List<String> todasCidades;
	
	public MinhaCidadeBean() {
		this.todasCidades = new ArrayList<>();
		this.todasCidades.add("Maceio-AL");
		this.todasCidades.add("Marechal Deodoro-AL");
		this.todasCidades.add("Sao Miguel dos Campos-AL");
		this.todasCidades.add("Arapiraca-AL");
	}

	public String getCidadeNatal() {
		return cidadeNatal;
	}

	public void setCidadeNatal(String cidadeNatal) {
		this.cidadeNatal = cidadeNatal;
	}

	public List<String> getTodasCidades() {
		return todasCidades;
	}

	public void setTodasCidades(List<String> todasCidades) {
		this.todasCidades = todasCidades;
	}
	
}
