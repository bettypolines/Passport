package passport.utiliy;

import java.util.*;

public class helper {

		public static String readInput(String strMessage) {
			Scanner objScan = new Scanner(System.in);
			System.out.print(strMessage);
			String strInput = objScan.nextLine();
			return strInput;
		}
}
