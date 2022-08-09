package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(0142, 2222);
		cc.deposita(100);
		cc.saca(55);
		
		ContaPoupanca cp = new ContaPoupanca(0143, 3333);
		cp.deposita(200);
		//cp.transfere(50, cc);
		
		System.out.println(cp.getSaldo());
		System.out.println(cc.getSaldo());

	}

}
