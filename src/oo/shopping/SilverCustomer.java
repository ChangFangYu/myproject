package oo.shopping;

public class SilverCustomer extends Customer{

	public SilverCustomer(int customer, int silverCustomer, int goldenCustomer) {
		super(customer, silverCustomer, goldenCustomer);
		
	}
	public void print(){
		System.out.println();
		System.out.println("1.一般客戶, 2.銀級客戶, 3.金級客戶");
		System.out.println("輸入消費金額:");
		System.out.println("折扣後:");
		System.out.println("還元金:");
		System.out.println("count*0.9");
		
	}
	

	

}
