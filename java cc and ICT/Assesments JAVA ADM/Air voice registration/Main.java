package com.cts;

import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String name,email;
		int age;
		long number;
		
		System.out.println("Enter the Name:");
		name=s.nextLine();
		
		System.out.println("Enter the ContactNumber:");
		number=s.nextLong();
		
		System.out.println("Enter the EmailId:");
		String ss=s.nextLine();
		email=s.nextLine();
		
		System.out.println("Age:");
		age=s.nextInt();
		
		System.out.println("");
		
		Customer c=new Customer();
		
		c.setCustomerName(name);
		c.setContactNumber(number);
		c.setEmailId(email);
		c.setAge(age);
		
		String mail=c.getEmailId();
		System.out.println("Name:"+c.getCustomerName());
		System.out.println("ContactNumber:"+c.getContactNumber());
		System.out.println("EmailId:"+mail);
		System.out.println("Age:"+c.getAge());
		
		
		
		
		
		
	}
}