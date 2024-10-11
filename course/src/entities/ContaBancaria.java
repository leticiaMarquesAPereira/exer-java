package entities;

public class ContaBancaria {

	private int numero;
	private String nomeTitular;
	private double saldo;
	
	//Constructors
	public ContaBancaria(int numero, String nomeTitular, double saldo) {
		
		this.numero = numero;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}
	
	public ContaBancaria(int numero, String nomeTitular) {

		this.numero = numero;
		this.nomeTitular = nomeTitular;
	}
	
	//Getters e Setters
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//Métodos
	public double deposito(double valor) {
		
		return saldo += valor - 5;
	}
	
	public double saque(double valor) {
		
		return saldo = saldo - valor - 5;
	}
	
	public String toString() {
		
		return "\nNumero: " + numero + "\nNome: " + nomeTitular + "\nSaldo atual: " + saldo;
	}
	
}
