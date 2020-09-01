package listas.lista2;

public class ListaCaracter {

	private char[] caracteres;
	private int tamanho;

	public ListaCaracter() {
		caracteres = new char[10];
		tamanho = 0;
	}

	public boolean vazia() {
		if (tamanho == 0) {
			return true;
		}
		return false;
	}

	public boolean cheia() {
		if (caracteres.length == tamanho) {
			return true;
		}
		return false;
	}

	public void adicionaNoInicio(char x) {
		if (cheia()) {
			throw new IllegalArgumentException("Lista Cheia");
		}
		tamanho++;
		for (int i = 0; i < tamanho; i++) {
			caracteres[i + 1] = caracteres[i];
		}
		caracteres[0] = x;
	}

	public void adicionaNoFim(char x) {
		if (!cheia()) {
			caracteres[tamanho] = x;
			tamanho++;
		} else {
			System.out.println("Lista Cheia!");
		}

	}

	public void adiciona(char x, int posicao) {
		if (cheia()) {
			throw new IllegalArgumentException("Lista Cheia");
		}
		for (int i = posicao; i < caracteres.length; i++) {
			caracteres[i + 1] = caracteres[i];
		}
		caracteres[posicao] = x;
		tamanho++;
	}

	public char removeNoInicio() {
		char a = '1';
		if (!vazia()) {
			a = caracteres[0];
			for (int i = 0; i < caracteres.length; i++) {
				caracteres[i] = caracteres[i + 1];
			}
			tamanho--;
		}

		return a;
	}

	public char removeNoFim() {
		char x = 'a';
		if (!vazia()) {
			tamanho--;
			x = caracteres[tamanho];
		} else {
			System.out.println("Lista vazia!");
		}
		return x;

	}

	public char remove(int posicao) {
		
		if(vazia()) {
			throw new IllegalArgumentException("Lista Vazia");
		}
		char x = caracteres[posicao];
		for (int i = posicao; i < this.tamanho; i++) {
			this.caracteres[i] = this.caracteres[i + 1];
		}
		tamanho--;
		return x;

	}

	public String percorreLista() {
		String lista = "";
		for (int i = 0; i < caracteres.length; i++) {
			lista = lista + " " + caracteres[i];
		}
		return lista;

	}

}
