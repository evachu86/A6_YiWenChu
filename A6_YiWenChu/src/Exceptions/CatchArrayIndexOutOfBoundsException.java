/* 
 * Name: Yi-Wen Chu    991624614
 * Assignment: Assignment 6  
 * Program: Computer Systems Technology -
 * 	Software Development and Network Engineering
 * File: DemoArrayIndexOutOfBoundsException.java
 * Other Files in this Project:
 * DemoArrayIndexOutOfBoundsException.java 
 * CatchArrayIndexOutOfBoundsException.java
 * DemoInputMismatchException.java
 * CatchInputMismatchException.java
 * DemoNumberFormatException.java
 * CatchDemoNumberFormatException.java
 * 
 * Date: Aug 12, 2021
 * 
 * Description: Try-catch Demo for ArrayIndexOutOfBoundsException.
 */
package Exceptions;


/**
 * The class demos the try-catch handling of ArrayIndexOutOfBoundsException.
 *
 * @author Yi-Wen Chu
 * Computer Systems Technology
 * Software Development and Network Engineering
 */
public class CatchArrayIndexOutOfBoundsException {

	
	/**
	 * The main method to demo the try-catch handle 
	 * of ArrayIndexOutOfBoundsException.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		/*
		 * Two arrays with different length put in the same for-loop
		 * will cause ArrayIndexOutOfBoundsException.
		 */  
		int[] arr1 = {1,2,3};
		int[] arr2 = {5,4,3,2,1};
		
		try {
			for(int i = 0; i < arr2.length; i++) {
				System.out.println("The number with index "+ i 
						+ " in arr1 is "+arr1[i]);
				System.out.println("The number with index "+ i 
						+ " in arr2 is "+arr2[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The two arrays in the loop "
					+ "have different length, "
					+ "Please handle them in different loop.");
		}
	}

}

