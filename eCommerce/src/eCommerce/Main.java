package eCommerce;

import eCommerce.business.concretes.UserManager;
import eCommerce.business.concretes.UserValidatorManager;
import eCommerce.core.concretes.GoogleSingUpManagerAdapter;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Ceylan", "Sarýkaya", "ceylan@gmail.com", "ceylan123");
		User user1 = new User(1, "Engin", "Demirog", "engin@gmail.com", "123456");
		UserManager userManager = new UserManager(new HibernateUserDao(), 
				new UserValidatorManager()
				,new GoogleSingUpManagerAdapter());
		
		userManager.singIn(user1);
		userManager.singUp(user);


	}

}
