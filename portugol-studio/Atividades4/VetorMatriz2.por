programa
{
	/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.*/

	inclua biblioteca Util --> u
	inclua biblioteca Matematica --> mat
		
	funcao inicio()
	{
		const inteiro LANCAMENTO = 10
		inteiro dado[LANCAMENTO], i, contador = 0, maiorPontuacao = 0
		real mediaLancamento

		para(i = 0; i < 10; i++){
			dado[i] = u.sorteia(1, 6)
			contador += dado[i]
			
			se(dado[i] > maiorPontuacao){
				maiorPontuacao = dado[i]
			}
		}
		
		mediaLancamento = contador / LANCAMENTO
		escreva("A maior pontuação feitas foram de: ", maiorPontuacao)
		escreva("\nA média dos lançamento é de: ", mat.arredondar(mediaLancamento, 1))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 857; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {dado, 14, 10, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */