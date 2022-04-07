

public class Main {
//***Bir class neyi yapabiliyorsa sadece onu yapabilmeli*******
// polimorfizm bir classý exdent eden sýnýflarýn referanslarýný tutabilir.
	public static void main(String[] args) {
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.customerNumber = "12345";
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.customerNumber = "56789";
		CustomerManager customerManager = new CustomerManager();
//	customerManager.Add(corporateCustomer);
//	customerManager.Add(individualCustomer);
		Customer[] customers = { individualCustomer, corporateCustomer };
		customerManager.addMultiple(customers);
	}

}
