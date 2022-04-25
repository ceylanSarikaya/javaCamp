package eCommerce.business.concretes;

import java.util.ArrayList;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.UserValidatorService;
import eCommerce.entities.concretes.User;

public class UserValidatorManager implements UserValidatorService {
	ArrayList<String> listofEmail = new ArrayList<String>();

	@Override
	public boolean emailValid(User user) {
		String regex = "^[A-Z0-9._%+-]+[A-Z0-9]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.A-Z{2,})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		if (user.getEmail().isEmpty()) {
			System.out.println(" Email boþ býrakmayýnýz");

		} else if (!pattern.matcher(user.getEmail()).find()) {
			System.out.println("e mail formatýnda olmalý");
			return false;
		}
		return true;
	}

	@Override
	public boolean firsNameValid(User user) {
		if (user.getFirstName().isEmpty()) {
			System.out.println("Ýsim alaný boþ býrakýlmaz");
			return false;
		} else if (user.getFirstName().length() > 3) {
			System.out.println("Ýsim en 2 karakter olmalýdýr.");
			return false;
		} else {
			System.out.println("Giriþ baþarýrsýz");
		}
		return true;
	}

	@Override
	public boolean lastNameValid(User user) {
		if (user.getLastName().isEmpty()) {
			System.out.println("Soyadý alaný boþ býrakýlmaz");
			return false;
		} else if (user.getLastName().length() > 3) {
			System.out.println("Soyisim en 2 karakter olmalýdýr.");
			return false;
		} else {
			System.out.println("Giriþ baþarýrsýz");
		}
		return true;
	}

	@Override
	public boolean passwordValid(User user) {
		if (user.getPassword().isEmpty()) {
			System.out.println("Þifre alaný boþ býrakýlmaz");
			return false;
		} else if (user.getFirstName().length() > 6) {
			System.out.println("Þifre en az 6 karakter olmalýdýr.");
			return false;
		} else {
			System.out.println("Giriþ baþarýrsýz");
		}
		return true;
	}

	@Override
	public boolean uniqueEmail(User user) {
		if (listofEmail.contains(user.getEmail())) {
			System.out.println("Bu meail daha önce kullanýlmýþtýr");
			return false;
		} else {
			listofEmail.add(user.getEmail());
		}
		return true;
	}

	@Override
	public boolean isValid(User user) {
		if (firsNameValid(user)&&lastNameValid(user)&&emailValid(user)&& uniqueEmail(user)==true) {
			return false;
		}
		return false;
	}

}
