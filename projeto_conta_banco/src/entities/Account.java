package entities;

public class Account {
	
	public String nome;
	public double saldo;
	public double limite;
	
	public String toString() {
		
		return "------ CONTA ------\n" +
				"Número da conta: " + nome + "\n"
				+ "Saldo disponível: " + String.format("%.2f%n", saldo)
				+ "Limite: " + String.format("%.2f%n", limite);
	}
	public void saca(double saque) {
		
		if (saque > this.limite) {
			
			System.out.println("Valor inválido para saque. Limite excedido.");
		}
		else if (saque <= 0) {
			
			System.out.println("Valor inválido para saque.");
		}
		else {
			
			this.saldo -= saque;
		}
	}
	public void deposita(double deposito) {
		
		if (deposito <= 0) {
			
			System.out.println("Valor inválido para depósito.");
		}
		else {
			
			this.saldo += deposito;
		}
	}
	public void transfere(Account destino, double valor) {
		
		this.saca(valor);
		destino.deposita(valor);
		
		if (valor > saldo || valor <= 0) {
			
			System.out.println("Valor inválido para transferência.");
		}
		else {
			
			valor -= saldo;
			valor += destino.saldo;
		}
	}
}