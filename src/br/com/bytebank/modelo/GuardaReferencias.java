package br.com.bytebank.modelo;

public class GuardaReferencias {

	private Object[] referencias;

	private int posicaoLivre;

	public GuardaReferencias() {

		this.referencias = new Object[10];
		this.posicaoLivre = 0;

	}

	public void adiciona(Object ref) {

		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;

	}

	public int getQuantidadeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferencias(int pos) {

		return this.referencias[pos];
	}

}
