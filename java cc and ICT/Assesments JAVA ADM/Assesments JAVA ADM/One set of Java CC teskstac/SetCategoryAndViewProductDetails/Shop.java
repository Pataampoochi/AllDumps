package java_lc_cc.SetCategoryAndViewProductDetails;

import java.sql.*;
public class Shop {

	public Product viewProduct(int pid) 
	{
		Product obj=null;
		try{
			Connection c = DB.getConnection();
			obj = new Product();
			String query = "select * from product where prodId="+pid;
			Statement st =  c.createStatement();
			ResultSet rs =  st.executeQuery(query);
			rs.next();
			obj.setProdId(rs.getInt("prodId"));
			obj.setProdName(rs.getString("prodName"));
			obj.setUnitPrice(Double.parseDouble(rs.getString("prodPrice")));
			st.close();
			c.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return obj;
	}
}
