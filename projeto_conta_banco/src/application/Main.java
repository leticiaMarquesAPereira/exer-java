package application;
import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account c1 = new Account();
		Account c2 = new Account();
		c2.saldo = 400.00;
		c2.limite = 10000.00;
		c2.nome = "Rafael";
		
		System.out.print("Digite seu nome: ");
		c1.nome = sc.next();
		
		System.out.print("Digite o saldo da conta: ");
		c1.saldo = sc.nextDouble();
		
		System.out.print("Digite o limite da conta: ");
		c1.limite = sc.nextDouble();
		System.out.println();
		
		System.out.println(c1.toString());
		
		System.out.println("Qual atividade deseja realizar?\n Para SAQUE, digite (s)\n "
				+ "Para DEPÓSITO, digite (d)\n Para TRANSFERÊNCIA, digite (t)\n Para finalizar atividade, digite (f)\n");
		String opcao = sc.next();
		
		while (!(opcao.equalsIgnoreCase("s") || (opcao.equalsIgnoreCase("d") || (opcao.equalsIgnoreCase("f") || (opcao.equalsIgnoreCase("t")))))) {
			
			System.out.print("Opção inválida. Digite uma das letras válidas: ");
			opcao = sc.nextLine();
		}
		
		if (opcao.equalsIgnoreCase("s")) {
			
			System.out.print("Qual valor deseja sacar? ");
			c1.saca(sc.nextDouble());
			System.out.println();
			System.out.println(c1.toString());
		}
		else if (opcao.equalsIgnoreCase("d")) {
			
			System.out.print("Qual valor deseja depositar? ");
			c1.deposita(sc.nextDouble());
			System.out.println();
			System.out.println(c1.toString());
		}
		else if (opcao.equalsIgnoreCase("t")) {
			
			System.out.print("Qual valor deseja transferir? ");
			c1.transfere(c2, sc.nextDouble());;
			System.out.println();
			System.out.println(c1.toString());
			System.out.println(c2.toString());
		}
		else {
			
			System.out.println("Fim do programa.");
		}
		sc.close();
	}

}