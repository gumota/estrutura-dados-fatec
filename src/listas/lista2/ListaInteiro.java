package listas.lista2;


public class ListaInteiro {

	private int[] numero = new int[10];
	private int totalDeElementos = 0;

	public boolean vazia() {
		if (totalDeElementos == 0) {
			return true;
		}
		return false;
	}

	public void remove(int posicao) {

		if (vazia()) {
			throw new IllegalArgumentException("Lista Vazia");
		}
		for (int i = posicao; i < this.totalDeElementos; i++) {
			this.numero[i] = this.numero[i + 1];
		}
		totalDeElementos--;
	}

}
