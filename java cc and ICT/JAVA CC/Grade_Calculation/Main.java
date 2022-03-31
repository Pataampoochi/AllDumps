package java_lc_cc.Grade_Calculation;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of Threads:");
		int th =Integer.parseInt(br.readLine());
		GradeCalculator obj=null;
		String str="";
		String details[]=new String[th];
		for(int i=0;i<th;i++)
		{
			System.out.println("Enter the String:");
			str = br.readLine();
			details[i]=str;
		}

		for(int i=0;i<th;i++)
		{
			String sp[] = details[i].split(":");
			int k=0;
			int arr[]=new int[sp.length];
			for(int j=1;j<sp.length;j++)
				arr[k++]=Integer.parseInt(sp[j]);
			obj = new GradeCalculator(sp[0],arr);
			obj.start();
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

