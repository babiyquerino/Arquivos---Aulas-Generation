package Concluidos;
import java.util.Scanner;
public class exer2 {
	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Valoe de A: ");
		a = leia.nextInt();
		System.out.println("Valor de B: ");
		b = leia.nextInt();
		System.out.println("Valor de C ");
		c = leia.nextInt();
		
		if(a<=b && b<=c)
		{
			System.out.println("\ncrescente: "+a+", "+b+" e "+c);
		}
		else if(a<=c && c<=b)
		{
			System.out.println("\n crescente: "+a+", "+c+" e "+b);
		}
		else if(b<=a && a<=c)
		{
			System.out.println("\n crescente: "+b+", "+a+" e "+c);
		}
		else if(b<=c && c<=a)
		{
			System.out.println("\n crescente: "+b+", "+c+" e "+a);
		}
		else if(c<=a && a<=b)
		{
			System.out.println("\nOrdem crescente: "+c+", "+a+" e "+b);
		}
		else
		{
			System.out.println("\nOrdem crescente: "+c+", "+b+" e "+a);
		}
		
	}

}


