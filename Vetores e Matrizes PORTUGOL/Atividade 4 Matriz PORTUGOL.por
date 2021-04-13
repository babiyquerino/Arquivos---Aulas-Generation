programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro Matriz[3] [3], l, c, somatotal =0, somadiagonal=0

		para (l=0;l<3;l++)

		{
			para (c=0;c<3;c++)
			{
				escreva ("Digite um número:") 
				leia (Matriz [l] [c])

				 somatotal = somatotal + Matriz [l][c]


				 se ( l == c)

				{
					somadiagonal = somadiagonal + Matriz [l][c]
				}

				
			}
		}
		
		escreva ("\n Soma Total: ", somatotal )
		
		
		 escreva ("\n Soma Diagonal: ", somadiagonal )
		 7
		
}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 487; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */