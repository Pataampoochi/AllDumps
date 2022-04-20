package com.spring.service;

import com.spring.bo.RechargeBO;
import com.spring.model.Recharge;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.exception.InvalidRechargePackException;

public class RechargeService {
	
	private RechargeBO rechargeBO;
		
	public RechargeBO getRechargeBO() {
		return rechargeBO;
	}

	public void setRechargeBO(RechargeBO rechargeBO) {
		this.rechargeBO = rechargeBO;
	}

	public double processRecharge(String rechargeId, String operator,long phoneNumber,double rechargeAmount) throws InvalidRechargePackException{
		double amount=0;
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Recharge rechargeobj=(Recharge) ctx.getBean("recharge");
		rechargeobj.setRechargeId(rechargeId);
		rechargeobj.setPhoneNumber(phoneNumber);
		rechargeobj.setRechargeAmount(rechargeAmount);
		amount=rechargeBO.processRecharge(rechargeobj);
		if(amount==0)
		{
		    throw new InvalidRechargePackException("Recharge Pack not available");
		}
		return amount;
	}
}

