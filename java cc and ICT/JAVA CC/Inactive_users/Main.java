package java_lc_cc.Inactive_users;

import java.io.*;
import java.util.*;
import java.sql.*;
public class Main {

	public static void main (String[] args) throws Exception {
		/* code */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of login attempts");
		int att = Integer.parseInt(br.readLine());
		if(att<=0)
			System.out.println("Invalid number of login attempts");
		else{
			UserDAO obj = new UserDAO();
			obj.makeInActive(att);
			List<User> uList = obj.getInActiveUsers();
			System.out.println("Inactive user Details :");
			System.out.println("Name Address Mobile Number");
			for(User u:uList)
			{
				System.out.println(u.getUsername()+" "+u.getAddress()+" "+u.getMobileNumber());
			}


		}
	}


}

