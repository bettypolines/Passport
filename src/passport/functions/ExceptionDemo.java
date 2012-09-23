package passport.functions;

import passport.checking.*;
import passport.Exceptions.*;
import passport.utiliy.*;

public class ExceptionDemo {

public static void main(String[] args) {
		
		try {
			String strNumber = helper.readInput("Enter Passport Number: ");
			int intNumber = Integer.parseInt(strNumber);
			new PassportCheck().checkPassport("", intNumber);
			
		} catch (LostPassportException scce) {
			System.out.println(scce.getMessage());
		} catch (ExpiredPassportException ecce) {
			System.out.println(ecce.getMessage()); 
		} catch (NoPassportException ncce) {
			System.out.println(ncce.getMessage());
		} catch (Exception e) {
			System.out.println("Invalid input. Please try again.");
		} finally { 
			System.out.println("Thank you!");
		}
}
}

