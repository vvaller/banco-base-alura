package br.com.bytebank.modelo;

import java.io.Serializable;

import br.com.bytebank.modelo.*;

public class ContaCorrente extends Conta implements Tributavel, Serializable {

	public ContaCorrente(int agencia, int numero) {

		super(agencia, numero);

	}

	@Override
	public void saca(double valor) {

		double valorDoSaque = valor + 0.2;

		try {
			super.saca(valorDoSaque);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}

	}

	@Override
	public double getValorImposto() {

		return super.getSaldo() * 0.01;

	}
	
	@Override
	public String toString() {
	
		return "ContaCorrente: " + super.toString();
	}
}
