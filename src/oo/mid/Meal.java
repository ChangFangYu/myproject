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
			System.out.println("�п�J�I�\���X:");
		}
	    public int discount(){
	    	int dis = (int)(price*0.9f);
	    	return dis;
	    }
		
		

}


