package Lista1;

import java.util.Scanner;

public class Idade2 {
	
	public static void main(String[] args) {
		
		/*Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		expressa em anos, meses e dias.*/
		
		Scanner ler = new Scanner(System.in);
		
		int diasV, meses, anos, dias, idade;
		
		System.out.print("Digite a quantidade de dias: ");
		diasV = ler.nextInt();
		
		anos = diasV / 365;
		meses = (diasV % 365) / 30;
		dias =  (diasV % 365) - 30;
		idade = 2021 - anos;
		
		System.out.println("\nO m�s da sua idade �: "+ meses +".");
		System.out.println("O ano da sua idade �: "+ anos +".");
		System.out.println("O dia em que voc� nasceu �: "+ dias +".");
		System.out.println("Voc� tem "+ idade +" anos.");
	}
	
}