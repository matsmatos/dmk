package com.dmk.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmk.models.Funcionario;
import com.dmk.response.Response;
import com.dmk.services.FuncionarioSevice;

@RestController
@RequestMapping("/dmk/funcionario")
@CrossOrigin(origins = "*")

public class FuncionarioController {

	private static final Logger log = LoggerFactory.getLogger(FuncionarioController.class);

	@Autowired
	private FuncionarioSevice funcionarioService;

	@PostMapping(value = "/{funcionario}")
	public ResponseEntity<Response<Funcionario>> criarFuncionario(@RequestBody Funcionario funcionario) {

		Response<Funcionario> response = new Response<Funcionario>();
		Optional<Funcionario> funcionario1 = funcionarioService.criarFuncionario(funcionario);

		if (!funcionario1.isPresent()) {
			log.info("Produto não encontrado para o ID: {}");
			response.getErrors().add("Produto não encontrado para o ID ");
			return ResponseEntity.badRequest().body(response);
		}

		response.setData(funcionario1.get());
		return ResponseEntity.ok(response);

	}
}
