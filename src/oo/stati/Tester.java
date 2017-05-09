package oo.stati;

import java.util.ArrayList;

public class Tester extends Object{

	public static void main(String[] args) {
		System.out.println("Student.pass");
		Student stu1 = new Student (55, 88, 66);
		Student stu2 = new Student (67, 58, 77);
		Student stu3 = new Student (88, 99, 85);
		stu1.pass = 70;
	    stu1.print();
		stu2.print();
		GraduateStudent gstu1 = new GraduateStudent(65, 85, 99);
		GraduateStudent gstu2 = new GraduateStudent(78, 89, 60);
		gstu1.print();
		gstu2.print();
		//
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(55, 88, 66));
		list.add(new Student(67, 58, 77));
		list.add(new Student(88, 99, 85));
		list.add(new GraduateStudent(65, 85, 99));
		list.add(new GraduateStudent(78, 89, 60));
		for(int i = 0; i<list.size(); i++){
			Student stu = list.get(i);
			stu.print();
		}
		
		
	}

}
