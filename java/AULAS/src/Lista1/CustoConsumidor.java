package Lista1;

import java.util.Scanner;

public class CustoConsumidor {
	
	public static void main(String[] args) {
		
		/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
		percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
		consumidor.*/
		
		Scanner ler = new Scanner(System.in);
		
		double custoFabricante, custoDesconto, custoImposto;
		int total;
		
		System.out.print("Qual � o custo de f�brica do carro?: ");
		custoFabricante = ler.nextDouble();
		
		custoDesconto = custoFabricante * 0.28;
		custoImposto = custoFabricante * 0.45;
		total = (int) (custoDesconto + custoFabricante + custoImposto);
		
		System.out.println("O seu custo como consumidor � de: R$"+ total +".");
		
	}

}