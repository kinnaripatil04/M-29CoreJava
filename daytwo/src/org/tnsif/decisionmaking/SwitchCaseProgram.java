//program to demonstrate on switch case
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCaseProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the song input: ");
		int songInput = sc.nextInt();
		//switch case statement
		//if we don't add break in cases all the remaining cases will also be executed
		switch(songInput) {
		case 1: 
			System.out.println("Calm Down");
			break;
		case 2: 
			System.out.println("Perfect");
			break;
		case 3: 
			System.out.println("Mallem song");
			break;
		default: 
			System.out.println("Invalid Song");
		}
		
	}

}
