//program to demonstrate nested if statement
package org.tnsif.decisionmaking;
import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num > 0) {
			//nested if
			if(num < 0) {
				System.out.println("Non zero number");
			}
			else {
				System.out.println("Zero");
			}
		}
		else {
			System.out.println("Either zero or non zero");
		}

	}

}
