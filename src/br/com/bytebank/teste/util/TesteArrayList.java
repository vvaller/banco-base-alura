package br.com.bytebank.teste.util;

import java.util.ArrayList;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		// Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente(123, 456);

		lista.add(cc1);

		Conta cc2 = new ContaCorrente(123, 654);

		lista.add(cc2);

		Conta cc3 = new ContaCorrente(423, 753);

		lista.add(cc3);

		Conta cc4 = new ContaCorrente(523, 946);

		lista.add(cc4);

		Conta cc5 = new ContaCorrente(126, 854);

		lista.add(cc5);

		Conta cc6 = new ContaCorrente(173, 323);

		lista.add(cc6);

		System.out.println("Tamanho = " + lista.size());

		Conta ref = lista.get(0);

		System.out.println(ref.getNumero());

		lista.remove(0);

		System.out.println("Tamanho = " + lista.size());

		for (int i = 0; i < lista.size(); i++) {

			Object refs = lista.get(i);
			System.out.println(refs);

		}

		System.out.println("-----");

		for (Conta conta : lista) {

			System.out.println(conta);

		}

	}

}
