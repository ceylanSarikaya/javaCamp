package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface UserService {
	 void singUp(User user);
	 void singIn(User user);
}
