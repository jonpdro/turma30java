package application;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String alunes[] = { "Ana Beatriz Yujra Espejo", "Ana Carolina Gonzalez de Souza", "Ana Paula Souza Dias",
				"Anderson Coelho da Costa", "Andrei Felipe Corr�a de Souza", "Ariel de Barros Pirangy Soares",
				"Beatriz dos Santos Teixeira", "Beatriz Gomes de Abreu", "Caio Saldanha Motta",
				"C�ssia de Arruda Nicolau Santos", "Emerson da Silva Santana", "Enzo Fulaneto",
				"Ester Gomes Neves Nascimento", "F�bio Campaner Suzuki", "Felipe Matos de Lima",
				"Felipe Souza da Silva", "Fl�vio Augusto da Costa", "Giovanna Siqueira Paiva dos Penedos",
				"Gustavo Mesquita Ferreira", "Henrique Uriel Lopes", "Jo�o Pedro Cruz Gomes",
				"Jos� Paulo de Matos Ferreira Neto", "Let�cia Porto Martins", "Lucas Silva Nunes de Aguiar",
				"Maicon Gomes Cerqueira", "Marcos Vinicius Coutinho Rego", "Matheus de Araujo Farina",
				"Matheus de Brito Milani", "Nat�lia Regina dos Santos Rocha", "Pamela Paulino",
				"Renata dos Santos Ferreira", "Rodrigo Roseo Lopes da Costa", "Sabrina Alves de Paiva",
				"Sergio de Jesus Severo", "Stefani Fernanda Pereira Tosi",
				"Talita gleice maria da gloria da Silva Lima", "Thiago da Silva Machado", "Vin�cios Lisboa da Silva",
				"Vinicius Cardoso Siqueira Francisco" };
		int[] notas = new int[alunes.length], novaNota;
		String[] matriculas = new String[alunes.length], matriculaEscolhida; // MAT-0X
		boolean[] ativo = new boolean[alunes.length];
		char resposta;

		for (int x = 0; x < alunes.length; x++) {
			ativo[x] = true;

			if (x >= 9) {
				matriculas[x] = "MAT-" + (x + 1);
			} else {
				matriculas[x] = "MAT-0" + (x + 1);
			}
		}

		for (int x = 0; x < alunes.length; x++) {
			System.out.println(matriculas[x] + "\t" + alunes[x]);
		}

		System.out.println();
		
		do {
			System.out.println("Digite uma matr�cula: ");
			System.out.println("Digite a nota desse aluno: ");
			System.out.println("Digite se o aluno est� ativo ou inativo: ");
			System.out.println("Continuar? [S/N]: ");
			resposta = leia.next().toUpperCase().charAt(0);
		} while (resposta == 'S');

		for (int x = 0; x < alunes.length; x++) {
			if (notas[x] <= 5) {
				System.out.println("Estude mais");
			} else if (notas[x] > 5) {

			}
		}

	}

}
