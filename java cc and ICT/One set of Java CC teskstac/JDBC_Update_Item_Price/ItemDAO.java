package java_lc_cc.JDBC_Update_Item_Price;

import java.util.*;
import java.sql.*;
public class ItemDAO
{
	public List<Item> getAllItems() throws Exception
	{
		Connection con = DbConnection.getConnection();
		List<Item> itemList = new ArrayList<>();
		Statement st = con.createStatement();
		String query = "select * from item";
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			itemList.add(new Item(rs.getString("Id"),rs.getString("name"),rs.getDouble("price")));
		}
		st.close();
		con.close();
		return itemList;
	}
	public void updateItemPrice(String item, Double price) throws Exception
	{
		String query1 = "update item set price="+price+" where Id='"+item+"'";
		//System.out.println("query1:"+query1);
		Connection con1 = DbConnection.getConnection();
		Statement st1 = con1.createStatement();
		int count = st1.executeUpdate(query1);
		con1.close();
		st1.close();

	}
}
