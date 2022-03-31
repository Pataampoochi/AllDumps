package com.cts.paymentProcess.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

public class DatabaseUtil {
	
	
	private DatabaseUtil() {
	}

	private static Connection con = null;
	private static Properties props = new Properties();
	

    //ENSURE YOU DON'T CHANGE THE BELOW CODE WHEN YOU SUBMIT
	public static Connection getConnection() {
	    try{
			
			FileInputStream fis = null;
			fis = new FileInputStream("resource/database.properties");
			props.load(fis);
			
			// load the Driver Class
			try {
				Class.forName(props.getProperty("DB_DRIVER_CLASS"));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// create the connection now
            try {
				con = DriverManager.getConnection(props.getProperty("DB_URL"),props.getProperty("DB_USERNAME"),props.getProperty("DB_PASSWORD"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    catch(IOException e){
	        e.printStackTrace();
	    }
		return con;	


}
}
