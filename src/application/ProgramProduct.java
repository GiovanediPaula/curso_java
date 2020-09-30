package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Product p = new Product();
		
		System.out.println("Enter product data: ");
		
		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.println("Price: ");
		Double price = sc.nextDouble();
		
//		System.out.println("Quantity in stock: ");
//		int quantity = sc.nextInt();

		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product.toString());
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product.toString());
		
		sc.close();

	}

}
