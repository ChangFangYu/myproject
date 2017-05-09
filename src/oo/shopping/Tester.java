package oo.shopping;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer= new Customer(0, 0, 0);
		int count = 0;
		int payoff = 0;
		
		System.out.println("1.一般客戶, 2.銀級客戶, 3.金級客戶");
		System.out.println("消費金額:" + count +"\t");
		System.out.println("折扣後:" + count*0.9 +"\t");
		System.out.println("還元金:" + payoff*0.05 +"\t");
		
		
		

	}

}
