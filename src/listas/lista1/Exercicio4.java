package listas.lista1;

import java.util.Scanner;

public class Exercicio4 {
	
	private static Scanner in;
	
	public static void main(String[] args) {
		
		int[][] mat = new int[4][4];
		int maior = -10000;
		int soma100 = 0;
		int contImpar = 0;
		int contDiv8 = 0;
		int contDiv3 = 0;
		in = new Scanner(System.in);
		
		System.out.println("Carregue uma matriz 4 x 4 de"
				+ " valores inteiros e obtenha alguns dados");
		
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				mat[i][j] = in.nextInt();
				

				if (mat[i][j] >= 1 && mat[i][j] <= 100) {
					soma100 += mat[i][j];
				}
				if (mat[i][j] >= 30 && mat[i][j] <= 50 && mat[i][j] % 2 != 0) {
					contImpar++;
				}
				if (mat[i][j] % 8 == 0) {
					contDiv8++;
				}
				if (mat[i][j] % 2 != 0 && mat[i][j] % 3 == 0) {
					contDiv3++;
				}
				if (mat[i][j] > maior) {
					maior = mat[i][j];
				}

			}

		}
		
		System.out.println(maior);
		System.out.println("Soma dos valores no intervalo de 1 a 100: " + soma100);
		System.out.println("Quantidade de números ímpares entre 30 a 50: " + contImpar);
		System.out.println("Quantidade de números divisíveis por 8: " + contDiv8);
		System.out.println("Quantidade de números ímpares divisíveis por 3: " + contDiv3);
		System.out.println("Fatorial do maior numero informado na matriz: " + calculaFatorial(maior));

	}

	public static int calculaFatorial(int num) {
		int fat = 1;
		for (; num > 1; num--) {
			fat *= num;

		}
		return fat;

	}

}
