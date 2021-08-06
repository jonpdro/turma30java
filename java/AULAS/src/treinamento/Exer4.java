package treinamento;

import java.util.Scanner;
import java.util.Random;

public class Exer4 {

	public static void main(String[] args) {
		/*
		 * Em um jogo de adivinha��o, o jogador deve descobrir um n�mero entre 1 e 10
		 * usando at� tr�s tentativas. A cada tentativa o jogador � informado se o
		 * n�mero foi descoberto, ou se ele � maior ou menor do que a tentativa. Se ap�s
		 * tr�s tentativas o jogador n�o descobrir o n�mero, ent�o ele perde o jogo.
		 * Fa�a um algoritmo que i implemente esse jogo.
		 */

		Scanner ler = new Scanner(System.in);
		Random numeroAleatorio = new Random();
		int numero, numeroSorteado, tentativas = 0;

		
		numeroSorteado = numeroAleatorio.nextInt(10);
		if(numeroSorteado == 0){
			numeroSorteado ++;
		}
		
		System.out.println(numeroSorteado);

		System.out
				.println("ESTE � UM JOGO DE ADVINHA��O, VOC� TEM TR�S TENTATIVAS PARA ACERTAR UM N�MERO ENTRE 1 E 10.");
		while(tentativas != 3) {
		System.out.print("\nDIGITE AQUI SEU N�MERO DA SORTE: ");
		numero = ler.nextInt();
		
		if(numero < numeroSorteado) {
			System.out.println("O N�MERO ESCOLHIDO � MENOR QUE O SORTEADO.");
		}else if (numero > numeroSorteado) {
			System.out.println("O N�MERO ESCOLHIDO � MAIOR QUE O SORTEADO.");
		}else {
			System.out.println("\nVOC� ACERTOU! PARAB�NS!");
		}
		tentativas++;
		}
		
		System.out.println("\nSUAS TENTATIVAS FORAM ESGOTADAS. MAIS SORTE NA PROXIMA!");
	}

}
