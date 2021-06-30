programa
 {
	inclua biblioteca Matematica --> mat
	funcao inicio() {

		real x1, x2, y1, y2, p1, p2, s

		escreva ("valor de x1 : ")
		leia (x1)

		escreva ("valor de x2: ")
		leia (x2)

		escreva ("valor de y1: ")
		leia (y1)

		escreva ("valor y2: ")
		leia (y2)

		p1 = mat.potencia(x2 - x1, 2)
		p2 = mat.potencia(y2 - y1, 2)

		s = mat.raiz(p1 + p2, 2)

		escreva ("A solução foi: ", s)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 350; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */