package com.jsp.Collections;
import java.util.*;
import java.util.Comparator;
public class SmartPhoneArray 
{
   public static void main(String[] args) 
   {
	   List<SmartPhone> phoneList = new ArrayList<>();  
       SmartPhone ph1 = new SmartPhone("Apple", "6s", 50000, 10);  
       SmartPhone ph2 = new SmartPhone("lg", "pro2", 40000, 9);  
       SmartPhone ph3 = new SmartPhone("MI", "3s", 10000, 6);  
       SmartPhone ph4 = new SmartPhone("Letv", "le2", 12000, 7);  
 
       phoneList.add(ph1);  
       phoneList.add(ph2);  
       phoneList.add(ph3);  
       phoneList.add(ph4);  
       System.out.println("Actual List");  
       System.out.println(phoneList);  
       
       
       for (SmartPhone smartPhone : phoneList) {
		System.out.println(smartPhone);
	}
       
       
       System.out.println(" -------------------------------------------");
       
       Collections.sort(phoneList,new brand());
       
       for (SmartPhone smartPhone_1 : phoneList) {
		System.out.println(smartPhone_1);
	}
   }  
 
}  
   

