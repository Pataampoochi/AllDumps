import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Member> mList=new ArrayList<Member>();
		System.out.println("Enter the number of Members:");
		Scanner sc=new Scanner(System.in);
		int tot=sc.nextInt();
		String[] str=new String[tot];
		for(int i=0;i<str.length;i++)
		{
			System.out.println("Enter the Member Details:");
			str[i]=sc.next();
		}
		
		Member m[]=new Member[tot];
		for(int i=0;i<m.length;i++)
		{
			String s[]=str[i].split(":");
			m[i]=new Member(s[0],s[1],s[2]);
			mList.add(m[i]);
			
		}
		
		System.out.println("Enter the number of times Membership category needs to be searched:");
		int tot1=sc.nextInt();
		ZEEShop t1[]=new ZEEShop[tot1];
		for(int i=0;i<tot1;i++)
		{
			System.out.println("Enter the Category");
			String s1=sc.next();
			t1[i]=new ZEEShop(s1,mList);
			t1[i].start();
			
			//System.out.println(s1+" "+t1.getCount());
		}
		
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(ZEEShop s:t1)
		{
			System.out.println(s.getMemberCategory()+":"+s.getCount());
		}
		
		
	}

}
