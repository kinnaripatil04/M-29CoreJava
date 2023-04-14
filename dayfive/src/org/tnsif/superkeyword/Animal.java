//program to demonstrate on super keyword
package org.tnsif.superkeyword;
public class Animal {
	//private data members
	public String animalType = "Wild";
	public int noOfLegs = 2;
	
	
	public Animal() {
		super();
		System.out.println("Animal class constructor - parent");
	}
	
	public void display() {
		System.out.println("Animal Type: " + animalType);
		System.out.println("No. of Legs: " + noOfLegs);
	}
	//to string method
	@Override
	public String toString() {
		return "Animal [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}
}