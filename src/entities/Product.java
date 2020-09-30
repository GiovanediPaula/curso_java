package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	// Construtor padrao
	public Product () {
	}
	
	// Construtor com todos os atributos obrigatorios
	public Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;		
	}
	
	// Construtor com os campos name e price obrigatorio e quantidade zerada
	public Product (String name, double price) {
		this.name = name;
		this.price = price;
		quantity = 0;		// Opcional no java os tipos primitivos já são instanciados
	}
	
	//Get and Set
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}	
	
	public double getPrice () {
		return price;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public double getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;		
	}
	
	public String toString () {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
