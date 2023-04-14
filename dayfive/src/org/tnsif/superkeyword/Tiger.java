//program to demonstrate on super keyword
package org.tnsif.superkeyword;
public class Tiger extends Animal{
	//private data members
	public String animalType = "Tiger-Wild";
	public int noOfLegs = 4;
	
	
	//default constructor
	public Tiger() {
		//invoking the parent class constructor
		//calls parent class constructor
		super();
		System.out.println("Tiger class constructor - child");
	}



	public void display() {
		//super keyword with method
		super.display();
		//super keyword with variable
		System.out.println(super.animalType);
		System.out.println(super.noOfLegs);
		System.out.println("Animal Type: " + animalType);
		System.out.println("No. of Legs: " + noOfLegs);
	}

	

	@Override
	public String toString() {
		return "Tiger [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}
	
}
