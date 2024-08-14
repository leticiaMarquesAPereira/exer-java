package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	//normalmente o construtor é definido depois dos atributos.
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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