package oo.hsuan;

public class SilverCustomer extends Customer{

	float discount = 0.9f;
	
	public SilverCustomer() {
		super();
	}
	public SilverCustomer(int money){
		this.money = money;
	}
	public void print(){
		System.out.println(money + "\t" + money*discount + "\t" + "0");
	}
}