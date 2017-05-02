package oo.stati;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Student.pass");
		Student stu1 = new Student (55, 88, 66);
		Student stu2 = new Student (67, 58, 77);
		stu1.pass = 70;
	    stu1.print();
		stu2.print();
		GraduateStudent gstu1 = new GraduateStudent(65,85,99);
		gstu1.print();
		
		
	}

}
