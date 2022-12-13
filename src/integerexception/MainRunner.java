package integerexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {
		
		divide();
	}
	
	public static void divide() {
		
		boolean loopAgain = true;
		while(loopAgain) {
			
		try {
			
			Scanner in = new Scanner(System.in);
			int x = in.nextInt();
			int y = in.nextInt();
			int result = x / y;
			System.out.println("The result is : " + result);
			loopAgain = false;
			in.close();
			
		} catch(ArithmeticException e) {
			System.out.println("Please do not use zero");
		} catch (InputMismatchException e) {
			System.out.println("Please only use integers");
		}
		
		}
	}

}


