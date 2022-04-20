package com.spring.bo;

import com.spring.model.Recharge;
import com.spring.model.RechargePlan;
import java.util.*;
public class RechargeBO {

	public double processRecharge(Recharge recharge){
		double amount=0;
		// fill the code
		double rechargeamount=recharge.getRechargeAmount();
		RechargePlan rechargeplanobj=recharge.getRechargePlan();
		Map<Double, String> rechargeplans=rechargeplanobj.getRechargePlans();
		boolean flag=false;
		for(Double findamount:rechargeplans.keySet())
		{
		    if(findamount==rechargeamount)
		    {
		        flag=true;
		        break;
		    }
		}
		if(flag==true)
		{
		amount=(rechargeamount*recharge.getCashBackPercent())/100;
		}
		return amount;
	}
}
