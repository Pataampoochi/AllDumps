package com.cts.unoadm.util;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cts.unoadm.exception.StudentAdmissionException;

public class ApplicationUtil {

	/**
	 * @param fileName
	 * @return List<String>
	 * @throws StudentAdmissionException
	 */
	public static List<String> readFile(String fileName) throws StudentAdmissionException {
		List<String> studentAdmissionList = new ArrayList<String>();
		try {
			BufferedReader bufferedReader=new BufferedReader(new FileReader(fileName));
			String s;
			while ((s=bufferedReader.readLine())!=null){
				if(s.contains("Approved")) {
					String s1[]=s.split(",");
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

						Date d1=sdf.parse(s1[2]);
					    Date d2=sdf.parse(s1[4]);
					    long diffint=((d2.getTime()- d1.getTime())/(1000*60*60*24))%365;
					   if(diffint<=10){
						   studentAdmissionList.add(s);
					   }


				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//Code here..
		
		return studentAdmissionList;
	}


	public static java.sql.Date convertUtilToSqlDate(java.util.Date uDate) {
		
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		
		//Code here..
		
		return sDate;
	}

	/**
	 * @param inDate
	 * @return Date
	 */
	public static Date convertStringToDate(String inDate) throws ParseException {

		//Code here..

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			dateFormat.setLenient(false);
			try {
				return dateFormat.parse(inDate);
			} catch (ParseException pe) {
				return null;
			}


	}

	public static boolean checkIfValidAdmission(Date dtOfCounseling, Date dtOfAdmission, String manager) {
		boolean admissionValidity = false;
		
		//Code here..
		
		return admissionValidity;
	}
}
