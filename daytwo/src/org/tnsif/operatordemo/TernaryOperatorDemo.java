//program to demonstrate to Ternary Operator 
package org.tnsif.operatordemo;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		//syntax
		/*
		 (condition)?"T":"F";
		 */
		String isEven = (5%2==0)?"Even":"Odd";
		System.out.println(isEven);
	}

}
