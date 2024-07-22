package curso_programacao;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		System.out.println("Insira a senha: ");
		
		Scanner sc = new Scanner(System.in);
		
		int passw = sc.nextInt();
		
		do {
			
			System.out.println("Senha incorreta. Tente novamente.");
			
			passw = sc.nextInt();
			
		}
		while (passw != 2002);
		
		System.out.println("Acesso permitido.");
		
		sc.close();
		
	}
}