package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		
		int op;
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n\t\tDigite uma opção: ");
			System.out.println("-------------------------------------------");
			System.out.println("\n(1) Deseja adicionar produtos no estoque ?");
			System.out.println("\n(2) Deseja remover produtos do estoque ?");
			System.out.println("\n(3) Deseja atualizar produtos no estoque ?");
			System.out.println("\n(4) Mostrar todos os produtos do estoque");
			System.out.println("\n(0) Encerrar programa");
			
			System.out.println("-------------------------------------------");
			
			op = ler.nextInt();
			
			switch(op)
			{
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque:");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
			case 2:
				ler.nextLine();
				System.out.println(estoque);
				System.out.println("\nDigite o produto para remover do estoque");
				String produtor = ler.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto não existe!!!");
				}
				break;
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o produto que quer atualizar");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar de "+verifica+ ":'");
				String novo = ler.nextLine();
				
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existe!!!");
				}
				break;
			case 4:
				System.out.println("\nOs produtos do estoque: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nFinalizou o programa!!!");
			}
			
		}while(op!=0);
		
		
	}

}
