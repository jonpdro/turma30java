package Lista1;

import java.util.Scanner;

public class MediaPonderada {
	
	public static void main(String[] args) {
		
		/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
		aluno. Considerar que a m�dia ponderada e que o peso das notas �: 2,3 e 5,
		respectivamente.*/
		
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, nota3, notaPonderada1, notaPonderada2, notaPonderada3, media, mediaPonderada;
		
		System.out.println("DIGITE TR�S NOTAS!");
		System.out.print("Nota 1: ");
		nota1 = ler.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = ler.nextDouble();
		System.out.print("Nota 3: ");
		nota3 = ler.nextDouble();
		
		notaPonderada1 = nota1 * 1;
		notaPonderada2 = nota2 * 2;
		notaPonderada3 = nota3 * 3;
		
		media = notaPonderada1 + notaPonderada2 + notaPonderada3;
		mediaPonderada = media / 6;
		
		System.out.println("\nSua m�dia ponderada � de: " + mediaPonderada);
	}
}