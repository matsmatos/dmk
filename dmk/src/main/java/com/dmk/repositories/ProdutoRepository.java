package com.dmk.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.dmk.models.Produto;

@Transactional
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	Produto save(Produto produto);

	void delete(Produto produto);

	List findAll();

}
