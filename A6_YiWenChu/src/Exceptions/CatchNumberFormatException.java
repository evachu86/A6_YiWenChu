/* 
 * Name: Yi-Wen Chu    991624614
 * Assignment: Question 
 * Program: Computer Systems Technology -
 * 	Software Development and Network Engineering
 * File: DemoNumberFormatException.java
 * Other Files in this Project: 
 * 
 * Main class: Main.java
 * 
 * Date: Aug 12, 2021
 * 
 * Description: The class demos the NumberFormatException.
 */
package Exceptions;

import java.util.Scanner;

public class CatchNumberFormatException {

	
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
		try (Scanner input = new Scanner(System.in)) {
			String numStr = input.next();
			System.out.println("The number you input is: "
					+Integer.parseInt(numStr));
		} catch(NumberFormatException e) {
			System.out.println("Please input an Arabic numeral integer.");
		}
	}

}

