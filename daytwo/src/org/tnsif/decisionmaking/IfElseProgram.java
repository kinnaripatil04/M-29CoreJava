//program to demonstrate on if--else condition
package org.tnsif.decisionmaking;
import java.util.Scanner;
public class IfElseProgram {
	/* if we have two condition to decide then we will use
	 * if-else
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age and weight of donor: ");
		int age = sc.nextInt();
		int weight = sc.nextInt();
		if(age > 18 && weight > 50) {
			System.out.println("Eligible to donate blood");
		}
		else {
			System.out.println("Not eligible to donate blood");
		}
	}

}
