package com.cts.paymentProcess.service;

import java.util.*;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import com.cts.paymentProcess.dao.PaymentDao;
import com.cts.paymentProcess.model.Payment;

public class PaymentService {
	
	private PaymentDao paymentDao=new PaymentDao();
	
	public List<Payment> findCustomerByNumber(int customerNumber){
		
		List<Payment> list=paymentDao.getAllRecord();
		
		List<Payment> list2 = new ArrayList<>();
		list2 = list.stream().filter(x->x.getCustomerNumber()==customerNumber).collect(Collectors.toList());
		    		
		return list2;
	}
	
	public List<Payment> findCustomerByYear(int year){
		
		List<Payment> list=paymentDao.getAllRecord();
		
		List<Payment> list2 = new ArrayList<>();
		list2 = list.stream().filter(x->x.getPaymentDate().getYear()==(year-1900)).sorted(Comparator.comparingInt(Payment::getAmount)).collect(Collectors.toList());
		
		
		return list2;
	}
	
	
	
		

}

