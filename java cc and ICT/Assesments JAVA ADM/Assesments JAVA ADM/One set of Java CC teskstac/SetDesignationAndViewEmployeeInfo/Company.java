package java_lc_cc.SetDesignationAndViewEmployeeInfo;

import java.sql.*;
public class Company {
	public Employee viewEmployee(int eid)
	{
	    Employee obj =null;
	    try
	    {
	        Connection c=DB.getConnection();
	        Statement st = c.createStatement();
	        obj= new Employee();
	        ResultSet rs = st.executeQuery("select * from Employee where empId="+eid);
	        rs.next();
	        obj.setEmpId(rs.getInt("empId"));
	        obj.setEmpName(rs.getString("empName"));
	        obj.setExperience(rs.getInt("experience"));
	    }
	    catch(Exception e)
	    {
	        System.out.println(e);
	    }
	    return obj;
	}
}

