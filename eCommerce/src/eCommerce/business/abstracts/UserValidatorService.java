package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface UserValidatorService {
boolean emailValid(User user);
boolean uniqueEmail (User user);
boolean firsNameValid(User user);
boolean lastNameValid(User user);
boolean passwordValid(User user);
boolean isValid(User user);

}
