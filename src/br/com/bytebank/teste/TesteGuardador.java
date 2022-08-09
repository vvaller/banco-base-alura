package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.GuardaContas;

public class TesteGuardador {

	public static void main(String[] args) {

		GuardaContas guardar = new GuardaContas();

		Conta cc1 = new ContaCorrente(123, 456);

		guardar.adiciona(cc1);

		Conta cc2 = new ContaCorrente(123, 654);

		guardar.adiciona(cc2);

		Conta cc3 = new ContaCorrente(123, 753);

		guardar.adiciona(cc3);

		int tamanho = guardar.getQuantidadeElementos();

		System.out.println(tamanho);

		Conta ref = guardar.getReferencias(0);

		System.out.println(ref.getNumero());

	}

}
