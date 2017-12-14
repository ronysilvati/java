package com.algaworks.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="lancamento")
public class Lancamento {
	private Long id;
	private Pessoa pessoa;
	private String descricao;
	private BigDecimal valor;
	private TipoLancamento tipo;
	private Date dataVencimento;
	private Date dataPagamento;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne (optional=false)
	@JoinColumn(name="pessoa_id")
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	@Column (length=80,nullable=false)
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Column (precision=10,scale=2,nullable=false)
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	public TipoLancamento getTipo() {
		return tipo;
	}
	public void setTipo(TipoLancamento tipo) {
		this.tipo = tipo;
	}
	
	
	@Temporal(value=TemporalType.DATE)
	@Column (name="data_vencimento",nullable=true)
	public Date getDataVencimento() {
		return dataVencimento;
	}
	
	
	public void setDataVencimento(Date date) {
		this.dataVencimento = (Date) date;
	}
	
	
	@Temporal(value=TemporalType.DATE)
	@Column (name="data_pagamento",nullable=true)
	public Date getDataPagamento() {
		return dataPagamento;
	}
	
	public void setDataPagamento(Date date) {
		this.dataPagamento = date;
	}

	
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	Lancamento other = (Lancamento) obj;
	if (id == null) {
	if (other.id != null)
	return false;
	} else if (!id.equals(other.id))
	return false;
	return true;
	}
}
