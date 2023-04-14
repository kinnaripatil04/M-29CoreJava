//program to demonstrate on hierarchical inheritance
//parent class
package org.tnsif.hierarchialinheritance;

public class Andriod {
	//private data members
	private String brand;
	private String ownerName;
	
	//getters and setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	//default constructor
	public Andriod() {
		System.out.println("Default Constructor");
		brand = "Realme";
		ownerName = "Li BingZhong";
	}
	//parameterized constructor
	public Andriod(String brand, String ownerName) {
		super();
		this.brand = brand;
		this.ownerName = ownerName;
	}
	//to string method
	@Override
	public String toString() {
		return "Andriod [brand=" + brand + ", ownerName=" + ownerName + "]";
	}
	
	
	
}
