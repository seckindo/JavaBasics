package assignment303;

import java.io.*;
import java.util.Scanner;

public class assignment {

	public static void main(String[] args) {
		
		/*
		 * Q1
		 * Print a Multiplication Table
		 */
		
		int[][] matrix = new int [13][13];
		
		for (int row=1; row<matrix.length; row++) {
			for (int column = 1; column < matrix[row].length; column++) {
				matrix [row][column] = row*column;
				
				System.out.printf(matrix[row][column]+"\t");
			}
			
			System.out.println();
			
		}
		
		/*
		 * Q2
		 * Find the Greatest Common Divisor
		 */
		System.out.println("Please enter 2 positive integers to find GCD");
		Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int gcd = 1;
        
        for (int i = 1; i<=n1 && i<=n2; i++ ) {
        	if(n1%i==0 && n2%i==00) {
        		gcd = i;
        	}
        }
        
        System.out.println(gcd);
        
        /*
         * Q3
         * Predict Future Tuition
         */
        
        double tuit = 10000;
        int year=0;
        
        while (tuit<20000) {
        	tuit = tuit*1.07;
        	year++;
        }
        
        System.out.println(year);

	}

}
