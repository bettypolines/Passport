package passport.checking;

import passport.Exceptions.*;

public class PassportCheck {
	public void checkPassport(String strPassportStatus, int intNumber) 
	throws LostPassportException, ExpiredPassportException, NoPassportException {
		
		if(strPassportStatus.equals("Lost")) {
			throw new LostPassportException();
		} else if (strPassportStatus.equals("Expired")) {
			throw new ExpiredPassportException(); 	
		} else if (strPassportStatus.equals("None")) {
			throw new NoPassportException();
		} else {
			System.out.println("Please input your passport number!");
		}
	}
}







