import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       Customer c=new Customer();
       System.out.println("Enter the Name:");
       String name=(sc.nextLine());
       System.out.println("Enter the ContactNumber:");
       long no=sc.nextLong();
       sc.nextLine();
       System.out.println("Enter the EmailId:");
       String mail=sc.nextLine();
      
       System.out.println("Enter the Age:");
       int age=sc.nextInt();
       c.setCustomerName(name);
       c.setContactNumber(no);
       c.setEmailId(mail);
       c.setAge(age);
       System.out.println("Name:"+c.getCustomerName());
       System.out.println("ContactNumber:"+c.getContactNumber());
       System.out.println("EmailId:"+c.getEmailId());
       System.out.println("Age:"+c.getAge());
    		  
       
       
	}

}
