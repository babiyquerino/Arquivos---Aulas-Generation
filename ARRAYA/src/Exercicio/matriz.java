package Exercicio;

import java.util.Scanner;

public class matriz {
	public static void main(String[] args) {
	
		int[][] idade = new int[2][2];
		float media;
		int somaidade=0,contidade=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int l=0;l<2;l++)
		{
			for(int c=0;c<2;c++)
			{
				System.out.println("\nSua idade: ");
				idade[l][c] = leia.nextInt();
				somaidade = somaidade + idade[l][c];
				contidade++;
			}
		}
		media = somaidade / contidade;
		
		System.out.printf("\nA média de idades foi de: %3.2f",media);
	}


}
