package com.algaworks.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import com.algaworks.controller.Livro;

@ManagedBean
@ViewScoped
public class LivrosBean {
	private List<Livro> livros;
	private Livro novoLivro;
	
	public LivrosBean() {
		this.livros = new ArrayList<>();
		this.novoLivro	= new Livro();
	}

	public List<Livro> getLivros() {
		return this.livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	public void adicionar() {
		this.livros.add(this.novoLivro);
		this.novoLivro = new Livro();
	}
	
	public Livro getNovoLivro() {
		return this.novoLivro;
	}
	
}
