package staticDemo;

public class ProductManager {
	ProductValidator productValidator=new ProductValidator();
	public void add(Product product) {
		if (productValidator.isValid(product)) {
			System.out.println("Ekleme i�lemi yap�ld�");
		}else {
			System.out.println("Eksik yada yanl�� girilen bilgiler bulunmaktad�r.");
		}
	}

}
