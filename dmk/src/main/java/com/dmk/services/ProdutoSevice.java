package com.dmk.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dmk.models.Produto;

@Service
public class ProdutoSevice {
	public Optional<Produto> buscaProduto(Long id) {
		Produto produto = new Produto();
		produto.setId(id);
		return Optional.ofNullable(produto);
	}

	public List<Produto> buscaProdutos() {
		// TODO Auto-generated method stub
		List<Produto> produtos = new ArrayList<>();

		for (long i = 0; i < 10; i++) {
			Produto produto = new Produto();
			produto.setId(i);
			produto.setDescricao("Desc nº " + i);
			produto.setValor(new BigDecimal(20));
			produtos.add(produto);
		}

		return (produtos);
	}
}
