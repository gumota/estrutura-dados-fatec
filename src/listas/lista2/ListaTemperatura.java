package listas.lista2;

public class ListaTemperatura {

	private double[] temperatura = new double[10];
	private int tamanho = 0;

	public ListaTemperatura() {
		temperatura = new double[10];
		tamanho = 0;
	}

	public boolean vazia() {
		if (tamanho == 0) {
			return true;
		}
		return false;
	}

	public boolean cheia() {
		if (temperatura.length == tamanho) {
			return true;
		}
		return false;
	}

	public void adicionaNoInicio(double temp) {
		if (cheia()) {
			throw new IllegalArgumentException("Lista Cheia");
		}
		tamanho++;
		for (int i = 0; i < tamanho; i++) {
			temperatura[i + 1] = temperatura[i];
		}
		temperatura[0] = temp;

	}

	public void adicionaNoFim(double temp) {
		if (!cheia()) {
			temperatura[tamanho] = temp;
			tamanho++;
		} else {
			System.out.println("Lista cheia");
		}

	}

	public void adiciona(double temp, int posicao) {

		if (cheia()) {
			throw new IllegalArgumentException("Lista Cheia");
		}
		for (int i = posicao; i < temperatura.length; i++) {
			temperatura[i + 1] = temperatura[i];
		}
		temperatura[posicao] = temp;
		tamanho++;
	}

	public double removeNoInicio() {

		double removido = 0.0;
		if (!vazia()) {
			removido = temperatura[0];
			for (int i = 0; i < temperatura.length; i++) {
				temperatura[i] = temperatura[i + 1];
			}
			tamanho--;
		}

		return removido;

	}

	public double removeNoFim() {
		double n = 0.0;
		if (!vazia()) {
			tamanho--;
			n = temperatura[tamanho];
		} else {
			System.out.println("Lista Vazia!");
		}
		return n;

	}

	public double remove(int posicao) {
		double removida = temperatura[posicao];
		for (int i = posicao; i < temperatura.length; i++) {
			temperatura[i] = temperatura[i + 1];
		}
		tamanho--;
		return removida;
	}

	public String percorreLista() {

		String lista = "";
		for (int i = 0; i < temperatura.length; i++) {
			lista = lista + " " + temperatura[i];
		}
		return lista;

	}

}