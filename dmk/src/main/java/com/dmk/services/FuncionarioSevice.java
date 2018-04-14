package com.dmk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmk.models.Funcionario;
import com.dmk.repositories.FuncionarioRepository;

@Service
public class FuncionarioSevice {

	@Autowired
	FuncionarioRepository funcionarioRepository;

	public Optional<Funcionario> criarFuncionario(Funcionario funcionario) {

		this.funcionarioRepository.save(funcionario);

		return Optional.ofNullable(funcionario);

	}

	public Optional<List<Funcionario>> listaFuncionario() {

		return Optional.of(this.funcionarioRepository.findAll());

	}
}
