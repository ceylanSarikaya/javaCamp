package interitanceTwo;

public class Main {
//***birbirinin alternatfi olan kodlar i�in if yaz�lmaz.***
	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new DatabaseLogger());
	}

}
