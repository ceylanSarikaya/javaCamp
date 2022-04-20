package InterfaceAndAbstract;

import java.util.Date;

import interfacesHomework.CustomerManager;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer(1, "Ceylan", "Sarýkaya", new Date(1999,5,9), "1231786723123");
	BaseCustomerManager baseCustomerManager=new SturbucksManager(new MernisServiceAdapter());
		
	}

}
