package entities;

public class Product {
	
	public String name;
	public double salarioBruto;
	public double imposto;
	
	public void increSalaria(double porcentagem) {
		
		salarioBruto += (salarioBruto * porcentagem)/100;
	}
	public double salarioLiquido() {
		
		return salarioBruto -= 1000;
	}
}

