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
			System.out.println("Kullan�c� ba�ar�yla sisteme eklendi ");
			googleSingUpService.sendToVerifyMail(user.getEmail());
			userDao.add(user);
		}

	}

	@Override
	public void singIn(User user) {
		if (userDao.getEmail(user.getEmail()) && userDao.getPassword(user.getPassword())
				&& googleSingUpService.checkVerifyAccount(user.getEmail()) == true) {
			System.out.println("Kullan�c� giri�i yap�ld� ");
		} else if (googleSingUpService.checkVerifyAccount(user.getEmail())==false) {
			System.out.println("�zg�n�m meail adresiniz do�rulanmad�");
		}
		
		
		else {
			System.out.println("Kulln�c� bilgileri yanl�� l�tfen kontrol ediniz.");
		}

	}

}
