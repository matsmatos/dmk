package com.dmk.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CDTB_PRODUTO_PROD")
public class Produto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 369105332639487699L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "PROD_ID", nullable = false)
	private Long id; 
	@Column(name = "PROD_DESCRICAO", nullable = false)
	private String descricao;
	@Column(name = "PROD_VALOR", nullable = false)
	private BigDecimal valor;
	@Column(name = "PROD_TAM", nullable = false)
	private String tam;
	@Column(name = "PROD_COR", nullable = false)
	private String cor;
	
	

	public String getTam() {
		return tam;
	}

	public void setTam(String tam) {
		this.tam = tam;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	
	
	
}
