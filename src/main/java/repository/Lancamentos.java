package repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.algaworks.model.Lancamento;


public class Lancamentos {
	private EntityManager manager;
	
	public Lancamentos(EntityManager manager) {
		this.manager = manager;
	}
	
	public List<Lancamento> todos(){
		TypedQuery<Lancamento> query = manager.createQuery("from Lancamento",Lancamento.class);
		
		return query.getResultList();
	}
}
