package oo.mid;

import java.util.Scanner;

public class Meal {
//建立一個麥當勞點餐系統過程:包含建構子,屬性,方法		
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


