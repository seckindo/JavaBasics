package HackerRankAssignment303;

import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sca = new Scanner(System.in);
	        String A1 = sca.next();
	        
	        /* Enter your code here. Print output to STDOUT. */
	        
	        String result = "Yes";
	        
	        for (int i=0; i<A1.length()/2; i++ ) {
	            if (A1.charAt(i) != A1.charAt(A1.length()-1-i)) {
	                result = "No";
	            } 
	            
	        }
	        
	        System.out.println(result);

	}

}
