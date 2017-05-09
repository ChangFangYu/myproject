package oo.shopping;

public class GoldCustomer  extends Customer{

	public GoldCustomer(int customer, int silverCustomer, int goldenCustomer) {
		super(customer, silverCustomer, goldenCustomer);
		
	  
	}
	int count;
	int payoff;
	public void print(){
		
		System.out.println(count);
		
		System.out.println("輸入消費金額:");
		System.out.println("折扣後:");
		System.out.println("還元金:");
		System.out.println("count*0.9 + payoff*0.05");
		
	}

}
