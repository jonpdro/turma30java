package Lista3;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba varios n�meros inteiros no teclado. E no
		 * final imprimir a m�dia dos n�meros multiplos de 3. Para sair digitar 0(zero).
		 */

		Scanner ler = new Scanner(System.in);

		int numeros, contador = 0, quantidade = 0;
		double media;

		do {
			System.out.print("DIGITE UM NUMERO INTEIRO: ");
			numeros = ler.nextInt();
			quantidade++;
			contador += numeros;
		}while(numeros > 0);
		
		quantidade -= 1;
		
		if(contador % 3 == 0) {
			media = contador / quantidade;
			System.out.printf("\nA MEDIA DOS NUMEROS MULTIPLOS �: %.2f", media);
			
		}else {
			System.out.println("\nN�O HOUVE MEDIA DOS NUMEROS MULTIPLOS DE 3.");
		
		}
	}
}