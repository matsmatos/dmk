package com.dmk.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CDTB_VENDA_VEND")
public class Venda implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5579504774163637764L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "VEND_ID", nullable = false)
	private int id;
	@OneToMany()
	@JoinColumn(name = "PROD_ID")
	private List<Produto> produtos;
	@OneToOne()
	@JoinColumn(name = "CLIE_ID")
	private Cliente cliente;
	@OneToOne()
	@JoinColumn(name = "FUNC_ID")
	private Funcionario funcionario;
	@Column(name = "VEND_DT_VENDA", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date dtVenda;
	@Column(name = "VEND_TOTAL", nullable = false )
	private BigDecimal total;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Date getDtVenda() {
		return dtVenda;
	}
	public void setDtVenda(Date dtVenda) {
		this.dtVenda = dtVenda;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
