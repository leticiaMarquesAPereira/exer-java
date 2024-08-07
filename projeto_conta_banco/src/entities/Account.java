package entities;

public class Account {
	
	public String nome;
	public int id;
	public double saldo;
	public double limite;
	
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
		else if(deposito + saldo > limite) {
			
			System.out.println("Valor de depósito excede o limite. Tente uma quantia menor.");
		}
		else {
			
			this.saldo += deposito;
		}
	}
	public void transfere(Account destino, double valor) {
		
		if (valor > saldo || valor <= 0) {
			
			System.out.println("\nValor inválido para transferência.");
		}
		else {
			
			this.saca(valor);
			destino.deposita(valor);
		}
	}
	public String status() {
		
		if(this.saldo < 0) {
			
			return "Negativa";
		}
		else {
			
			return "Positiva";
		}
	}
	public String toString() {
		
		return "------ INFOS DA CONTA ------\n" +
				"Dono da conta: " + nome + "\n"
				+ "Saldo disponível: " + String.format("%.2f%n", saldo)
				+ "Limite: " + String.format("%.2f%n", limite)
				+ "Status da conta: " + status() + "\n";
	}
}