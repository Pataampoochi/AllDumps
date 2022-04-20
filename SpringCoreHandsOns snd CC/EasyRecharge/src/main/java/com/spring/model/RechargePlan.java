package com.spring.model;


import java.util.Map;

//pojo class with required attributes,getters and setters 

public class RechargePlan {

private String operator;
private  Map<Double, String> rechargePlans;

public Map<Double, String> getRechargePlans() {
	return rechargePlans;
}

public void setRechargePlans(Map<Double, String> rechargePlans) {
	this.rechargePlans = rechargePlans;
}
public String getOperator() {
	return operator;
}
public void setOperator(String operator) {
	this.operator = operator;
}


}
