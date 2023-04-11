//program to demonstrate on class, object and constructor
//driver class 
package org.tnsif.classandobject;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id;
		String city, name;
		System.out.println("Enter the Customer ID: ");
		id = sc.nextInt();
		//to read the nextLine
		sc.nextLine();
		System.out.println("Enter the Customer Name: ");
		name = sc.nextLine();
		System.out.println("Enter the Customer City: ");
		city = sc.nextLine();
		
		//object creation
		//default constructor invoked
		Customer c = new Customer();
		c.setCustomerId(id);
		c.setCustomerName(name);
		c.setCity(city);
		
		//below statement will call toString method
		System.out.println(c);
		
		System.out.println("Enter the Customer ID: ");
		id = sc.nextInt();
		//to read next line
		sc.nextLine();
		System.out.println("Enter the Customer Name: ");
		name = sc.nextLine();
		System.out.println("Enter the Customer City: ");
		city = sc.nextLine();
		Customer c1 = new Customer(id,name,city);
		System.out.println(c1);
	}

}
