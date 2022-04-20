package staticDemo;

public class Main {

	public static void main(String[] args) {
		Product product=new Product();
		product.id=1;
		product.name="Bardak";
		product.price=10;
		ProductManager manager=new ProductManager();
		manager.add(product);
		System.out.println("------------Static------------");
		DatabaseHelper.Crud.Delete();
	}
//******Not******
//1-) bir classýn içinde baþka bir class olmasýna inner class denir.
//2-) Java ana class static olmaz 
//3-) Static classlar diger class da newlenmeden görünür cünkü belekte newlenir buda belegý yorcagý ýcýn fazla tercih edilmez
//4-) Solidin tek prnsibi yaný býr class býr iþ yapara uymaz
	
}
