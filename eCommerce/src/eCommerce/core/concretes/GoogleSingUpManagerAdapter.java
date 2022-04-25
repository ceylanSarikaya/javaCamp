package eCommerce.core.concretes;

import eCommerce.core.abstracts.GoogleSingUpService;
import eCommerce.googleSingUp.GoogleSingUpManager;

public class GoogleSingUpManagerAdapter implements GoogleSingUpService{

 GoogleSingUpManager googleSingUpManagerService=new GoogleSingUpManager();

	@Override
	public void sendToVerifyMail(String email) {
		googleSingUpManagerService.sendToVerifyMail(email);
		
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		googleSingUpManagerService.checkVerifyAccount(email);
		return false;
	}	


}
