package interfacesHomework;

public class Main {

	public static void main(String[] args) {
		//interface onu implemete eden clasý tutatbilir ancak kedisi newlenemez.
		//Claslar birden fazla interface implemete edebilir.
		//Bir classý exdent edebilir.
		CustomerDal customerDal=new OracleCustomerDal();
		CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
	
		customerDal.add();

	}

}
