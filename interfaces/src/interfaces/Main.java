package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger[] loggers= {new SmsLoggger(),new DatabaseLogger()};
CustomerManager customerManager =new CustomerManager(loggers);
Customer customer=new Customer(1,"Ceylan","Sar�kaya");
customerManager.Add(customer);
	}

}
