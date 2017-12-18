package com.algaworks.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.algaworks.model.Lancamento;
import com.algaworks.util.JpaUtil;

import repository.Lancamentos;

@ManagedBean
@ViewScoped
public class ConsultaLancamentosBean {
	private List<Lancamento> lancamentos;
	
	public void consultar() {
		
		EntityManager manager = JpaUtil.getEntityManager();
		Lancamentos lancamentos = new Lancamentos(manager);
		
		this.lancamentos = lancamentos.todos();
		
		manager.close();
		
	}
	
	public List<Lancamento> getLancamentos(){
		return lancamentos;
	}
}
