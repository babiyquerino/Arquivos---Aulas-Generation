package Concluidos;

import java.util.Scanner;

public class Maiorint{
	public static void main(String[] args)
	{
		int num;
		double total;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		num = leia.nextInt();
		
		if(num%2==0)
		{
			total = Math.sqrt(num);
			System.out.println("N�mero � par e a sua raiz �: "+total);
		}
		else
		{
			total = Math.pow(num,2);
			System.out.println("N�mero � �mpar e a sua potencia �: "+total);
		}
	}
}


