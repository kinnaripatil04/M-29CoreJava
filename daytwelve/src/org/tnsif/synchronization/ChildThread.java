package org.tnsif.synchronization;

public class ChildThread extends Thread{
	Person p;
	public ChildThread(Person p) {
		this.p = p;
		start();
	}
	public void run() {
		p.setName("Kinnari");
		System.out.println(p);
	}
}
