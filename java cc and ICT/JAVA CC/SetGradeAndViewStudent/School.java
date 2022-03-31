package java_lc_cc.SetGradeAndViewStudent;

import java.sql.*;
public class School {
	public Student viewStudent(int sid)
	{
	    Student obj=null;
	    try{
	        Connection c= DB.getConnection();
	        obj = new Student();
	        Statement st = c.createStatement();
	        ResultSet rs = st.executeQuery("select * from student where  studId="+sid);
	        rs.next();
	        obj.setStudId(rs.getInt("studId"));
	        obj.setStudName(rs.getString("studName"));
	        obj.setTotal(rs.getInt("total"));
	    }
	    catch(Exception e)
	    {
	        System.out.println(e);
	    }
	    return obj;
	
	}
}