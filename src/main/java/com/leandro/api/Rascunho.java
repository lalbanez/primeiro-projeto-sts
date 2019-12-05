package com.leandro.api;

import org.springframework.beans.factory.annotation.Value;

public class Rascunho {
	
	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPaginas;

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	
}
