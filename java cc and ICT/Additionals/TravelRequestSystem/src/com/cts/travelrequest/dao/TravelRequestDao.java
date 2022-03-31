package com.cts.travelrequest.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;
import java.util.*;
//import java.util.Properties;


import com.cts.travelrequest.vo.TravelRequest;

 class DB{
	private static Connection con = null;
	private static Properties props = new Properties();
	
	
	//ENSURE YOU DON'T CHANGE THE BELOW CODE WHEN YOU SUBMIT
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
	    try{
			
			FileInputStream fis = null;
			fis = new FileInputStream("resource/database.properties");
			props.load(fis);
			
			// load the Driver Class
			Class.forName(props.getProperty("DB_DRIVER_CLASS"));

			// create the connection now
            con = DriverManager.getConnection(props.getProperty("DB_URL"),props.getProperty("DB_USERNAME"),props.getProperty("DB_PASSWORD"));
	    }
	    catch(IOException e){
	        e.printStackTrace();
	    }
		return con;	
	}
 }
	
	/**
	 * Method to get travel details based on source and destination city	 * 
	 * @return list
	 */
	 public class TravelRequestDao{
	    // public PreparedStatement prepareStatement(String query) throws SQLException{}
	public static List<TravelRequest> getTravelDetails(String sourceCity, String destinationCity) {
	    
	    List<TravelRequest> travel=new ArrayList<>();
	    try{
	        Connection con=DB.getConnection();
	        String query="Select * from t_travelrequest where sourceCity=? and destinationCity=?;";
	        PreparedStatement ps=con.prepareStatement(query);
	        ps.setString(1,sourceCity);
	        ps.setString(2,destinationCity);
	        ResultSet rs=ps.executeQuery();
	        while(rs.next()){
	            String tid=rs.getString("travelReqId");
	            java.sql.Date date=rs.getDate("travelDate");
	            String apstat=rs.getString("approvalStatus");
	            String sour=rs.getString("sourceCity");
	            String des=rs.getString("destinationCity");
	            double cost=rs.getDouble("travelCost");
	            TravelRequest tr=new TravelRequest(tid,date,apstat,sour,des,cost);
	            
	            travel.add(tr);
	        }
	    }
	    catch(ClassNotFoundException e){
	        e.printStackTrace();
	    }
	    catch(SQLException e ){
	        e.printStackTrace();
	    }
		
		return travel;  //TODO change this return value

	}

	/**
	 * Method to calculate total travel cost based approvalStatus 
	 * @return list
	 */
	public static double calculateTotalTravelCost(String approvalStatus) {
	    double amount=0;
	    try{
	        Connection con=DB.getConnection();
	        String query="select travelCost from t_travelrequest where approvalStatus=?;";
	        PreparedStatement ps1=con.prepareStatement(query);
	        ps1.setString(1,approvalStatus);
	        ResultSet rs1=ps1.executeQuery();
	        while(rs1.next()){
	            amount+=rs1.getDouble("travelCost");
	        }
	    }
	    catch(ClassNotFoundException e){
	        e.printStackTrace();
	    }
	    catch(SQLException e){
	        e.printStackTrace();
	    }
		
		return amount; //TODO change this return value
	}
}
