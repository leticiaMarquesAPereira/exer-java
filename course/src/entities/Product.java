package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;
	/*normalmente o construtor é definido depois dos atributos.
	 você pode criar vários construtores de mesmo nome, mas com parâmetros diferentes,
	 para que você possa usar em situações diferentes no programa principal. Esses três seguintes são exemplos:*/
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public Product(String name) {
		this.name = name;
	}
	/*os métodos get e set são colocados depois dos construtores*/
	public String getName() {
		
		return this.name;
	}
	public double totalValueInStock() {

		return price * quantity;
	}

	public void addProduct(int quantity) {

		this.quantity += quantity;
	}

	public void removeProduct(int quantity) {

		this.quantity -= quantity;
	}

	public String toString() {

		return name + ", R$" + String.format("%.2f", price) + ", " + quantity + " unidades. Total: R$"
				+ String.format("%.2f", totalValueInStock());
	}
}