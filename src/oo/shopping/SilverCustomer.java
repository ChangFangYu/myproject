package oo.shopping;

public class SilverCustomer extends Customer{

	float discount;
	
	public void get_discount(){
	   discount=(float) (0.1*amount);
	   System.out.println("此次折扣金額為: "+ discount);
	   System.out.println("此次應付款金額為: "+ (amount-discount));
	}
}
