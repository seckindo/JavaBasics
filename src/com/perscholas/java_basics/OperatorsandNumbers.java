package com.perscholas.java_basics;

import java.lang.Math;

public class OperatorsandNumbers {

	public static void main(String[] args) {
		
		
		numberToBinary(); //Q1
		
		binaryToNumber(); //Q2
		
		leftShift(); //Q3

		rightShift(); //Q4
		
		bitwise();  //Q5
		
		postfix(); //Q6 - Q7
		
		prefix(); //Q8
		
	}
	
	public static void numberToBinary() {
		int num = 1;
		int div = 2;
		String str = "";
		int rem=0;
		
		while (div > 1) {
			div = num/2;
			rem = num %2;
			str = rem + str;
			num = div;
		}
		
		System.out.println(div + str);
		
		num = 8;
		div = 2;
		str = "";
		rem=0;
		
		while (div > 1) {
			div = num/2;
			rem = num %2;
			str = rem + str;
			num = div;
		}
		
		System.out.println(div + str);
		
		num = 33;
		div = 2;
		str = "";
		rem=0;
		
		while (div > 1) {
			div = num/2;
			rem = num %2;
			str = rem + str;
			num = div;
		}
		
		System.out.println(div + str);
		
		num = 78;
		div = 2;
		str = "";
		rem=0;
		
		while (div > 1) {
			div = num/2;
			rem = num %2;
			str = rem + str;
			num = div;
		}
		
		System.out.println(div + str);
		
		num = 787;
		div = 2;
		str = "";
		rem=0;
		
		while (div > 1) {
			div = num/2;
			rem = num %2;
			str = rem + str;
			num = div;
		}
		
		System.out.println(div + str);
		
		num = 33987;
		div = 2;
		str = "";
		rem=0;
		
		while (div > 1) {
			div = num/2;
			rem = num %2;
			str = rem + str;
			num = div;
		}
		
		System.out.println(div + str);
	}
	
	public static void binaryToNumber() {
		String binaryNum = "0010";
		int decNum = 0;
		
		for (int i = binaryNum.length()-1; i>=0; i--) {
			if (binaryNum.charAt(i) == '1') {
				decNum = (int) (decNum + Math.pow(2,((binaryNum.length()-1-i))));
			}
		}
		
		System.out.println(decNum);
		
		binaryNum = "1001";
		decNum = 0;
		
		for (int i = binaryNum.length()-1; i>=0; i--) {
			if (binaryNum.charAt(i) == '1') {
				decNum = (int) (decNum + Math.pow(2,((binaryNum.length()-1-i))));
			}
		}
		
		System.out.println(decNum);
		
		binaryNum = "00110100";
		decNum = 0;
		
		for (int i = binaryNum.length()-1; i>=0; i--) {
			if (binaryNum.charAt(i) == '1') {
				decNum = (int) (decNum + Math.pow(2,((binaryNum.length()-1-i))));
			}
		}
		
		System.out.println(decNum);
		
		binaryNum = "01110010";
		decNum = 0;
		
		for (int i = binaryNum.length()-1; i>=0; i--) {
			if (binaryNum.charAt(i) == '1') {
				decNum = (int) (decNum + Math.pow(2,((binaryNum.length()-1-i))));
			}
		}
		
		System.out.println(decNum);
		
		binaryNum = "001000011111";
		decNum = 0;
		
		for (int i = binaryNum.length()-1; i>=0; i--) {
			if (binaryNum.charAt(i) == '1') {
				decNum = (int) (decNum + Math.pow(2,((binaryNum.length()-1-i))));
			}
		}
		
		System.out.println(decNum);
		
		binaryNum = "0010110001100111";
		decNum = 0;
		
		for (int i = binaryNum.length()-1; i>=0; i--) {
			if (binaryNum.charAt(i) == '1') {
				decNum = (int) (decNum + Math.pow(2,((binaryNum.length()-1-i))));
			}
		}
		
		System.out.println(decNum);
	}
	
	public static void leftShift() {
		int x = 2;
		System.out.println(Integer.toBinaryString(x));
		int y = x << 2;
		x = y;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
		x = 9;
		System.out.println(Integer.toBinaryString(x));
		y = x << 2;
		x = y;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
		x = 17;
		System.out.println(Integer.toBinaryString(x));
		y = x << 2;
		x = y;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
		x = 88;
		System.out.println(Integer.toBinaryString(x));
		y = x << 2;
		x = y;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
	}
	
	public static void rightShift() {
		int xx = 150;
		System.out.println(Integer.toBinaryString(xx));
		int yy = xx >> 2;
		xx = yy;
		System.out.println(xx);
		System.out.println(Integer.toBinaryString(xx));
		
		xx = 225;
		System.out.println(Integer.toBinaryString(xx));
		yy = xx >> 2;
		xx = yy;
		System.out.println(xx);
		System.out.println(Integer.toBinaryString(xx));
		
		xx = 1555;
		System.out.println(Integer.toBinaryString(xx));
		yy = xx >> 2;
		xx = yy;
		System.out.println(xx);
		System.out.println(Integer.toBinaryString(xx));
		
		xx = 32456;
		System.out.println(Integer.toBinaryString(xx));
		yy = xx >> 2;
		xx = yy;
		System.out.println(xx);
		System.out.println(Integer.toBinaryString(xx));
	}
	
	public static void bitwise() {
		int xxx = 7;
		int yyy = 17;
		int zzz = xxx & yyy;
		System.out.println("x&y = " + zzz);
		zzz = xxx | yyy;
		System.out.println("x|y = " + zzz);
	}
	
	public static void postfix() {
		int postFix = 3;
		System.out.println(postFix);
		postFix++;
		System.out.println(postFix);
		
		for (postFix = 4; postFix <=7; postFix++) {
			System.out.println(postFix);
		}
		
		while (postFix <= 11) {
			postFix++;
			System.out.println(postFix);
		}
	}
	
	public static void prefix() {
		int xxxx = 5;
		int yyyy = 8;
		
		int sum = ++xxxx + yyyy;
		System.out.println("sum is " + sum);
		
		xxxx = 5;
		
		sum = xxxx++ + yyyy;
		System.out.println("sum is " + sum);
	}

}
