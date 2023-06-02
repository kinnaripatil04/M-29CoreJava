package org.tnsif.collections.list;

import java.util.Arrays;
import java.util.List;

public class StudentListDemo {

	public static void main(String[] args) {
		Student st[] = new Student[5];
		st[0] = new Student(1, "John", 67);
		st[1] = new Student(12, "Rahul", 80);
		st[2] = new Student(5, "Omkar", 78);
		st[3] = new Student(2, "Kinna", 90);
		st[4] = new Student(22, "Sai", 80);
		List<Student> studentList = Arrays.asList(st);
		System.out.println(studentList);
	}

}
