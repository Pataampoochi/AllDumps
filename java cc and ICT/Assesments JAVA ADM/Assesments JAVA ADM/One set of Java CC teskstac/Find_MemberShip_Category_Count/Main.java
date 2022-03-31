package java_lc_cc.Find_MemberShip_Category_Count;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Member> any = new ArrayList<>() ;
		System.out.println("Enter the number of Members:");
		int memberCount = Integer.parseInt(br.readLine());
		for(int i=0;i<memberCount;i++)
		{
			System.out.println("Enter the Member Details:");
			String str = br.readLine();
			String details[]=str.split(":");
			Member obj = new Member(details[0],details[1],details[2]);
			any.add(obj);
		}
		
	   System.out.println("Enter the number of times Membership category needs to be searched:");
	   int categoryCount = Integer.parseInt(br.readLine());
	   String cat[]=new String[categoryCount];
		for(int i=0;i<categoryCount;i++)
		{
			System.out.println("Enter the Category");
			cat[i]=br.readLine();
		}	
		
		for(int i=0;i<categoryCount;i++)
		{
			ZEEShop ob = new ZEEShop(cat[i],any);
			ob.start();
			try{
			    Thread.sleep(1000);
			}
			catch(Exception e)
			{
			    System.out.println(e);
			}
		}
	}

}
