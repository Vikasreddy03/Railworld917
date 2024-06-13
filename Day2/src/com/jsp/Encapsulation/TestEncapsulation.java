package com.jsp.Encapsulation;

public class TestEncapsulation 
{
	public static void main(String[] args) {  
	    //creating instance of Account class  
	    Account acc=new Account();  
	    //setting values through setter methods  
	    acc.setAccount_no(7560504000L);  
	    acc.setName("K.Vukas Reddy");  
	    acc.setEmail("vikasreddyk123@gmail.com");  
	    acc.setBalance(500000.0);  
	    //getting values through getter methods  
	   System.out.println(acc.getAccount_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getBalance()); 
	}  
}
