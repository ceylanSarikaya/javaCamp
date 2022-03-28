package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();// örnek oluþturma ,referans oluþturma,intance
		product1.id = 1;
		product1.name = "Monster";
		product1.unitPrice = 15000;
		product1.detail = "16 gb ram";

		Product product2 = new Product(1,"Hp v5",15000,"16 gb ram");// örnek oluþturma ,referans oluþturma,intance
		

		Product[] products = { product1, product2 };
		for (Product product : products) {
			System.out.println(product.name);
		}
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		ProductManager productManager =new ProductManager();
	productManager.addToCart(product1);

	}

}
