package java_lc_cc.Search_by_First_Name;

import java.util.*;
import java.io.*;
public class Main 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i=1;
		List<String> strList= new ArrayList<>();
		while(true)
		{
			System.out.println("Enter user "+i+" detail:");
			String str = br.readLine();
			strList.add(str);
			System.out.println("Do you want to create another user?(yes/no)");
			String create=br.readLine();
			if(create.equals("yes"))
				i++;
			else
				break;
		}
		UserDAO ob = new UserDAO();
		int j=1;
		for(String s:strList)
		{
			String sp[]=s.split(",");
			Contact cont = new Contact(j,sp[4],sp[5]);
			User user = new User(j,sp[0],sp[1],sp[2],sp[3],cont);
			ob.createUser(user);
			j++;
		}

		System.out.println("Enter the first name to search:");
		String firstName = br.readLine();
		List<User>fname = ob.findByFirstName(firstName);
		System.out.println("User details are");
		System.out.println("Id Firstname Lastname Mobilenumber Email ID");
		for(User u:fname)
		{
			Contact c = u.getContact();
			System.out.println(u.getId()+" "+u.getFirstName()+" "+u.getLastName()+" "+c.getMobileNumber()+" "+c.getEmailId());
		}


	}

}
