package com.dmk.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CDTB_CLIENTE_CLIE")
public class Cliente implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2500156709779119394L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "CLIE_ID")
	private Long id;
	@Column(name = "CLIE_NOME", nullable = false)
	private String nome;
	@Column(name = "CLIE_EMAIL", nullable = false)
	private String email;
	@Column(name = "CLIE_REDESSOCIAIS")
	private String redesSociais;
	@Column(name = "CLIE_DT_CADASTRO", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date dtCadastro;
	@Column(name = "CLIE_TELEFONE")
	private String telefone;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRedesSociais() {
		return redesSociais;
	}
	public void setRedesSociais(String redesSociais) {
		this.redesSociais = redesSociais;
	}
	public Date getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



}
