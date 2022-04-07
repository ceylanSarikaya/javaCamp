package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();// örnek oluþturma ,referans oluþturma,intance
		product1.setId(1);
		product1.setName("Moster");
		product1.setUnitPrice(15000);
		product1.setDetail("16 gb ram");
		product1.setDiscount(10);
		
		System.out.println(product1.getUnitPriceAfterDiscount());
		
		
		Category category = new Category();
		category.setId(1);
		category.setName("yiyicek");
		
		
		
		
		
//		product1.id = 1;
//		product1.name = "Monster";
//		product1.unitPrice = 15000;
//		product1.detail = "16 gb ram";

//		Product product2 = new Product(1,"Hp v5",15000,"16 gb ram",10);// örnek oluþturma ,referans oluþturma,intance
//		
//
//		Product[] products = { product1, product2 };
//		for (Product product : products) {
//			System.out.println(product.name);
//		}
//		System.out.println(products.length);
//		
//		Category category1 = new Category();
//		category1.id = 1;
//		category1.name = "Bilgisayar";
//		
//		ProductManager productManager =new ProductManager();
//	productManager.addToCart(product1);

	}

}
