package InterfaceAndAbstract;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		System.out.println("Bilgileri dogrula" + customer.getFirstName() + customer.getNationalityId());
		return true;
	}

}
