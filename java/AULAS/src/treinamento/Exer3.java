package treinamento;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		/*Modifique o algoritmo da quest�o 2 para que o usu�rio possa escolher, usando o teclado, se quer mostrar n�meros pares ou �mpares. */

		Scanner ler = new Scanner(System.in);
		int numero, contador = -1, i;
		char op;
		
		System.out.print("INFORME UM NUMERO: ");
		numero = ler.nextInt();
		System.out.print("VOC� DESEJA NUMEROS PARES OU IMPARES? [P/I]: ");
		op = ler.next().toUpperCase().charAt(0);
		
		if(op == 'P') {
			for(i = 0; i <= numero; i++) {
				contador++;
				if(contador % 2 == 0) {
					System.out.println(contador);
				}
			}
		}else if(op == 'I') {
			for(i = 0; i <= numero; i++) {
				contador++;
				if(contador % 2 == 1) {
					System.out.println(contador);
				}
			}
		}else {
			System.out.println("OP��O INV�LIDA.");
		}
	}

}
