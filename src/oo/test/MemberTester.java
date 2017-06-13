package oo.test;

public class MemberTester {

	public static void main(String[] args) {
		Member member = new Member("Eric");
		member.setAge(-5);
		System.out.println(member.getAge());
	
		//PhoneMember
		PhoneMember member2 = new PhoneMember();
		
		//示範要加以下這一行--第1種解決方法
		PhoneMember member3 = new PhoneMember("Hank");
	}

}
