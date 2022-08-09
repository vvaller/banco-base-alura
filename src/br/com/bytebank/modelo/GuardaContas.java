package br.com.bytebank.modelo;

public class GuardaContas {

	private Conta[] referencias;

	private int posicaoLivre;

	public GuardaContas() {

		this.referencias = new Conta[10];
		this.posicaoLivre = 0;

	}

	public void adiciona(Conta ref) {

		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;

	}

	public int getQuantidadeElementos() {
		return this.posicaoLivre;
	}

	public Conta getReferencias(int pos) {

		return this.referencias[pos];
	}

}
