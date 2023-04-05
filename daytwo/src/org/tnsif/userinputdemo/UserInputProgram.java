//program to demonstrate on user-input value
package org.tnsif.userinputdemo;

import java.util.Scanner;
public class UserInputProgram {

	public static void main(String[] args) {
		//user-input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary: ");
		float salary = sc.nextFloat();
		//double salary1 = sc.nextDouble();
		System.out.println("Enter your Name: ");
		//next is used to get first word of sentence
		String name = sc.next();
		sc.nextLine();
		System.out.println("Enter your Name1: ");
		//nextLine() is used to get entire sentence of your string
		String name1 = sc.nextLine();
		System.out.println("Enter Character: ");
		char ch = sc.next().charAt(1);
		System.out.println("Salary is: "+salary);
		System.out.println("Name is: "+name);
		System.out.println("Name is: "+name1);
		System.out.println("Character is: "+ch);
		sc.close();
	}

}
