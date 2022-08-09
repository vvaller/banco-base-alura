package br.com.bytebank.modelo;

import br.com.bytebank.modelo.*;	

public class CalculadorImpostos {

	private double impostos;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.impostos += valor;
	}
	
	public double getImpostos() {
		return impostos;
	}
	
}
