package java_lc_cc.Filter_from_table_using_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DbConnection {

	public static Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		Connection con = null;
		try {	
			ResourceBundle rb = ResourceBundle.getBundle("mysql");
			String url = rb.getString("DB_URL");
			String username = rb.getString("DB_USERNAME");
			String password = rb.getString("DB_PASSWORD");
			con = DriverManager.getConnection(url,username,password);
		}
		catch(Exception e) {
			System.out.println(e);
		}

		return con;
	}
}