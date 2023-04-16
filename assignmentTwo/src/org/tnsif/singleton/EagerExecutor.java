package org.tnsif.singleton;

public class EagerExecutor {

	public static void main(String[] args) {
		
		SingletonByEager singleton1 = SingletonByEager.getInstance();
		SingletonByEager singleton2 = SingletonByEager.getInstance();

		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}

}
