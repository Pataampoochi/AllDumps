HOSTEL MANAGEMENT
feesDiscountDetails.properties
feesDiscount.map={'O':'50', 'D':'40', 'A':'30', 'B':'20'}
StudentBO.java
package com.spring.bo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.config.ApplicationConfig;
import com.spring.model.FeesDiscountDetails;
import com.spring.model.Student;

//use appropriate annotation to make this class as component class
@Component
public class StudentBO {

	public float calculateFee(Student obj) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		FeesDiscountDetails fd = context.getBean(FeesDiscountDetails.class);
		float fee = obj.getHostel().getRent();
		if (fd.getFeesDiscount().keySet().contains(Character.toString(obj.getGrade())))
			fee -= (fee * fd.getFeesDiscount().get(Character.toString(obj.getGrade())) / 100);
		return fee;
	}

}
ApplicationConfig.java
package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.bo.StudentBO;
import com.spring.model.FeesDiscountDetails;
import com.spring.model.Hostel;
import com.spring.model.Student;
import com.spring.service.StudentService;

@Configuration
@PropertySource("feesDiscountDetails.properties")
@ComponentScan
public class ApplicationConfig {
	@Bean
	public FeesDiscountDetails feesDiscountDetails() {
		FeesDiscountDetails feesDiscountDetails = new FeesDiscountDetails();
		return feesDiscountDetails;
	}

	@Bean
	public Hostel hostel() {
		Hostel hostel = new Hostel();
		return hostel;
	}

	@Bean
	public Student student() {
		Student student = new Student(hostel());
		return student;
	}

	@Bean
	public StudentBO studentBO() {
		StudentBO studentBO = new StudentBO();
		return studentBO;
	}

	@Bean
	public StudentService studentService() {
		StudentService studentService = new StudentService(studentBO());
		return studentService;
	}

}
InvalidGradeException.java
package com.spring.exception;

public class InvalidGradeException extends Exception {

	public InvalidGradeException(String msg) {
		super(msg);
	}

}
Driver.java
package com.spring.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.ApplicationConfig;
import com.spring.exception.InvalidGradeException;
import com.spring.service.StudentService;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		StudentService studentService = context.getBean(StudentService.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name:");
		String name = sc.nextLine();
		System.out.println("Enter the admission number:");
		String admissionNo = sc.nextLine();
		System.out.println("Enter the grade:");
		char grade = sc.nextLine().charAt(0);
		System.out.println("Enter the hostel details");
		System.out.println("Enter the hostel name:");
		String hostelName = sc.nextLine();
		System.out.println("Enter the room rent:");
		float rent = sc.nextFloat();
		try {
			System.out.println(
					"Hostel fee is Rs:" + studentService.calculateFee(name, admissionNo, grade, hostelName, rent));
		} catch (InvalidGradeException e) {
			System.out.println(e.getMessage());
		}
	}

}
FeesDiscountDetails.java
package com.spring.model;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//pojo class with required attributes,getters and setters 
//use appropriate annotation to make this class as component class
@Component
public class FeesDiscountDetails {

	@Value("#{${feesDiscount.map}}")
	private Map<String, Integer> feesDiscount;

	public Map<String, Integer> getFeesDiscount() {
		return feesDiscount;
	}

	public void setFeesDiscount(Map<String, Integer> feesDiscount) {
		this.feesDiscount = feesDiscount;
	}

	@Override
	public String toString() {
		return "FeesDiscountDetails [feesDiscount=" + feesDiscount + "]";
	}

}
Hostel.java
package com.spring.model;

import org.springframework.stereotype.Component;

//pojo class with required attributes,getters and setters 
//use appropriate annotation to make this class as component class
@Component
public class Hostel {

	private String hostelName;
	private float rent;	

	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public float getRent() {
		return rent;
	}
	public void setRent(float rent) {
		this.rent = rent;
	}
	@Override
	public String toString() {
		return "Hostel [hostelName=" + hostelName + ", rent=" + rent + "]";
	}
	
	
}
Student.java
package com.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//pojo class with required attributes,getters and setters 
//use appropriate annotation to make this class as component class
@Component
public class Student {

	private String name;
	private String admissionNo;
	private char grade;
	private Hostel hostel;

	@Autowired
	public Student(Hostel hostel) {
		super();
		this.hostel = hostel;
	}

	public Hostel getHostel() {
		return hostel;
	}

	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(String admissionNo) {
		this.admissionNo = admissionNo;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", admissionNo=" + admissionNo + ", grade=" + grade + ", hostel=" + hostel
				+ "]";
	}

}
StudentService.java
package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.bo.StudentBO;
import com.spring.config.ApplicationConfig;
import com.spring.exception.InvalidGradeException;
import com.spring.model.Student;

//use appropriate annotation to make this class as component class
@Component
public class StudentService {

	public StudentBO getStudentBOObj() {
		return studentBOObj;
	}

	public void setStudentBOObj(StudentBO studentBOObj) {
		this.studentBOObj = studentBOObj;
	}

	private StudentBO studentBOObj;

	// fill the code
	@Autowired
	public StudentService(StudentBO studentBOObj) {
		super();
		this.studentBOObj = studentBOObj;
	}

	public float calculateFee(String name, String admissionNo, char grade, String hostelName, float rent)
			throws InvalidGradeException {
		String validChars = "ODABCF";
		if (!validChars.contains(Character.toString(grade))) {
			throw new InvalidGradeException("Invalid Grade");
		}
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Student student = context.getBean(Student.class);
		student.setName(name);
		student.setAdmissionNo(admissionNo);
		student.setGrade(grade);
		student.getHostel().setHostelName(hostelName);
		student.getHostel().setRent(rent);
		return this.studentBOObj.calculateFee(student);
	}

}
POM.XML
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>HostelManagement</groupId>
  <artifactId>HostelManagement</artifactId>
  <version>0.0.1-SNAPSHOT</version>
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
