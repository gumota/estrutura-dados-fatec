package listas.lista2;


public class ListaString {

	private String[] palavras = new String[10];
	private int tamanho = 0;

	public ListaString() {
		palavras = new String[10];
		tamanho = 0;
	}

	public boolean vazia() {
		if (tamanho == 0) {
			return true;
		}
		return false;
	}

	public boolean cheia() {
		if (palavras.length == tamanho) {
			return true;
		}
		return false;
	}

	public void adicionaNoInicio(String nova) {
		if (cheia()) {
			throw new IllegalArgumentException("Lista Cheia");
		}
		tamanho++;
		for (int i = 0; i < tamanho; i++) {
			palavras[i + 1] = palavras[i];
		}
		palavras[0] = nova;

	}

	public void adicionaNoFim(String nova) {
		if (!cheia()) {
			palavras[tamanho] = nova;
			tamanho++;
		} else {
			System.out.println("Lista cheia");
		}

	}

	public void adiciona(String nova, int posicao) {

		if (cheia()) {
			throw new IllegalArgumentException("Lista Cheia");
		}
		for (int i = posicao; i < palavras.length; i++) {
			palavras[i + 1] = palavras[i];
		}
		palavras[posicao] = nova;
		tamanho++;
	}

	public String removeNoInicio() {
		String removido = null;
		if (!vazia()) {
			removido = palavras[0];
			for (int i = 0; i < palavras.length; i++) {
				palavras[i] = palavras[i + 1];
			}
			tamanho--;
		}

		return removido;

	}

	public String removeNoFim() {
		String retirado = "-1";
		if (!vazia()) {
			tamanho--;
			retirado = palavras[tamanho];
		} else {
			System.out.println("Lista vazia!");
		}
		return retirado;

	}

	public String remove(int posicao) {

		String removida = palavras[posicao];
		for (int i = posicao; i < palavras.length; i++) {
			palavras[i] = palavras[i + 1];
		}
		tamanho--;
		return removida;
	}

	public String percorreLista() {
		
		String lista = "";
		for (int i = 0; i < palavras.length; i++) {
			lista = lista + " " + palavras[i];
		}
		return lista;

	}

}
