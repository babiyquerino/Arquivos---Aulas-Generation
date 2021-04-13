programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro numero [5], maior=0, x

		para (x=0; x<5; x++)
		{
			escreva ("Digite o número desejado:")
			leia (numero[x])
		}
	
		para (x=0; x<5; x++)
		
		{
			escreva ("\n Pontuações ", x+1,":" , numero [x])

				se ( maior<numero[x])
				maior=numero[x]
		}
              escreva ("\nMaior pontuação: ",maior)
		
		
		
			 
		

	}
			
		}
		

	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 342; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */