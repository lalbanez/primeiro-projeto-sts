package com.leandro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandro.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	Empresa findByCnpj(String cnpj);
}
