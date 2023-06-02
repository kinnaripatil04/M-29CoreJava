package org.tnsif.collections.list;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();//raw list --> heterogenous
		list.add(10);
		list.add(10.30);
		list.add("Kinna");
		list.add("Omi");
		list.add("Prati");
		list.add(45.0000000);
		list.add('A');
		list.add(true);
		System.out.println(list);
		ArrayList<String> list1 = new ArrayList<String>(); //homogeneous
		list1.add("Kinna");
		list1.add("Kavu");
		list1.add("Arni");
		System.out.println(list1);
		
	}

}
