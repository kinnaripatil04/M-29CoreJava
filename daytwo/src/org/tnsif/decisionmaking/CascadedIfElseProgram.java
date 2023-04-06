//program to demonstrate on cascaded if-else
package org.tnsif.decisionmaking;
import java.util.Scanner;
public class CascadedIfElseProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three values: ");
		float percentage1 = sc.nextFloat();
		float percentage2 = sc.nextFloat();
		float percentage3 = sc.nextFloat();
		if(percentage1 > percentage2 && percentage1 > percentage3) {
			System.out.println("Person 1 has highest percentage");
		}
		else if(percentage2 > percentage1 && percentage2 > percentage3) {
			System.out.println("Person 2 has highest percentage");
		}
		else {
			System.out.println("Person 3 has highest percentage");
		}
	}

}
