 77  
SpringCoreHandsOns snd CC/EasyRecharge/pom.xml
@@ -0,0 +1,77 @@
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>EasyRecharge</groupId>
  <artifactId>EasyRecharge</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>jar</packaging>

  <name>EasyRecharge</name>
  <url>http://maven.apache.org</url>

  <dependencies>
     	<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>4.3.10.RELEASE</version>
	</dependency>

	<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>
	<dependency>
    <groupId>xmlunit</groupId>
    <artifactId>xmlunit</artifactId>
    <version>1.6</version>
    <scope>test</scope>
</dependency>


	<!-- https://mvnrepository.com/artifact/com.github.stefanbirkner/system-rules -->
<dependency>
    <groupId>com.github.stefanbirkner</groupId>
    <artifactId>system-rules</artifactId>
    <version>1.16.0</version>
    <scope>test</scope>
</dependency>

<dependency>
	<groupId>com.sun.xml.bind</groupId>
	<artifactId>jaxb-impl</artifactId>
	<version>2.1.13</version>
</dependency>
<!-- Thanks for using https://jar-download.com -->

<!-- https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api -->
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
    <version>2.1</version>
</dependency>

	</dependencies>

	 <build>
         <plugins>
     <plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.0.0-M1</version>
    <configuration>
        <testFailureIgnore>true</testFailureIgnore>
    </configuration>

   </plugin>

</plugins>
</build>

   <properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
</properties>
</project>
 29  
SpringCoreHandsOns snd CC/EasyRecharge/src/main/java/com/spring/bo/RechargeBO.java
@@ -0,0 +1,29 @@
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
 8  
... snd CC/EasyRecharge/src/main/java/com/spring/exception/InvalidRechargePackException.java
@@ -0,0 +1,8 @@
package com.spring.exception;

public class InvalidRechargePackException extends Exception {
	public InvalidRechargePackException(String msg) {
	//fill the code
	super(msg);
	}
}
 36  
SpringCoreHandsOns snd CC/EasyRecharge/src/main/java/com/spring/main/Driver.java
@@ -0,0 +1,36 @@
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
 54  
SpringCoreHandsOns snd CC/EasyRecharge/src/main/java/com/spring/model/Recharge.java
@@ -0,0 +1,54 @@
package com.spring.model;

//pojo class with required attributes,getters and setters 
public class Recharge {

	private String rechargeId;	
	private long phoneNumber;
	private double rechargeAmount;
	private RechargePlan rechargePlan;
    private int cashBackPercent;
	public int getCashBackPercent() {
		return cashBackPercent;
	}

	public void setCashBackPercent(int cashBackPercent) {

		this.cashBackPercent = cashBackPercent;
	}

	public String getRechargeId() {
		return rechargeId;
	}

	public void setRechargeId(String rechargeId) {
		this.rechargeId = rechargeId;
	}

	public RechargePlan getRechargePlan() {
		return rechargePlan;
	}

	public void setRechargePlan(RechargePlan rechargePlan) {
		this.rechargePlan = rechargePlan;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public double getRechargeAmount() {
		return rechargeAmount;
	}

	public void setRechargeAmount(double rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}


}
 28  
SpringCoreHandsOns snd CC/EasyRecharge/src/main/java/com/spring/model/RechargePlan.java
@@ -0,0 +1,28 @@
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
 36  
SpringCoreHandsOns snd CC/EasyRecharge/src/main/java/com/spring/service/RechargeService.java
@@ -0,0 +1,36 @@
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

 33  
SpringCoreHandsOns snd CC/EasyRecharge/src/main/resources/beans.xml
@@ -0,0 +1,33 @@
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:p="http://www.springframework.org/schema/p"
	xmlns:aop="http://www.springframework.org/schema/aop" xmlns:context="http://www.springframework.org/schema/context"
	xmlns:jee="http://www.springframework.org/schema/jee" xmlns:tx="http://www.springframework.org/schema/tx"
	xmlns:task="http://www.springframework.org/schema/task"
	xsi:schemaLocation="http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop-3.2.xsd http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.2.xsd http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-3.2.xsd http://www.springframework.org/schema/jee http://www.springframework.org/schema/jee/spring-jee-3.2.xsd http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx-3.2.xsd http://www.springframework.org/schema/task http://www.springframework.org/schema/task/spring-task-3.2.xsd">

		<context:property-placeholder location="classpath:cashBack.properties" />
		<!-- fill the code -->

		<bean id="recharge" class="com.spring.model.Recharge">
		    <property name="rechargePlan">
		        <bean id="rechargeplanobj" class="com.spring.model.RechargePlan">
		        <property name="rechargePlans">
		        <map>
		        <entry key="199" value="1.5GB data,28 days validity"/>
		        <entry key="399" value="2GB data,58 days validity"/>
		        <entry key="550" value="2.5GB data,85 days validity"/>
		        <entry key="51" value="6GB data,6 days validity"/>
		        <entry key="750" value="4GB data,90 days validity"/>
		        </map>
		    </property>
		</bean>
		    </property>
		    <property name="cashBackPercent" value="${cashBackPercent}" />
		</bean>
		<bean id="rechargeBoObj" class="com.spring.bo.RechargeBO"/>

		<bean id="rechargeservice" class="com.spring.service.RechargeService">
		    <property name="rechargeBO" ref="rechargeBoObj"/>
		</bean>

</beans>	 
 1  
SpringCoreHandsOns snd CC/EasyRecharge/src/main/resources/cashBack.properties
@@ -0,0 +1 @@
cashBackPercent=5
