package curso_programacao;

import java.util.Scanner;

public class Main {
	
	public static void main (String[]args) {
		
		System.out.println("Insira um número: ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int numDois = sc.nextInt();
		
		if (num % numDois == 0 || numDois % num == 0) {
			
			System.out.println("Multiplos");
		}
		else {
			
			System.out.println("Não multiplos");
		}
		
		sc.close();
	}
}