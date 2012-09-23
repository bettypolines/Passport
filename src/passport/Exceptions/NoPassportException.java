package passport.Exceptions;

public class NoPassportException extends Exception {
	
	public NoPassportException() {
		super("Passport does not exist");
	}
}
