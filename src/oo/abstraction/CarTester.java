package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		Car c1 = new Car("TOYOTA", "ALTIS", 1800);
		Car c2 = new Car("HONDA", "ACCORD", 2000);
		Car c3 = new Car("TOYOTA", "WISH", 2000);
		
		//Arrays in Java
		int[] n = new int[5];
//		n[0] = 0;  可以不用設初始值
//		n[1] = 0;
//		n[2] = 0;
//		n[3] = 0;
//		n[4] = 0;
		System.out.println(n[2]); //0
		
		Car[] cars = new Car[3];
		System.out.println(cars[0]); //null(初始值)
		cars[0] = new Car("TOYOTA", "ALTIS", 1800);
		cars[1] = new Car("HONDA", "ACCORD", 2000);
	    cars[2]	= new Car("TOYOTA", "WISH", 2000);
	    cars[0].id = 301;
	    cars[1].id = 400;
	    cars[2].id = 403;
	    System.out.println(cars[0].name); //ALTIS
	    //Scoping
	    int i=0;
	    for (i=0; i<3; i++){
	    	System.out.println(cars[i].name); //ALTIS,ACCORD,WISH
	    }
	    System.out.println(i); //3
	    for (i=1; i<=9; i=i+2){
	    	System.out.println(i); //1,3,5,7,9
	    }
	    System.out.println(i); //11
	}
	class AA{
		
	}
}
