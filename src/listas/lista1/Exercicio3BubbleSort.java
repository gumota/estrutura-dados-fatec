package listas.lista1;

import java.util.Scanner;

public class Exercicio3BubbleSort {
	
	private static Scanner in;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		int [] vet = new int [100];
		int auxiliar = 0;
		
		System.out.println("Digite 100 valores inteiros e "
				+ "os obtenha em ordem crescente");
		
		for(int i = 0; i < 100; i++) {
			vet[i] = in.nextInt();
		}
		
		for(int i = 0; i < 100; i ++) {
			for(int j = i + 1; j < 100; j ++) {
				if(vet[i] > vet[j]) {
					auxiliar = vet[i];
					vet[i] = vet[j];
					vet[j] = auxiliar;
					
				}
			}
		}
		
		System.out.println("Segue os valores em ordem crescente:");
		for(int i = 0; i < 100; i++) {
			System.out.print(vet[i] + "   ");
		}
		
	}

}
