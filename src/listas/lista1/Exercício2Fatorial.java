package listas.lista1;

import java.util.Scanner;

public class Exercício2Fatorial {
	
	private static Scanner in;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		int[] vet = new int [5];
		int[] vetFatorial = new int [5];
		
		System.out.println("Digite 5 valores inteiros e obtenha nseu fatorial:");
		
		for(int i = 0; i < 5; i ++) {
			vet[i] = in.nextInt();
			vetFatorial[i] = calculaFatorial(vet[i]);
		}
		
		for(int i = 0; i < 5; i ++) {
			System.out.println("O fatorial de " + vet[i] + " é " + vetFatorial[i] );
		}
		
	}
	
	public static int calculaFatorial(int num) {
		
		int fat = 1;
		
		for(;num > 1; num--) {
			fat *= num;
		}
		
		return fat;
	}
}
