package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator =new WomanGameCalculator();
		womanGameCalculator.hesapla();
		System.out.println("--------------------------------------------");
		CustomerManager customerManager=new CustomerManager();
		customerManager.databaseManager=new OracleDatabaseManager();
		customerManager.getCustomers();

	}

}
