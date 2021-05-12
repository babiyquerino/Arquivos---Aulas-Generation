package Concluidos;

import java.util.Scanner;

public class Maiorint{
	public static void main(String[] args)
	{
		int num;
		double total;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		if(num%2==0)
		{
			total = Math.sqrt(num);
			System.out.println("Número é par e a sua raiz é: "+total);
		}
		else
		{
			total = Math.pow(num,2);
			System.out.println("Número é ímpar e a sua potencia é: "+total);
		}
	}
}


