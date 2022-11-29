package HackerRankAssignment303;

import java.io.*;
import java.util.*;

public class Assignment {

	public static void main(String[] args) {
		
		
	/*Q1
	 * String A is "hello" and B is "java". A has a length of , and B has a length of 4; 
	 * the sum of their lengths is 9. When sorted alphabetically/lexicographically, 
	 * "hello" precedes "java"; therefore,  is not greater than  and the answer is No. 
	 * When you capitalize the first letter of both  and  and then print them separated
	 * by a space, you get "Hello Java".
	 */
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length()+B.length());
        
        if (A.charAt(0)>B.charAt(0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+
        		" "+B.substring(0,1).toUpperCase()+B.substring(1));
        
        /*Q2
         * Given a string, S , and two indices, start and end, print a substring 
         * consisting of all characters in the inclusive range from start to end-1.
         * You'll find the String class' substring method helpful in completing 
         * this challenge.
         */
		
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        System.out.println(S.substring(start, end));
        
        /*Q3
         * Given a string, S, and an integer, k, complete the function so that it finds
         * the lexicographically smallest and largest substrings of length k.
         * Function Description
         * Complete the getSmallestAndLargest function in the editor below.
         * getSmallestAndLargest has the following parameters: string s: a string
         * int k: the length of the substrings to find
         */
        
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        //scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
        
        /*Q4
         * Given a string A, print Yes if it is a palindrome, print No otherwise.
         */

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
        
        /*Q5
         * Given a string, S, matching the regular expression [A-Za-z !,?._'@]+, 
         * split the string into tokens. We define a token to be one or more 
         * consecutive English alphabetic letters. Then, print the number of tokens, 
         * followed by each token on a new line.
         */
        
        Scanner scan1 = new Scanner(System.in);
        String s1 = scan1.nextLine();
        // Write your code here.
        scan1.close();
        
        String[] tokens = s1.split("[^a-zA-Z]");
        int numTokens = 0;
        
        for(int i = 0; i<tokens.length; i++) {
            if (tokens[i].length() > 0)
            numTokens++;
        }
        
        System.out.println(numTokens);
        
        for(int i =0; i<tokens.length; i++){
            if (tokens[i].length()>0)
            System.out.println(tokens[i]);
        }

	}

	 public static String getSmallestAndLargest(String s, int k) {
         String smallest = "";
         String largest = "";
         
         // Complete the function
         // 'smallest' must be the lexicographically smallest substring of length 'k'
         // 'largest' must be the lexicographically largest substring of length 'k'
         
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
         
         for (int i=0; i<s.length()-k+1; i++) {
             String s1=s.substring(i,i+k);
             if (smallest.compareTo(s1) > 0) {
                 smallest = s1;
             } 
             
             if(largest.compareTo(s1)<0) {
                 largest = s1;
             }
         }
         
         return smallest + "\n" + largest;
     }
}
