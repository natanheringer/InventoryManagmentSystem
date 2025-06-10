package System.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import System.Entities.Product;

public class Program {

	
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			List<Product> productList = new ArrayList<>();
			String stopOperation;
			
			do {
			Product product = new Product(); 
			
			System.out.printf("\nEnter product data (product #%d)", product.getId());
			
			
			System.out.println("\nName: ");
			product.name = sc.nextLine();
			
			System.out.println("\nPrice: ");
			product.price = sc.nextDouble();
			
			System.out.println("\nQuantity in stock: ");
			product.quantity = sc.nextInt();
			
			System.out.println();
			System.out.println(product);
			
			System.out.println();
			System.out.println("\nEnter the number of products to be removed from stock: ");
			int quantity = sc.nextInt();
			product.removeProducts(quantity);
			
			System.out.println();
			System.out.println("Enter the number of products to be added to stock: ");
			quantity = sc.nextInt();
			product.addProducts(quantity);
			
			productList.add(product);
			
			System.out.println();
			System.out.println("\nUpdated data: \n" + product);
			
			System.out.println("\nDo you want to continue the operation? (y/n)");
			stopOperation = sc.next();
			
			sc.nextLine();
			
			} while (!stopOperation.equalsIgnoreCase("n"));		
			
			
			System.out.println("\n--------------------------------------------------------------");
			System.out.println("\nAll products entered: \n");
			for (Product p : productList) {
				System.out.println(p);
			}
			
			
			sc.close();
		}
}
