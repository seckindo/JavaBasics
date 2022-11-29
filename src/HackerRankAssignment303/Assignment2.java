package HackerRankAssignment303;

import java.io.*;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		/*Q1
		 * 
		 */
		
		int x;
		x = 15;
		
		if(x<10) {
			System.out.println("Less than 10");
		}
		
		/*
		 * Q2
		 */
		
		int x1;
		x1 = 15;
		if (x1 < 10 ) {
			System.out.println("Less than 10");
		} else
			System.out.println("Greater than 10");
		
		/*
		 * Q3
		 */
		
		int x3;
		x3 = 50;
		
		if (x3 < 10) {
			System.out.println("Less than 10");
		} else if (10<x3&&x3<20) {
			System.out.println("Between 10 and 20");
		} else if (x3 >= 20) {
			System.out.println("Greater than or equal to 20");
		}
		
		/*
		 * Q4
		 */
		
		int x4 = 5;
		
		if (x4>=10 && x4<=20) {
			System.out.println("In range");
		} else
			System.out.println("Out of range");
		
		/*
		 * Q5
		 */
		System.out.println("Please enter the points up to 100 to see the letter grade");
		
		Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        
        if (score>100) {
        	System.out.println("Score out of range");
        } else if (score>=90) {
        	System.out.println("A");
        } else if (score>=80) {
        	System.out.println("B");
        } else if (score>=70) {
        	System.out.println("C");
        } else if (score>=60) {
        	System.out.println("D");
        } else if (score>=0) {
        	System.out.println("F");
        } else if (score < 0) {
        	System.out.println("Score out of range");
        }
        
        /*
         * Q6
         */
        
        System.out.println("Please enter a number from 1 to 7 to see the weekday");
        
        Scanner scan = new Scanner(System.in);
        int number = in.nextInt();
        
        switch(number)
        {
        case 1: System.out.println("Monday");
        	break;
        case 2: System.out.println("Tuesday");
    		break;
        case 3: System.out.println("Wednesday");
    		break;
        case 4: System.out.println("Thursday");
    		break;
        case 5: System.out.println("Friday");
    		break;
        case 6: System.out.println("Saturday");
    		break;
        case 7: System.out.println("Sunday");
    		break;
    	default: System.out.println("Out of range");
        }
        
        /*
         * Q7
         */
        
        System.out.println("Enter your filling status (1 for Single, 2 for Married "
        		+ "Filling Jointly, 3 for Married Filling Seperately, 4 for Head "
        		+ "of houshold");
        
        Scanner sca = new Scanner(System.in);
        int type = in.nextInt();
        
        System.out.println("Enter your annual taxable income");
        
        int income = in.nextInt();
        
        switch(type)
        {
        case 1: if (income>372950) {
        	System.out.println("35%");
        }else if (income>171550) {
        	System.out.println("33%");
        } else if (income>82250 ) {
        	System.out.println("28%");
        } else if (income>33950) {
        	System.out.println("25%");
        }else if (income>8350) {
        	System.out.println("15%");
        }else if(income>0) {
        	System.out.println("10%");
        }
        break;
        case 2: if (income>372950) {
        	System.out.println("35%");
        }else if (income>208850) {
        	System.out.println("33%");
        } else if (income>137050 ) {
        	System.out.println("28%");
        } else if (income>67900) {
        	System.out.println("25%");
        }else if (income>16700) {
        	System.out.println("15%");
        }else if(income>0) {
        	System.out.println("10%");
        }
        break;
        case 3: if (income>186475) {
        	System.out.println("35%");
        }else if (income>104425) {
        	System.out.println("33%");
        } else if (income>68525 ) {
        	System.out.println("28%");
        } else if (income>33950) {
        	System.out.println("25%");
        }else if (income>8350) {
        	System.out.println("15%");
        }else if(income>0) {
        	System.out.println("10%");
        }
        break;
        case 4: if (income>372950) {
        	System.out.println("35%");
        }else if (income>190200) {
        	System.out.println("33%");
        } else if (income>117450 ) {
        	System.out.println("28%");
        } else if (income>45500) {
        	System.out.println("25%");
        }else if (income>11950) {
        	System.out.println("15%");
        }else if(income>0) {
        	System.out.println("10%");
        }
        break;
        default: System.out.println("No data found. Please check your input and try "
        		+ "again later");
        }



	}

}
