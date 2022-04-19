package interfaces;

public class SmsLoggger implements Logger {

	public void log(String mesage) {
		System.out.println("sms gönderildi " +mesage);
		
	}

}
