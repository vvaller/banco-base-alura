package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SaldoInsuficienteException;

public class TesteSaca {
	public static void main(String[] args) throws SaldoInsuficienteException {
		Conta conta = new ContaCorrente(123, 456);
		conta.deposita(200);
		conta.saca(250);

		System.out.println("saldo em conta: " + conta.getSaldo());
	}
}
