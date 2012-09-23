package passport.Exceptions;

public class ExpiredPassportException extends Exception {
	
	public ExpiredPassportException() {
		super("This passport is already expired. Please visit http://www.passport.com.ph/set-appointment to renew your passport!");
	}

}
