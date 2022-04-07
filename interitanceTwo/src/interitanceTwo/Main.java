package interitanceTwo;

public class Main {
//***birbirinin alternatfi olan kodlar için if yazýlmaz.***
	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new DatabaseLogger());
	}

}
