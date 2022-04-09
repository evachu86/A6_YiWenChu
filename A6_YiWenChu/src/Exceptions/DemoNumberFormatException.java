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
 * Description: The class demos the NumberFormatException.
 */
package Exceptions;

import java.util.Scanner;

public class DemoNumberFormatException {

	
	private static Scanner input;

	/**
	 * The main method to demo the NumberFormatException.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		System.out.print("Please input an integer: ");
		
		/* Though this method read input as string first,
		 * it doesn't verify the input so still throw NumberFormatException 
		 * if the user input a non-Arabic numeral integer.
		 */
		input = new Scanner(System.in);
		String numStr = input.next();
		System.out.println("The number you input is: "
				+Integer.parseInt(numStr));
	}

}

