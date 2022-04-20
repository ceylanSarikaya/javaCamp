package staticDemo;

public class ProductManager {
	ProductValidator productValidator=new ProductValidator();
	public void add(Product product) {
		if (productValidator.isValid(product)) {
			System.out.println("Ekleme iþlemi yapýldý");
		}else {
			System.out.println("Eksik yada yanlýþ girilen bilgiler bulunmaktadýr.");
		}
	}

}
