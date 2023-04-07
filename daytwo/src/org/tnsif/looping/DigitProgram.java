//program to demonstrate no. of digits in given input
package org.tnsif.looping;

import java.util.Scanner;

public class DigitProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int rev, count = 0;
		do {
			num = num / 10;
			count++;
		}while(num > 0);
		System.out.println("No of Digits in Given Number is: " + count);
	}

}
