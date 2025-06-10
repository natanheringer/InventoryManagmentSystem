package System.Entities;

public class Product {

		private static int count = 1; 
	
		public String name;
		public int id;
		public double price;
		public int quantity;
		
	
	public Product() {
		this.id = count++;
	}
	
	public int getId() {
		return id;
	}
		
	public double totalValueInStock() {
		
		return price * quantity;
		
	}
	
	public void addProducts(int quantity) {
		
		this.quantity = this.quantity + quantity;
		
	}
	
	public void removeProducts(int quantity) {
		
		this.quantity = this.quantity - quantity;
		
	}
	
	public String toString() {
		
		return 	"| ID: " 
				+ id
				+ " | Name: "  
				+ name
				+ " | $" 
				+ String.format("%.2f", price)
				+ " | "
				+ quantity
				+ " units | Total: $ "  
				+ String.format(" %.2f |", totalValueInStock());
	}
	
}
