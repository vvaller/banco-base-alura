package br.com.bytebank.modelo;

import br.com.bytebank.modelo.*;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero){
		
		super(agencia,numero);
		
	}
	
	@Override
	public String toString() {
	
		return "ContaPoupan�a: " + super.toString();
	}
	
	
}
