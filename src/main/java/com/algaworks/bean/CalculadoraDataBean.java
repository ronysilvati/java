package com.algaworks.bean;

import java.sql.Date;
import java.util.Calendar;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculadoraDataBean {
	private java.util.Date dataBase;
	private Integer dias;
	private java.util.Date resultado;
	
	public void adicionar() {
		
		Calendar dataCalculo = Calendar.getInstance();
		dataCalculo.setTime(this.dataBase);
		dataCalculo.add(Calendar.DAY_OF_MONTH,dias);
		
		this.resultado = dataCalculo.getTime();

	}

	public java.util.Date getDataBase() {
		return dataBase;
	}

	public void setDataBase(java.util.Date dataBase) {
		this.dataBase = dataBase;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

	public java.util.Date getResultado() {
		return resultado;
	}

	public void setResultado(java.util.Date resultado) {
		this.resultado = resultado;
	}

}
