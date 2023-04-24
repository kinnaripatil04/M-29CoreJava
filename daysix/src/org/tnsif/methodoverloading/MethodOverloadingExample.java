//program to demonstrate on method overloading
package org.tnsif.methodoverloading;
//method overloading by passing different types of arguments
public class MethodOverloadingExample {
	public int multiplication(int a, int b) {
		return a * b;
	}
	public float multiplication(float a, float b) {
		return a * b;
	}
	public float multiplication(int a, float b) {
		return a * b;
	}
	public float multiplication(float a, int b) {
		return a * b;
	}
}
