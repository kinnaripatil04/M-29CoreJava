//program to demonstrate on Arithmetic Operator
//(+,-,*,/,%)
package org.tnsif.operatordemo;

import java.util.Scanner;

public class ArithmeticOperatorProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for x and y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("The addition of two numbers: "+ (x+y));
		System.out.println("The subtraction of two numbers: "+ (x-y));
		System.out.println("The multiplication of two numbers: "+ (x*y));
		System.out.println("The division of two numbers: "+ (x/y));
		System.out.println("The modulus of two numbers: "+ (x%y));

	}

}
