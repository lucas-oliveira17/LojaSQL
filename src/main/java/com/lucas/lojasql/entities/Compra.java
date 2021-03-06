package com.lucas.lojasql.entities;

import java.util.List;

public class Compra {

	private Integer id;

	private List<ProdutoComprado> produtosComprados;

	private Cliente cliente;

	private Funcionario funcionario;

	private String formaPagamento;

	private Double valorTotal;

	public Compra(Integer id, List<ProdutoComprado> produtosComprados, Cliente cliente, Funcionario funcionario, String formaPagamento) {
		this.id = id;
		this.produtosComprados = produtosComprados;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.formaPagamento = formaPagamento;
	}
	
	public Compra() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<ProdutoComprado> getProdutosComprados() {
		return produtosComprados;
	}

	public void setProdutosComprados(List<ProdutoComprado> produtosComprados) {
		this.produtosComprados = produtosComprados;
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

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
}
