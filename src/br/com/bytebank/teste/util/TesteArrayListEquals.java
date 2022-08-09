package br.com.bytebank.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		// Generics
		List<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente(123, 456);

		lista.add(cc1);

		Conta cc2 = new ContaCorrente(123, 654);

		lista.add(cc2);

		Conta cc3 = new ContaCorrente(123, 654);

//		lista.add(cc3);

		boolean contem = lista.contains(cc3);

		System.out.println(contem);

		for (Conta conta : lista) {

			System.out.println(conta);

		}

//		boolean teste = cc2.equals(cc1);
//
//		System.out.println(teste);

	}

}
