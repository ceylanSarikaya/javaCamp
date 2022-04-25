package eCommerce.core.abstracts;

public interface GoogleSingUpService {
void sendToVerifyMail(String email);
boolean checkVerifyAccount(String email);
}
