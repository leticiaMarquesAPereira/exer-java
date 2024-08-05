package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Insira as seguintes informações do produto: ");
		System.out.print("Nome - ");
		product.name = sc.next();
		
		System.out.print("Preço - ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantidade - ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto: " + product);
		System.out.println();
		System.out.print("Você deseja realizar mais alguma atividade no sistema? (s/n)");
		String answer = sc.next();
		System.out.println();
		
		while(!(answer.equalsIgnoreCase("s") || (answer.equalsIgnoreCase("n")))) {
			
			System.out.print("Opção incorreta, digite 's' ou 'n': ");
			answer = sc.next();
		}
		
		if (answer.equalsIgnoreCase("n")) {
				
			System.out.print("Fim do programa. ");
		}
		else {
				
			System.out.print("Qual das opções deseja realizar: Adicionar produto (a), Remover produto (b) ou Fechar programa (z)?");
			answer = sc.next();
			System.out.println();
				
			while(!(answer.equalsIgnoreCase("a") || (answer.equalsIgnoreCase("b")) || (answer.equalsIgnoreCase("z")))) {
					
				System.out.print("Opção incorreta, digite 'a', 'b' ou 'z': ");
				answer = sc.next();
				System.out.println();
			}
			
			if(answer.equalsIgnoreCase("a")) {
				
				System.out.print("Entre com a quantidade de produtos para estocar: ");
				int quantity = sc.nextInt();
				product.addProduct(quantity);
				
				System.out.println();
				System.out.println("Dados atualizados: " + product);
			}
			else if (answer.equalsIgnoreCase("b")) {
				
				System.out.print("Entre com a quantidade de produtos para tirar do estoque: ");
				int quantity = sc.nextInt();
				product.removeProduct(quantity);
				
				System.out.println();
				System.out.println("Dados atualizados: " + product);
			}
			else {
				
				System.out.print("Fim do programa. ");
			}
		}
		
		sc.close();
	}
}