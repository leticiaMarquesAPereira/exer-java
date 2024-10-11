package application;

import entities.ContaBancaria;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Insira seus dados para criar criar sua nova conta:\n\nNumero: ");
		
		//Criando scanner
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Nome da conta: ");
		
		String nome = sc.nextLine();
		
		System.out.println("Deseja fazer um deposito inicial? (s/n): ");
		String opcao = sc.next();
		
		if (opcao.equalsIgnoreCase("s")) {
			
			System.out.println("Insira deposito inicial: ");
			double saldo = sc.nextInt();
			ContaBancaria contaBancaria = new ContaBancaria(numero, nome, saldo);
			
			System.out.println("Sua conta foi criada com sucesso! Faça um deposito (taxa de R$5,00): ");
			
			double valorDeposito = sc.nextDouble();
			contaBancaria.deposito(valorDeposito);
			
			System.out.println(contaBancaria.toString());
			
			System.out.println("Agora faça um saque (taxa de R$5,00): ");
			
			double valorSaque = sc.nextDouble();
			contaBancaria.saque(valorSaque);
			
			System.out.println(contaBancaria.toString());
			
			sc.close();
		} 
		else {
			
			//Criando variável do tipo ContaBancaria
			ContaBancaria contaBancaria = new ContaBancaria(numero, nome);
			
			System.out.println("Sua conta foi criada com sucesso! Faça um deposito (taxa de R$5,00): ");
			
			double valorDeposito = sc.nextDouble();
			contaBancaria.deposito(valorDeposito);
			
			System.out.println(contaBancaria.toString());
			
			System.out.println("Agora faça um saque (taxa de R$5,00): ");
			
			double valorSaque = sc.nextDouble();
			contaBancaria.saque(valorSaque);
			
			System.out.println(contaBancaria.toString());
			
			sc.close();
			}
		}
}
