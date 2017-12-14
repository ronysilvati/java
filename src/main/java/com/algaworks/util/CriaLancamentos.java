package com.algaworks.util;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.algaworks.model.Lancamento;
import com.algaworks.model.Pessoa;
import com.algaworks.model.TipoLancamento;

public class CriaLancamentos {
	public static void main(String[] args) {
		/*
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		
		Date dataVencimento1 = new Date(2017,1,1);

		
		Date dataVencimento2 = new Date(2017,1,1);
		
		Pessoa cliente = new Pessoa();
		cliente.setNome("WWW INDUSTRIA DE ALIMENTOS");
		
		Pessoa fornecedor = new Pessoa();
		fornecedor.setNome("FORNECEDOR NOME");
		
		Lancamento lancamento1 = new Lancamento();
		lancamento1.setDescricao("VENDA DE SOFTWARE");
		lancamento1.setPessoa(cliente);
		//lancamento1.setDataVencimento(dataVencimento1);
		//lancamento1.setDataPagamento(dataVencimento1);
		lancamento1.setValor(new BigDecimal(103_000));
		lancamento1.setTipo(TipoLancamento.RECEITA);
		
		Lancamento lancamento2 = new Lancamento();
		lancamento2.setDescricao("VENDA DE SOFTWARE SEGUNDA VERSAO");
		lancamento2.setPessoa(cliente);
		//lancamento2.setDataVencimento(dataVencimento1);
		//lancamento2.setDataPagamento(dataVencimento1);
		lancamento2.setValor(new BigDecimal(103_000));
		lancamento2.setTipo(TipoLancamento.RECEITA);
		
		manager.persist(cliente);
		manager.persist(fornecedor);
		manager.persist(lancamento1);
		manager.persist(lancamento2);
		
		trx.commit();
		manager.close();
		*/
	}
}
