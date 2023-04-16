//program to demonstrate singleton design pattern using eager initialization
package org.tnsif.singleton;

public class SingletonByStatic {
	private static SingletonByStatic ins = null;
	
	//private constructor
	private SingletonByStatic() {
		
	}
	//static initialization
	static {
		try {
			if(ins == null) {
				ins = new SingletonByStatic();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static SingletonByStatic getInstance() {
		return ins;
	}
}