package br.com.db1.start.matematica;

import org.junit.Test;

public class Subtrair implements OperacaoMatematica {

	@Override
	public Double calcula(Double valor1, Double valor2) {
		
		return valor1 - valor2;
	}

	

}
