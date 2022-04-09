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
 * Description: Demo InputMismatchException
 */
package Exceptions;

import java.util.Scanner;

/**
 * The class demos the InputMismatchException.
 *
 * @author Yi-Wen Chu
 * Computer Systems Technology
 * Software Development and Network Engineering
 */
public class DemoInputMismatchException {

	
	private static Scanner input;

	/**
	 * The main method to demo the InputMismatchException.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		System.out.print("Please input an number: ");
		
		/*
		 * Will throw InputMismatchException 
		 * if the user input a non-arabic numeral integer.
		 */
		input = new Scanner(System.in);
		int num = input.nextInt();
		
		System.out.println("The number you input is: "+num);
	}

}

