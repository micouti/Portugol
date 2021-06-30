programa
 {
	
	funcao inicio() {

		inteiro id, dias, meses
		cadeia nome
				
		escreva ("Digite o seu nome: ")
		leia (nome)
		escreva ("Quanto anos você tem? ")
		leia (id)

		// Conta
		meses = id * 12
		dias = meses * 30

		escreva (nome, ", você tem ", dias, " dias de vida")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 279; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */