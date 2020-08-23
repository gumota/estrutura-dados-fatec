package listas.lista1;

import java.util.Scanner;

public class Exercicio1 {
	
	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		int[] vet = new int[100];
		double mediaPositivo = 0;
		int contPositivo = 0;
		int somaNegativos = 0;
		int mediaTotal = 0;
		int contTotal = 0;

		System.out.println("Digite 100 valores reais: ");

		for (int i = 0; i < 100; i++) {
			vet[i] = in.nextInt();
			
			if(vet[i] >= 100 && vet[i] <= 1000) {
				mediaPositivo += vet[i];
				contPositivo++;
			}
			
			if (vet[i] < 0) {
				somaNegativos += vet[i];

			}
			mediaTotal += vet[i];
			contTotal++;
			
		}
		
		mediaPositivo = mediaPositivo / contPositivo;
		mediaTotal = mediaTotal / contTotal;

		System.out.println("Média dos saldos positivos entre 100 à 1000: " + mediaPositivo);
		System.out.println("Média geral dos saldos: " + mediaTotal);
		System.out.println("Soma dos saldos negativos: " + somaNegativos);

	}

}
