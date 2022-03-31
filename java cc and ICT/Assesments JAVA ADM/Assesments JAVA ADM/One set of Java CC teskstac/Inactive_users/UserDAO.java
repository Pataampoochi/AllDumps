package java_lc_cc.Inactive_users;

import java.sql.*;
import java.util.*;

public class UserDAO 
{

	public List<User> getInActiveUsers() throws Exception
	{
		List<User> userList = new ArrayList<>();
		Connection c1 =DbConnection.getConnection();
		Statement st1 = c1.createStatement();
		String query1 = "select * from user where Deleted=1 order by Username";
		ResultSet rs = st1.executeQuery(query1);
		while(rs.next())
		{
			userList.add(new User(rs.getInt("Id"),rs.getString("Username"),"test",rs.getString("Address"),rs.getString("Mobilenumber"),rs.getInt("Deleted")));
		}

		return userList;
	}
	public void makeInActive(int failedAttempts) throws Exception
	{   

		Connection c =DbConnection.getConnection();
		Statement st = c.createStatement();
		String query = "update user set Deleted=1 where Failedattempts>"+failedAttempts;
		int count=st.executeUpdate(query);


	}
}
