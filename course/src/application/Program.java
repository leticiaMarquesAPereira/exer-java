package application;
import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite o preço atual do dolar: ");
		double dollarV = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados?: ");
		double dollarQ = sc.nextDouble();
		
		double totalAPagar = CurrencyConverter.totalAPagar(dollarV, dollarQ);
		System.out.printf("Total a ser pago em reais (taxa IOF inclusa): %.2f", CurrencyConverter.totalAPagar(dollarV, dollarQ));
		
		sc.close();
	}
}