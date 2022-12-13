package stringexception;

import java.util.Scanner;

public class TypingPractice {

	public static void typeAbc() {

		Scanner in = new Scanner(System.in);
		String str = "";

		boolean loopAgain = true;
		while (loopAgain) {
			
			try {
				
				System.out.println("Please enter 3 letters");

			str = in.next();

			if (str.equals("abc")) {
				System.out.println("Done");
				loopAgain = false;
			} else {
				throw new MyException("incorrect input");
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		in.close();
	}

}