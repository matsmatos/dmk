package com.dmk.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.dmk.models.Funcionario;

@Transactional
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	Funcionario save(Funcionario Funcionario);

	void delete(Funcionario Funcionario);

	List findAll();

}
