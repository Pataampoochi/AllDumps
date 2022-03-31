package java_lc_cc.Search_by_First_Name;

import java.util.*;
import java.sql.*;
public class UserDAO
{

	public void createUser(User user) throws Exception
	{
		Connection con = DbConnection.getConnection();
		Contact contact = user.getContact();
		String query1="insert into contact(mobilenumber,emailid) values(?,?)";
		PreparedStatement st1 =con.prepareStatement(query1);
		//st1.setInt(1,contact.getId());
		st1.setString(1,contact.getMobileNumber());
		st1.setString(2,contact.getEmailId());
		int count1=st1.executeUpdate();
		st1.close();

		String query = "insert into user(username,firstname,lastname,password,contact_id) values(?,?,?,?,?)";
		PreparedStatement st =con.prepareStatement(query);
		//st.setInt(1,user.getId());
		st.setString(1,user.getUserName());
		st.setString(2,user.getFirstName());
		st.setString(3,user.getLastName());
		st.setString(4,user.getPassword());
		st.setInt(5,contact.getId());
		int count=st.executeUpdate();
		st.close();
		con.close();

	}
	public List<User> findByFirstName(String firstName) throws Exception
	{
		//Fill code
		Connection con1 = DbConnection.getConnection();
		List<User> fname = new ArrayList<>();
		String query2 = "select * from user where firstname='"+firstName+"'";
		//where firstname='"+firstName+"'";
		Statement st2 = con1.createStatement();
		ResultSet rs = st2.executeQuery(query2);
		// 		rs.next();
		// 		rs.next();

		while(rs.next())
		{
			Statement st3 = con1.createStatement();
			ResultSet rs1 =st3.executeQuery("select * from contact where Id="+rs.getInt("contact_id"));
			Contact obj = null;
			rs1.next();
			obj = new Contact(rs1.getInt("Id"),rs1.getString("mobilenumber"),rs1.getString("emailid"));
			fname.add(new User(rs.getInt("Id"),rs.getString("username"),rs.getString("firstname"),rs.getString("lastname"),rs.getString("password"),obj));
		}

		con1.close();
		st2.close();

		return fname;

	}

}
