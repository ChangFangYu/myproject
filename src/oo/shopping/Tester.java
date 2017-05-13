package oo.shopping;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
			
		String my_card; 
		int my_amount;
		Scanner scanner = new Scanner(System.in);
	    System.out.println("請輸入您的顧客身份(1.一般會員 2.銀卡會員 3.金卡會員):");
	    my_card = scanner.nextLine();
	    System.out.println("請輸入此次消費金額:");
	    my_amount = scanner.nextInt();

	    switch(my_card) { 
	     case "1": 
	        Customer customer1 = new Customer();
	        customer1.amount=my_amount;
	        customer1.get_Payamount();
	        break; 
	      case "2": 
	         SilverCustomer customer2 = new SilverCustomer();
	         customer2.amount=my_amount;
	         customer2.get_discount();
	         break; 
	      case "3": 
	         GoldCustomer customer3 = new GoldCustomer();
	         customer3.amount=my_amount;
	         customer3.get_discount();
	         customer3.get_returnRate();
	         break; 
		
	      }
	}
}
