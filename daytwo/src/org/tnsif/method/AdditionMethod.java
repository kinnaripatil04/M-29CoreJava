package org.tnsif.method;

import java.util.Scanner;

public class AdditionMethod {
	void add(int a, int b) {
		int c = a + b;
		System.out.println(a + " + " + b + " = " + c);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values for addition: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		AdditionMethod am = new AdditionMethod();
		am.add(a, b);
	}

}
