package curso_programacao;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		System.out.print("Adivinhe o número (você tem 10 tentativas): ");
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		int numDeTenta = 10;
		
		for (int i = 1; i <= numDeTenta; i++) {
			
			num = sc.nextInt();
			
			if (num == 12) {
				
				if (i == 1) {
					
					 System.out.println("Parabééénss!! Você conseguiu de primeira!.");
				}
				else if (i == 2) {
					
					System.out.println("De segunda :) uhuull!");
				}
				else {
					
					System.out.println("Demorou pra acertar, né? Slk");
				}
				return;
			}
			else {
				
				if (i < numDeTenta) {
					
					System.out.println("Tente de novo. (tentativa restantes: " + (numDeTenta - i) + ")");
				}
			}
		}
		
		System.out.print("É... você não conseguiu.");
	}
}