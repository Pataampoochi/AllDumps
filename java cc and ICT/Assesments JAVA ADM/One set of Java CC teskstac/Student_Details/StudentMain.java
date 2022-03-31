package java_lc_cc.Student_Details;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StudentMain
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		
        Student s = createStudent();
		System.out.println("Student id:"+s.getStudentId());
		System.out.println("Student name:"+s.getStudentName());
		System.out.println("Address:"+s.getStudentAddress());
		System.out.println("College name:"+s.getCollegeName());


	}
	
	public static Student createStudent()  throws NumberFormatException, IOException {
	    Student s = null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Student's Id:");
		int id=Integer.parseInt(br.readLine());

		System.out.println("Enter Student's Name:");
		String name=br.readLine();

		System.out.println("Enter Student's address:");
		String address=br.readLine();
		String status=null;
		int flag =0;
		do
		{
			System.out.println("Whether the student is from NIT(Yes/No):");
			status =br.readLine();
			flag =0;
			if(!(status.equalsIgnoreCase("yes")||status.equalsIgnoreCase("no")))
			{
				System.out.println("Wrong Input");
				flag =1;
			}
		}while(flag==1);
		if(status.equalsIgnoreCase("no"))
		{
			System.out.println("Enter the college name:");
			String college=br.readLine();
			s=new Student(id, name, address, college);
		}
		else if(status.equalsIgnoreCase("yes"))
		{
			s=new Student(id,name,address);
		}
		return s;
	    
	}
	
	public static Student getStudentDetails() throws NumberFormatException, IOException {
	    return createStudent();
	}
}


