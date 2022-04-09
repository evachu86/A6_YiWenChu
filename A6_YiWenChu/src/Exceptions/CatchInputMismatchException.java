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
 * Description: Try-catch Demo for InputMismatchException
 */
package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The class demos the try-catch handling of InputMismatchException.
 *
 * @author Yi-Wen Chu
 * Computer Systems Technology
 * Software Development and Network Engineering
 */
public class CatchInputMismatchException {

	
	/**
	 * The main method to demo the try-catch handle of 
	 * InputMismatchException.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		System.out.print("Please input an number: ");
		
		/*
		 * Will throw InputMismatchException 
		 * if the user input a non-Arabic numeral integer.
		 */
		try (Scanner input = new Scanner(System.in)) {
			int num = input.nextInt();
			System.out.println("The number you input is: "+num);
		} catch(InputMismatchException e) {
			System.out.println("Please input an Arabic numeral integer.");
		}
		
	}

}

