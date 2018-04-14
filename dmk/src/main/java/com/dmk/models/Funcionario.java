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
@Table(name = "CDTB_FUNCIONARIO_FUNC")
public class Funcionario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7784691340022407537L;

	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "FUNC_ID", nullable = false)
	private Long id;
	@Column(name = "FUNC_NOME", nullable = false)
	private String nome;
	@Column(name = "FUNC_CPF", nullable = false)
	private String cpf;
	@Column(name = "FUNC_DT_NASCIMENTO", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date dtNasc;
	@Column(name = "FUNC_LOGIN", nullable = false)
	private String login;
	@Column(name = "FUNC_PASSWD", nullable = false)
	private String senha;
	
	
	public Long getId() {
		return id;
	}
	public void setId(final Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(final String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(final String cpf) {
		this.cpf = cpf;
	}
	public Date getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(final Date dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(final String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(final String senha) {
		this.senha = senha;
	}
	
	
}
