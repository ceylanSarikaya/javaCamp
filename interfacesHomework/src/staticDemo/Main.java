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
//1-) bir class�n i�inde ba�ka bir class olmas�na inner class denir.
//2-) Java ana class static olmaz 
//3-) Static classlar diger class da newlenmeden g�r�n�r c�nk� belekte newlenir buda beleg� yorcag� �c�n fazla tercih edilmez
//4-) Solidin tek prnsibi yan� b�r class b�r i� yapara uymaz
	
}
