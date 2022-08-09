package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class TesteBasico {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(123, 123);
		ContaPoupanca cp = new ContaPoupanca(321, 321);
		System.out.println(cc);
		System.out.println(cp);

	}

}
