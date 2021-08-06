package application;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String alunes[] = { "Ana Beatriz Y. Espejo", "Ana Carolina G. Souza", "Ana Paula Souza Dias",
				"Anderson Coelho Costa", "Andrei Felipe C. Souza", "Ariel B. Pirangy Soares",
				"Beatriz S. Teixeira", "Beatriz Gomes de Abreu", "Caio Saldanha Motta",
				"C�ssia de A. N. Santos", "Emerson Silva Santana", "Enzo Fulaneto\t", "Ester G. N. Nascimento",
				"F�bio Campaner Suzuki", "Felipe Matos de Lima", "Felipe Souza da Silva", "Fl�vio Augusto da Costa",
				"Giovanna S. P. Penedos", "Gustavo M. Ferreira", "Henrique Uriel Lopes",
				"Jo�o Pedro Cruz Gomes", "Jos� P. M. F. Neto", "Let�cia Porto Martins", "Lucas S. N. Aguiar",
				"Maicon Gomes Cerqueira", "Marcos Vinicius C. Rego", "Matheus Araujo Farina",
				"Matheus de Brito Milani", "Nat�lia R. S. Rocha", "Pamela Paulino\t", "Renata S. Ferreira",
				"Rodrigo R. L. Costa", "Sabrina Alves de Paiva", "Sergio de Jesus Severo",
				"Stefani F. P. Tosi", "Talita g. m. g. Lima ", "Thiago da Silva Machado", "Vin�cios L. Silva",
				"Vinicius C. Silva"};
		int notas[] = new int[alunes.length], auxNotas; // Mat - 0x
		String matriculas[] = new String[alunes.length];
		boolean ativo[] = new boolean[alunes.length]; // true
		String auxMat;
		char resposta;
		char status;
		// mostra todo mundo
		// la�o e pede:
		// pedi pela matricula 1 aluno
		// informar a nota deste aluno
		// vai informar se o aluno ainda continua ativo ou n�o [o usuario n�o pode
		// digitar verdadeiro ou falso
		// tem que fazer o processo at� que pergunta continuar sim ou n�o seja n�o
		// ap�s mostrar todos os alunos com nota pela regra
		// at� 5 - estude mais
		// acima de 5 - otimo, continue assim
		// aluno inativo ou aluno ativo no true ou falso de ativo
		// apenas dos alunos que tem nota
		for (int x = 0; x < alunes.length; x++) {
			ativo[x] = true;
			if (x >= 9) {
				matriculas[x] = "MAT-" + (x + 1);
			} else {
				matriculas[x] = "MAT-0" + (x + 1);
			}
		}
		System.out.println("MATRICULA\tALUNES\t\t\t\tNOTAS\tSTATUS");
		for (int x = 0; x < alunes.length; x++) {
			if (ativo[x] == true) {
				System.out.println(matriculas[x] + "\t\t" + alunes[x] + "\t\t  " + notas[x] + "\tAtivo");
			}
		}

		do {
			System.out.print("\nDIGITE A MATRICULA DO ALUNE: ");
			auxMat = leia.next().toUpperCase();
			for (int x = 0; x < alunes.length; x++) {
				if (auxMat.equals(matriculas[x])) {
					System.out.println("MATRICULA\tALUNES\t\t\t\tNOTAS\tSTATUS");
					System.out.println(matriculas[x] + "\t\t" + alunes[x] + "\t\t  " + notas[x] + "\tAtivo");
					System.out.print("\nINSIRA A NOTA: ");
					auxNotas = leia.nextInt();
					notas[x] = auxNotas;
					if (notas[x] <= 5) {
						System.out.println("VOC� PODE MELHORAR, ESTUDE MAIS!");
					} else {
						System.out.println("�TIMO, CONTINUE ESTUDANDO. :)");
					}
					System.out.println("QUAL � O STATUS DO ALUNE? (A/I): ");
					status = leia.next().toUpperCase().charAt(0);
					if (status == 'A') {
						ativo[x] = true;
					} else if (status == 'I') {
						ativo[x] = false;
					} else {
						System.out.println("ESCOLHA INV�LIDA, N�O SER� ALTERADO O STATUS.");
					}
				}
			}

			System.out.print("DESEJA CONTINUAR? (S/N): ");
			resposta = leia.next().toUpperCase().charAt(0);

		} while (resposta == 'S');

		System.out.println("MATRICULA\tALUNES\t\t\t\tNOTAS\tSTATUS");
		for (int x = 0; x < alunes.length; x++) {
			if (ativo[x] == true) {
				System.out.println(matriculas[x] + "\t\t" + alunes[x] + "\t\t  " + notas[x] + "\tAtivo");
			}
		}
	}

}