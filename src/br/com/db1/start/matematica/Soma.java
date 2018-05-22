package br.com.db1.start.matematica;

import org.junit.Test;

public class Soma implements OperacaoMatematica {

	@Override
	@Test
	public Double calcula(Double valor1, Double valor2) {
		
		return valor1 + valor2;
	}

}
