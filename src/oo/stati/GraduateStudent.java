package oo.stati;

public class GraduateStudent extends Student {
    int thesis;
    
    public GraduateStudent(int english, int math,int chinese){
    	this.english = english;
    	this.math = math;
    	this.chinese = chinese;
    }
    @Override  //防止複寫錯誤
    public void print(){
 	   System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese)+"\t"+getScore(thesis));
 	}
    
}
