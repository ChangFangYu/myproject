package oo.mid;

public class Meal1 {
	//建立一個麥當勞點餐系統過程:包含建構子,屬性,方法
	   String meal_item;
	   int meal_qty;
	   int meal_price;
	 
	 
	  public Meal1(String meal_item, int meal_qty, int meal_price)
	  {
	      this.meal_item = meal_item;
	      this.meal_qty = meal_qty;
	      this.meal_price = meal_price;
	  }
	  
	  public int order_amt(int meal_qty, int meal_price)
	  {
	       return meal_qty * meal_price;
	  }
	 
}
