package oo.mid;

import java.util.Scanner;

public class Meal {
        int price;
		String numbers;
		String snack;
		public Meal(int price, String numbers, String snack) {
			super();
			this.price = price;
			this.numbers = numbers;
			this.snack = snack;
		}
		public void print(){
			System.out.println("請輸入點餐號碼:");
		}
	    public int discount(){
	    	int dis = (int)(price*0.9f);
	    	return dis;
	    }
		
		

}


