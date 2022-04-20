package com.spring.main;
import java.util.*;
import com.spring.service.RechargeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.exception.InvalidRechargePackException;

public class Driver {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Recharge Id:");
	    String rechargeId=sc.next();
	    System.out.println("Enter the Operator:");
	    String operator=sc.next();
	    System.out.println("Enter the Customer PhoneNumber:");
	    long phonenumber=sc.nextLong();
	    System.out.println("Enter the Recharge Amount:");
	    double rechargeamount=sc.nextDouble();
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		RechargeService rechargeserviceobj=(RechargeService) ctx.getBean("rechargeservice");
		double amount=0;
		try
		{
		amount=rechargeserviceobj.processRecharge(rechargeId,operator,phonenumber,rechargeamount);
		}
		catch(InvalidRechargePackException exc)
		{
		    System.out.println(exc.getMessage());
		}
		if(amount!=0)
		{
		    System.out.println("Recharge of "+rechargeamount+" is successful. You got a cash back of RS:"+amount);
		}
	}	 
	
}
