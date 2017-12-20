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
	
	public void adicionar(Lancamento lancamento) {
		this.manager.persist(lancamento);
	}
	
	public List<String> descricoesQueContem (String descricao){
		
		TypedQuery<String> query = this.manager.createQuery("select distinct descricao from Lancamento where upper(descricao) like upper(:descricao)",String.class);
		query.setParameter("descricao","%"+descricao+"%");
		
		return query.getResultList();
	
				
	}
	
	public void ok() {
		System.out.println("--------------------");
	}
	
	public Lancamento porId(Long id) {
		return manager.find(Lancamento.class,id);
	}
	
	public Lancamento guardar(Lancamento lancamento) {
		return this.manager.merge(lancamento);
	}
}
