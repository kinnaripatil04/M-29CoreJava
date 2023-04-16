package org.tnsif.singleton;

public class StaticExecutor {

	public static void main(String[] args) {
		SingletonByStatic s1 = SingletonByStatic.getInstance();
		SingletonByStatic s2 = SingletonByStatic.getInstance();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
