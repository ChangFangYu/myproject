package oo.stati;

public class Student {
    int english;
	int math;
	int chinese;
	static int pass = 60;
	static {
		System.out.println("STATIC!!!");
//		System.out.println(english); why? 因為不在static裡面
		System.out.println("pass");
	}
	
	//(建立建構子)快速鍵---右鍵 + Source + Generate Constructer using fields
	public Student(int english, int math, int chinese) {
		super();  
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	
	public void print(){
	   System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese));
	}
	private String getScore(int score){
		if (score < pass){
			return String.valueOf(score)+"*";  //.valueOf(score)---整數變成字串
		}else{
			return String.valueOf(score);
		}
		
	}
}
