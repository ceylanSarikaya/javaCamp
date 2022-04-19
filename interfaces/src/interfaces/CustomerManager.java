package interfaces;

public class CustomerManager {
	
	//java da ust classý static yapýlmazken icinde bulunan class static olabilir.
	// loosly (katý)-tightly(Gevsek) coupled(baglý)
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {

		this.loggers = loggers;
	}

	public void Add(Customer customer) {
		System.out.println("Müþteri eklendi :" + customer.getFirstName());
		// this.logger.log(customer.getFirstName());
//	 for (Logger logger : loggers) {
//		 logger.log(customer.getFirstName());
//		
//	}
		//Utils utils = new Utils();
		Utils.runLoggers(loggers, customer.getFirstName());
	}

	public void Delete(Customer customer) {
		System.out.println("Müþteri silindi :" + customer.getFirstName());
		// this.logger.log(customer.getFirstName());
//	 for (Logger logger : loggers) {
//		 logger.log(customer.getFirstName());
//		
//	}
		// static den sonra Utils utils = new Utils();
		Utils.runLoggers(loggers, customer.getFirstName());
	}

}
