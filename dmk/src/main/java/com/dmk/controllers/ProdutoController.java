package com.dmk.controllers;

import java.util.List;
import java.util.Optional;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmk.models.Produto;
import com.dmk.response.Response;
import com.dmk.services.ProdutoSevice;

@RestController
@RequestMapping("/dmk/produto")
@CrossOrigin(origins = "*")
public class ProdutoController {

	private static final Logger log = LoggerFactory.getLogger(ProdutoController.class);

	@Autowired
	private ProdutoSevice produtoService;

	@GetMapping(value = "/produto/{id}")
	public ResponseEntity<Response<Produto>> buscarProduto(@PathVariable("id") Long id) {
		log.info("Buscando produto por ID: {}", id);
		Response<Produto> response = new Response<Produto>();
		Optional<Produto> produto = produtoService.buscaProduto(id);

		if (!produto.isPresent()) {
			log.info("Produto não encontrado para o ID: {}", id);
			response.getErrors().add("Produto não encontrado para o ID " + id);
			return ResponseEntity.badRequest().body(response);
		}

		response.setData(produto.get());
		return ResponseEntity.ok(response);
	}

	@GetMapping(value = "/produtos")
	public ResponseEntity<Response<Optional<List<Produto>>>> buscarProdutos() {
		log.info("Buscando produto");
		Response<Optional<List<Produto>>> response = new Response<Optional<List<Produto>>>();
		Optional<List<Produto>> produto = produtoService.buscaProdutos();

		if (!produto.isPresent()) {
			log.info("Produtos não encontrados");
			return ResponseEntity.badRequest().body(response);
		}
		response.setData(produto);
		return ResponseEntity.ok(response);
	}

}
