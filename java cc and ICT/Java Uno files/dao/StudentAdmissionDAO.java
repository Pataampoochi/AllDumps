package com.cts.unoadm.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cts.unoadm.exception.StudentAdmissionException;
import com.cts.unoadm.util.ApplicationUtil;
import com.cts.unoadm.util.DBConnectionManager;
import com.cts.unoadm.vo.StudentAdmission;

public class StudentAdmissionDAO {
	
	public boolean addStudentAdmissionDetails(List<StudentAdmission> stdAdmissions) throws StudentAdmissionException{
		boolean recordsAdded = false;
		
		//code here
		DBConnectionManager dbConnectionManager=DBConnectionManager.getInstance();
		Connection con=dbConnectionManager.getConnection();
		Statement ss= null;
		try {
			ss = con.createStatement();
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		String s1="insert into uno_admission values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		for(StudentAdmission s:stdAdmissions){
			try {
				PreparedStatement preparedStatement= con.prepareStatement(s1);
				preparedStatement.setString(1,s.getAdmissionId());
				preparedStatement.setString(2,s.getStudentCode());
				preparedStatement.setDate(3, ApplicationUtil.convertUtilToSqlDate(s.getDateOfCounseling()));
				preparedStatement.setString(4, s.getDepartmentName());
				preparedStatement.setDate(5,ApplicationUtil.convertUtilToSqlDate(s.getDateOfAdmission()));
				preparedStatement.setString(6, s.getPreferCollegeHostel());
				preparedStatement.setString(7, s.getFirstGraduate());
				preparedStatement.setString(8, s.getManagerApproval());
				preparedStatement.setDouble(9,s.getAdmissionFee());
				preparedStatement.setDouble(10,s.getTuitionFee());
				preparedStatement.setDouble(11,s.getHostelFee());
				preparedStatement.setDouble(12,s.getTotalCollegeFee());
				preparedStatement.setString(13,s.getFinalStatusOfAdmission());
				int i=preparedStatement.executeUpdate();
				if(i>0){
					recordsAdded=true;
				}
				System.out.println(i);

			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}


		}



		return recordsAdded; 
	}

	public List<StudentAdmission> getAllStudentAdmissionDetails() throws StudentAdmissionException {
		
		List<StudentAdmission> stdAdmissions = new ArrayList<StudentAdmission>();

		//code here
		DBConnectionManager dbConnectionManager=DBConnectionManager.getInstance();
		Connection con=dbConnectionManager.getConnection();
		Statement ss= null;
		try {
			ss = con.createStatement();
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		String s="select * from uno_admission.uno_admission";
		try {
			Statement statement= con.createStatement();
			ResultSet r=statement.executeQuery(s);
			while (r.next()){
				//resultSet.getString(1);

				stdAdmissions.add(new StudentAdmission(r.getString(1),r.getString(2),r.getDate(3),r.getString(4),
				r.getDate(5),r.getString(6),r.getString(7),r.getString(8),r.getDouble(9),
						r.getDouble(10),r.getDouble(11),r.getDouble(12),r.getString(13)
				));
			}
			for(StudentAdmission s11:stdAdmissions){
				System.out.println(s11);
			}

		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}

		return stdAdmissions;

	}
}