package com.cts.paymentProcess;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.cts.paymentProcess.model.Payment;
import com.cts.paymentProcess.service.PaymentService;
import com.cts.paymentProcess.skeletonValidator.SkeletonValidator;

public class App {
	
public static void main(String[] args) throws ParseException {
		
		new SkeletonValidator();
		
		Payment payment=null;
		Scanner scanner=new Scanner(System.in);
		
		do{
			System.out.println("Select Option:");
			System.out.println("1.Customer list\n2.Yearly Customer List\n3.Exit");
			int choice=scanner.nextInt();
			switch(choice){
			
			case 1:System.out.println("Enter customer number");
	               int number=scanner.nextInt();
	               List<Payment> numberList=new PaymentService().findCustomerByNumber(number);
	               if(numberList.size()==0){
	            	   System.out.println("\nNo Records Found\n");
	               }else{
	            	   System.out.format("%15s%15s%15s%15s\n","Customer Number","Cheque Number","Payment Date","Amount");
	               numberList.stream()
	               .forEach(System.out::println);
	               }
				   break;
			case 2:System.out.println("Enter year");
                   int year=scanner.nextInt();
                   List<Payment> yearList=new PaymentService().findCustomerByYear(year);
                   if(yearList.size()==0){
                	   System.out.println("\nNo Records Found\n");
                   }else{
            	   System.out.format("%15s%15s%15s%15s\n","Customer Number","Cheque Number","Payment Date","Amount");
                   yearList.stream()
                   .forEach(System.out::println);
                   }
				   break;
			case 3:System.exit(0);
			default:System.out.println("\nWrong Choice\n");
			}
			
		}while(true);

	}

}
