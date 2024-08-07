package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product funcio = new Product();
		
		System.out.println("Insira seu nome: ");
		funcio.name = sc.next();
		
		System.out.println("Insira seu salário bruto: ");
		funcio.salarioBruto = sc.nextDouble();
		
		System.out.println("Insira seu imposto: ");
		funcio.imposto = sc.nextDouble();
		
		System.out.println("Quantos porcentos a adicionar ao salário? ");
		funcio.increSalaria(sc.nextDouble());
		
		System.out.println("Dados atualizados - " + funcio.name + ", " + funcio.salarioLiquido());
	}
}