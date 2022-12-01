package assignment303;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that creates an array of integers 
		 * with a length of 3. Assign the values 1, 2, and 3 
		 * to the indexes. Print out each array element.
		 */
		
		int [] list = {1,2,3};
		
		for (int i = 0; i<list.length; i++) {
			System.out.println(list[i]);
		}
		
		/*
		 * Write a program that returns the middle element in 
		 * an array. Give the following values to the integer 
		 * array: {13, 5, 7, 68, 2} and produce the following 
		 * output: 7
		 */
		
		int [] array = {13,5,7,68,2};
		
		int i = array.length / 2;
		
		System.out.println(array[i]);
		
		/*
		 * Write a program that creates an array of String type 
		 * and initializes it with the strings “red”, “green”, 
		 * “blue” and “yellow”. Print out the array length. Make 
		 * a copy using the clone( ) method. Use the 
		 * Arrays.toString( ) method on the new array to verify 
		 * that the original array was copied.
		 */
		
		String [] list1 = {"red","green","blue","yellow"};
		
		System.out.println(list1.length);
		
		String [] list2 = list1.clone();
		
		System.out.println(Arrays.toString(list2));
		
		/*
		 * Write a program that creates an integer array with 5 
		 * elements (i.e., numbers). The numbers can be any 
		 * integers.  Print out the value at the first index and 
		 * the last index using length - 1 as the index. Now try 
		 * printing the value at index = length 
		 * ( e.g., myArray[myArray.length ] ).  
		 * Notice the type of exception which is produced. 
		 * Now try to assign a value to the array index 5. 
		 * You should get the same type of exception.
		 */
		
		int numbers [] = {1,2,3,4,5};
		
		System.out.println(numbers[0]);
		System.out.println(numbers[numbers.length-1]);
		//System.out.println(numbers[numbers.length]);
		//numbers[5] = 6;
		
		/*
		 * Write a program where you create an integer array with 
		 * a length of 5. Loop through the array and assign the 
		 * value of the loop control variable (e.g., i) to the 
		 * corresponding index in the array.
		 */
		
		int numbers2 [] = new int[5];
		
		for (int j = 0; j < numbers2.length; j++) {
			numbers2 [j] = j;
		}
		
		System.out.println(Arrays.toString(numbers2));
		
		/*
		 * Write a program where you create an integer array of 
		 * 5 numbers. Loop through the array and assign the value 
		 * of the loop control variable multiplied by 2 to the 
		 * corresponding index in the array.
		 */
		
		int numbers3 [] = new int[5];
		
		for (int k = 0; k < numbers2.length; k++) {
			numbers3 [k] = k*2;
		}
		
		System.out.println(Arrays.toString(numbers3));
		
		/*
		 * Write a program where you create an array of 5 
		 * elements. Loop through the array and print the 
		 * value of each element, except for the middle 
		 * (index 2) element.
		 */
		
		int numbers4 [] = {5,6,7,8,9};
		
		for (int n = 0; n<numbers4.length; n++  ) {
			if (n==2) {
				continue;
			}
			
			System.out.println(numbers4[n]);
		}
		
		/*
		 * Write a program that creates a String array of 5 
		 * elements and swaps the first element with the middle 
		 * element without creating a new array.
		 */
		
		String list3 [] = {"First","Second","Third","Fourth","Fifth"};
		
		String temp = list3[2];
		list3[2] = list3[0];
		list3[0] = temp;
		
		System.out.println(Arrays.toString(list3));
		
		/*
		 * Write a program to sort the following int array in 
		 * ascending order: {4, 2, 9, 13, 1, 0}. Print the array 
		 * in ascending order, and print the smallest and the 
		 * largest element of the array. The output will look 
		 * like the following:
			Array in ascending order: 0, 1, 2, 4, 9, 13
			The smallest number is 0
			The biggest number is 13
		 */
		
		int [] numbers5 = {4,2,9,13,1,0};
		
		for (int a = 0; a<numbers5.length; a++) {
			for (int b = a+1; b<numbers5.length; b++) {
				int tmp = 0;
				if(numbers5[a]>numbers5[b]) {
					tmp = numbers5[a];
					numbers5[a] = numbers5[b];
					numbers5[b] = tmp;
					
				}
			}
		}
		
		System.out.println("Array in ascending order: " + Arrays.toString(numbers5));
		System.out.println("The smallest number is " + numbers5[0]);
		System.out.println("The biggest number is " + numbers5[numbers5.length-1]);
		
		/*
		 * Create an array that includes an integer, 3 strings, and 1 double. 
		 * Print the array.
		 */
		
		/*
		 *Write some Java code that asks the user how many favorite things they have. 
		 *Based on their answer, you should create a String array of the correct size. 
		 *Then ask the user to enter the things and store them in the array you created. 
		 *Finally, print out the contents of the array.
		 */
		
		System.out.println("How many favorite things do you have?");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		String list4 [] = new String[num];
		
		for (int c = 0; c < num; c++) {
			System.out.print("Enter your thing: ");
			list4[c]=in.next();
		}
		
		System.out.println("Your favorite things are:");
		for (int d = 0; d < num; d++) {
		System.out.print(list4[d]+" ");
		}
		

	}

}
