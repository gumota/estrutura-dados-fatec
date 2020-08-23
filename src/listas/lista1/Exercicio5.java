package listas.lista1;

import java.util.Scanner;

public class Exercicio5 {
	
	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		int[][] mat = new int[4][4];
		int a = 1;

		System.out.println("Carregue a matriz 4x4: ");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					mat[i][j] = a;
					a = a * 3;
				} else {

					mat[i][j] = in.nextInt();

				}

			}

		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				System.out.print(mat[i][j] + "      ");

			}

			System.out.println("");
		}
	}

}