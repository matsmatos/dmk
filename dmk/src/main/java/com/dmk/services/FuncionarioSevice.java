package com.dmk.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmk.models.Funcionario;
import com.dmk.models.Produto;
import com.dmk.repositories.FuncionarioRepository;

@Service
public class FuncionarioSevice {
	
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	public Optional<Funcionario> criarFuncionario(Funcionario funcionario) {
		
		this.funcionarioRepository.save(funcionario);
		
		return Optional.ofNullable(funcionario);
		
	}
	
}
