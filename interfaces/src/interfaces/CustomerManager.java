package interfaces;

public class CustomerManager {
	
	//java da ust class� static yap�lmazken icinde bulunan class static olabilir.
	// loosly (kat�)-tightly(Gevsek) coupled(bagl�)
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {

		this.loggers = loggers;
	}

	public void Add(Customer customer) {
		System.out.println("M��teri eklendi :" + customer.getFirstName());
		// this.logger.log(customer.getFirstName());
//	 for (Logger logger : loggers) {
//		 logger.log(customer.getFirstName());
//		
//	}
		//Utils utils = new Utils();
		Utils.runLoggers(loggers, customer.getFirstName());
	}

	public void Delete(Customer customer) {
		System.out.println("M��teri silindi :" + customer.getFirstName());
		// this.logger.log(customer.getFirstName());
//	 for (Logger logger : loggers) {
//		 logger.log(customer.getFirstName());
//		
//	}
		// static den sonra Utils utils = new Utils();
		Utils.runLoggers(loggers, customer.getFirstName());
	}

}
