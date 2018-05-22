package br.com.db1.start.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.matematica.Dividir;
import br.com.db1.start.matematica.Multiplicar;
import br.com.db1.start.matematica.OperacaoMatematica;
import br.com.db1.start.matematica.Soma;
import br.com.db1.start.matematica.Subtrair;

public class OperadorTest {

	@Test
	public void calcularTest() {

		OperacaoMatematica operacao = new Soma();
		Assert.assertTrue(32 == operacao.calcula(30d, 2d));
		
		operacao = new Subtrair();
		Assert.assertTrue(28 == operacao.calcula(30d, 2d));

		operacao = new Multiplicar();
		Assert.assertTrue(60 == operacao.calcula(30d, 2d));
		
		operacao = new Dividir();
		Assert.assertTrue(15 == operacao.calcula(30d, 2d));

}
}
