package passport.Exceptions;

public class LostPassportException extends Exception {
	
	public LostPassportException() {
		super("This is a lost passport! Please visit http://www.passport.com.ph/ to set an appointment");
	}
	
}