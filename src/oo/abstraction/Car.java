package oo.abstraction;

public class Car {
	  int id;
      String brand;
      String name;
      int cc;
      String type;
      int status;
      float milage;
      
      public Car(String brand, String name){
    	  this(brand, name, 0); //只放在第一行
    	  System.out.println("haha");
      }
      
      public Car (String brand, String name, int cc){  //建構子
    	  this.brand= brand;
    	  this.name = name;
    	  this.cc = cc;
      }
      
      public void setMilage(int m){
    	  milage = m;
      }
      
      public float addMilage(int m){
    	  milage = milage + m;
    	  return milage;
      }
      
      public void maintain(){
    	  status = 5;
      }
}


