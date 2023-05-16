package com.examplo.demo.folhapgto.entities;

import java.io.Serializable;

public class Pagamento implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private Double rendadiaria;
	private Integer dias;
	
	public Pagamento() {
		
	}

	public Pagamento(String nome, Double rendadiaria, Integer dias) {
		super();
		this.nome = nome;
		this.rendadiaria = rendadiaria;
		this.dias = dias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendadiaria() {
		return rendadiaria;
	}

	public void setRendadiaria(Double rendadiaria) {
		this.rendadiaria = rendadiaria;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}
public double getTotal() {
	
	return dias * rendadiaria;
	
}
}
