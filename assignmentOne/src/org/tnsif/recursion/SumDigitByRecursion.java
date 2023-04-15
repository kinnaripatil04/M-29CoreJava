package org.tnsif.recursion;

import java.util.Scanner;

public class SumDigitByRecursion {
	int sumofdigits(int num) {
		if(num != 0) {
			return (num % 10 + sumofdigits(num/10));
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		SumDigitByRecursion sd = new SumDigitByRecursion();
		int result = sd.sumofdigits(num);
		System.out.println("Sum of digits is " + result);

	}

}

