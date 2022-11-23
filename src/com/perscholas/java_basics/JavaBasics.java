package com.perscholas.java_basics;

public class JavaBasics {

	public static void main(String[] args) {
		
		int int1 = 5;
		int int2 = 10;
		
		int sum = int1 + int2;
		
		System.out.println("The sum is " + sum);
		
		double d1 = 3.4d;
		double d2 = 2.7d;
		
		double sumd = d1 + d2;
		
		System.out.println(("The sum of doubles is ") + sumd);
		
		int int3 = 15;
		double d3 = 3.9;
		
		double sumd2 = int3 + d3;
		System.out.println("The sum of int and double is " + sumd2);
		
		int int4 = 17;
		double int5 = 23;
		
		double result = int5/int4;
		System.out.println("The result is " + result);
		
		double d4 = 45.7;
		double d5 = 33.5;
		
		double result2 = d4 / d5;
		System.out.println("The new result is " + result2);
		System.out.println("The new result as an integer is " + (int)(result2));
		
		int x = 5;
		int y = 6;
		double q = y/x;
		System.out.println("q is " + q);
		q = (double)y/x;
		System.out.println("q with double is " + q);
		
		final double PI = 3.14;
		double area = 5 * 5 * PI;
		System.out.println("The area is " + area);
		
		double coffee = 3.99d;
		double cappuccino = 4.99d;
		double espresso = 5.99d;
		
		double subtotal = (3*coffee) + (4*cappuccino) + (2*espresso);
		
		double salesTax= subtotal * 0.085;
		
		double totalSales = subtotal + salesTax;
		
		System.out.printf("The total is " + "%.2f", totalSales);
		
		
		
		
		

	}

}
