package com.algaworks.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.algaworks.model.Lancamento;
import com.algaworks.util.JpaUtil;

@ManagedBean
@ViewScoped
public class ConsultaLancamentosBean {
	private List<Lancamento> lancamentos;
	
	public void consultar() {
		/*
		EntityManager manager = JpaUtil.getEntityManager();
			
	
		TypedQuery<Lancamento> query = manager.createQuery("from lancamento",Lancamento.class);
		
		this.lancamentos = query.getResultList();
		
		manager.close();
		*/
	}
	
	public List<Lancamento> getLancamentos(){
		return lancamentos;
	}
}
