package Lista2;

import java.util.Scanner;

public class RaizParImpar {

	public static void main(String[] args) {
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		�mpar exiba o n�mero elevado ao quadrado.*/
		
		Scanner ler = new Scanner(System.in);
		
		double numero;
		
		System.out.print("Digite um n�mero: ");
		numero = ler.nextDouble();
		
		if(numero < 0) {
			System.out.println("N�meros negativos n�o podem ser n�meros pares e �mpares.");
			
		}else if(numero == 0) {
			System.out.println("Zero � neutro.");
			
		}else if(numero % 2 == 0) {
			numero = Math.sqrt(numero);
			System.out.print("O n�mero � par e foi calculado a sua raiz.");
			System.out.printf("\nN�mero: %.2f ", numero);
			
		}else if (numero % 2 == 1) {
			numero = Math.pow(numero, 2.0);
			System.out.print("O n�mero � �mpar e foi calculado a sua potencializa��o.");
			System.out.printf("\nN�mero: %.0f ", numero);
			
		}
	}
}