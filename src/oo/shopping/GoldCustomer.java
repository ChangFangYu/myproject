package oo.shopping;

public class GoldCustomer  extends SilverCustomer{
	float returnRate;
	   public void get_returnRate(){
		 returnRate=(float) (0.05*(amount-discount));
	     System.out.println("此次獲得還原金額為: "+ returnRate);
	   }

}
