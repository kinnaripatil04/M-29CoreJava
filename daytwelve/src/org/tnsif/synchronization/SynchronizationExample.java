//driver class
//program to demonstrate without synchronization
package org.tnsif.synchronization;

public class SynchronizationExample {

	public static void main(String[] args) {
		Power obj = new Power();
		ThreadOne t1 = new ThreadOne(obj);
		ThreadTwo t2 = new ThreadTwo(obj);
		t1.start();
		t2.start();
	}

}
