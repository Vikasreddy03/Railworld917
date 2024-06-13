package com.jsp.Encapsulation;

public class Account 
{
private long account_no;
private String name,email;
private double balance;
public long getAccount_no() 
   {
	return account_no;
   }
public void setAccount_no(long account_no) 
   {
	this.account_no = account_no;
   }
public String getName() 
   {
	return name;
   }
public void setName(String name) 
   {
	this.name = name;
   }
public String getEmail() 
   {
	return email;
   }
public void setEmail(String email) 
   {
	this.email = email;
   }
public double getBalance() 
   {
	return balance;
   }
public void setBalance(double balance) 
   {
	this.balance = balance;
   }

}
