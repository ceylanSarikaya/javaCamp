package eCommerce.business.concretes;

import eCommerce.business.abstracts.UserService;
import eCommerce.core.abstracts.GoogleSingUpService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {
	UserDao userDao;
	UserValidatorManager userValidatorManager;
	GoogleSingUpService googleSingUpService;

	public UserManager(UserDao userDao, UserValidatorManager userValidatorManager,
			GoogleSingUpService googleSingUpService) {
		super();
		this.userDao = userDao;
		this.userValidatorManager = userValidatorManager;
		this.googleSingUpService = googleSingUpService;
	}



	@Override
	public void singUp(User user) {
		if (userValidatorManager.isValid(user) == true) {
			System.out.println("Kullanýcý baþarýyla sisteme eklendi ");
			googleSingUpService.sendToVerifyMail(user.getEmail());
			userDao.add(user);
		}

	}

	@Override
	public void singIn(User user) {
		if (userDao.getEmail(user.getEmail()) && userDao.getPassword(user.getPassword())
				&& googleSingUpService.checkVerifyAccount(user.getEmail()) == true) {
			System.out.println("Kullanýcý giriþi yapýldý ");
		} else if (googleSingUpService.checkVerifyAccount(user.getEmail())==false) {
			System.out.println("Üzgünüm meail adresiniz doðrulanmadý");
		}
		
		
		else {
			System.out.println("Kullnýcý bilgileri yanlýþ lütfen kontrol ediniz.");
		}

	}

}
