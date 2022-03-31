package com.cts.paymentProcess.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.paymentProcess.model.Payment;
import com.cts.paymentProcess.util.DatabaseUtil;

public class PaymentDao {
	
private Connection connection;
	
	public List<Payment> getAllRecord(){
		
		connection=DatabaseUtil.getConnection();
		PreparedStatement statement=null;
		ResultSet resultSet=null;
		List<Payment> paymentList=new ArrayList<Payment>();
		try {
			statement=connection.prepareStatement("select * from cheque_payments");
			resultSet=statement.executeQuery();
			while(resultSet.next()){
				Payment payment =new Payment();
				payment.setCustomerNumber(resultSet.getInt("customerNumber"));
				payment.setChequeNumber(resultSet.getString("chequeNumber"));
				payment.setPaymentDate(resultSet.getDate("paymentDate"));
				payment.setAmount(resultSet.getInt("amount"));
				paymentList.add(payment);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			try{
			resultSet.close();
			statement.close();
			}catch(Exception e){
				e.printStackTrace();
			}		}
		
		
		return paymentList;
	}

	
	
	
    

}
