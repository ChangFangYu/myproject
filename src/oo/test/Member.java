package oo.test;

public class Member {
	String id;
	private int age;
	String name;
	
	//建立空的建構子(PhoneMember&Member都要加)-第2種解決方法
	public Member() {
		super();
	}
	//如果加(String name)的話,PhoneMember之後會有問題,所以要解決辦法
	public Member(String name){
		System.out.println("member constructor");
	}
	
	void setAge(int age){
		if(age < 0){
			age = 0;
		}
		this.age = age;
	}
    public int getAge(){
    	return age;
    }
}
