package Lista3;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero
		 * igual a zero. No final, mostre a soma dos n�meros digitados.
		 */

		Scanner ler = new Scanner(System.in);

		int numero, somador = 0;

		do {
			System.out.print("INFORME UM N�MERO: ");
			numero = ler.nextInt();
			somador += numero;
		} while (numero > 0);

		System.out.println("PROGRAMA ENCERRADO!");
		System.out.printf("\nA SOMA DOS N�MEROS DIGITADOS S�O DE: %d", somador);
	}

}
