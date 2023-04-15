package org.tnsif.recursion;

import java.util.Scanner;

public class FactorialByRecursion {
	int fact = 1;
	int factorial(int num) {
		if(num != 0) {
			fact = fact * num;
			factorial(num-1);
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to calculate factorial: ");
		int num = sc.nextInt();
		FactorialByRecursion f = new FactorialByRecursion();
		int result = f.factorial(num);
		System.out.println("Factorial is " + result);
	}
	}


