package InterfaceAndAbstract;

public class SturbucksManager extends BaseCustomerManager {

	private CustomerCheckService checkService;

	public SturbucksManager(CustomerCheckService checkService) {

		this.checkService = checkService;
	}

	public void save(Customer customer) {
		if (checkService.CheckIfRealPerson(customer)) {
			save(customer);
		}else {
			System.out.println("Not a valid person");
		}

	}

}
