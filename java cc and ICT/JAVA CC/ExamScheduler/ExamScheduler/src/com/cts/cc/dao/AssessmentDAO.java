package com.cts.cc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.List;
import java.sql.*;

import com.cts.cc.model.Assessment;
import com.cts.cc.util.DatabaseUtil;

public class AssessmentDAO {
	public int uploadAssessments(List<Assessment> assessments) throws Exception {
		if(assessments==null || assessments.isEmpty()) {
			throw new Exception("List is Empty");
		}
		int rowsCount = 0;
		
		//Write your logic here...
		try{
		    Connection con = DatabaseUtil.getConnection();
		    for(Assessment a:assessments)
		    {
		        PreparedStatement st = con.prepareStatement("insert into assessment values(?,?,?,?,?,?)");
		        st.setString(1,a.getExamCode());
		        st.setString(2,a.getExamTitle());
		        st.setString(3,a.getExamDate().toString());
		        st.setString(4,a.getExamTime().toString());
		        st.setString(5,a.getExamDuration().toString());
		        st.setString(6,a.getEvalDays().toString());
		        int rs=st.executeUpdate();
		        if(rs!=-1)
		        rowsCount=rowsCount+1;
		}
		} catch(SQLException e){
		}

		return rowsCount;
	}
	
	public Assessment findAssessment(String code) throws Exception {
		Assessment assessment = null;
		Connection conn = DatabaseUtil.getConnection();
		String sql = "SELECT * FROM assessment where code=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, code);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			assessment = new Assessment();
			assessment.setExamCode(rs.getString(1));
			assessment.setExamTitle(rs.getString(2));
			assessment.setExamDate(LocalDate.parse(rs.getString(3)));
			assessment.setExamTime(LocalTime.parse(rs.getString(4)));
			assessment.setExamDuration(Duration.parse(rs.getString(5)));
			assessment.setEvalDays(Period.parse(rs.getString(6)));
		}
	
		return assessment;
	}
}
