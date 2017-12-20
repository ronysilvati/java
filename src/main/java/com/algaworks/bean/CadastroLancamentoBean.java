package com.algaworks.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.algaworks.model.Lancamento;
import com.algaworks.model.Pessoa;
import com.algaworks.model.TipoLancamento;
import com.algaworks.util.JpaUtil;

import repository.CadastroLancamentos;
import repository.Lancamentos;
import repository.NegocioException;
import repository.Pessoas;

@ManagedBean
@ViewScoped
public class CadastroLancamentoBean implements Serializable {
	private static final long serialversionUID = 1L;
	
	@Inject
	private Lancamentos lancamentos;
	private Lancamento lancamento = new Lancamento();
	private List<Pessoa> todasPessoas;
	
	public void prepararCadastro() {
		EntityManager manager = JpaUtil.getEntityManager();
		
		try {
			Pessoas pessoas = new Pessoas(manager);
			this.todasPessoas = pessoas.todas();
		}
		finally {
			manager.close();
		}
	}
	
	public void salvar() {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction trx = manager.getTransaction();
		FacesContext context = FacesContext.getCurrentInstance();
		
		try {
			trx.begin();
			CadastroLancamentos cadastro = new CadastroLancamentos(
						new Lancamentos(manager)
					);
			
			cadastro.salvar(this.lancamento);
			this.lancamento = new Lancamento();
			
			context.addMessage(null, new FacesMessage("Lancamento salvo com sucesso!!!"));
			trx.commit();
		
		}catch(NegocioException e) {
			trx.rollback();
			
			FacesMessage mensagem = new FacesMessage(e.getMessage());
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, mensagem);
		} finally{
			manager.close();
		}
	}
	
	public List<Pessoa> getTodasPessoas(){
		return this.todasPessoas;
	}
	
	public TipoLancamento[] getTiposLancamentos() {
		return TipoLancamento.values();
	}

	public Lancamento getLancamento() {
		return lancamento;
	}

	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}

	public void setTodasPessoas(List<Pessoa> todasPessoas) {
		this.todasPessoas = todasPessoas;
	}
	
	public void dataVencimentoAlterada(AjaxBehaviorEvent event) {
		if(this.lancamento.getDataPagamento() == null) {
			this.lancamento.setDataPagamento(this.lancamento.getDataVencimento());
			System.out.println(this.lancamento.getDataPagamento());
		}
	}
	
	public List<String> pesquisarDescricoes (String descricao){
		EntityManager manager = JpaUtil.getEntityManager();
		this.lancamentos = new Lancamentos(manager);
		return this.lancamentos.descricoesQueContem(descricao);
	}
	
	
}
