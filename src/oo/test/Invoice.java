package oo.test;

import java.util.ArrayList;
import java.lang.String;
import java.util.Scanner;

public class Invoice {
    //發票中獎:末三碼為321,821,886,554即中獎
	public static void main(String[] args) {
          ArrayList<String> a = new ArrayList<>();
          a.add("321");
          a.add("821");
          a.add("886");
          a.add("554");
          String my_str = " ";
          boolean flag = false;
          do{
        	  Scanner scanner = new Scanner(System.in);
              System.out.println("請輸入發票號碼:");
              my_str = scanner.nextLine();
              if (my_str.length()!=8) {
                      System.out.println("發票號碼有誤，請重新輸入:");
              }        
          }
          while (my_str.length()!=8);
          String get_str = my_str.substring(5, 8);
          for (int i=0;i<4;i++){
              flag=get_str.equals(a.get(i));
              System.out.print(a.get(i));
         
            if (flag){
              System.out.print(" --中獎囉! ");
            }
              else {
              System.out.print(" --沒中獎! ");
              }
   
           }
	}
}
