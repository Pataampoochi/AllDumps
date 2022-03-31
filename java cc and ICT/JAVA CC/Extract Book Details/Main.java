import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//fill the code
		String string = sc.nextLine();
		if(string.length()==18)
		{
		    String substr1 = string.substring(0,3);
		    int i1 = Integer.parseInt(substr1);
		    if(i1>100 && i1<104)
		    {
		        String substr2 = string.substring(3,7);
		        int i2 = Integer.parseInt(substr2);
		        if(i2>=1900 && i2<=2020)
		        {
		            String substr3 = string.substring(7,12);
		            //System.out.println(substr3);
		            int i3 = Integer.parseInt(substr3);
		            if(i3>=10)
		            {
		                String substr4 = string.substring(12,13);
		                String substr5 = string.substring(13,18);
		                if((substr4.charAt(0)>='A'&&substr4.charAt(0)<='Z')||(substr4.charAt(0)>='a'&&substr4.charAt(0)<='z'))
		                {
		                    if((substr5.charAt(0)>='0'&&substr5.charAt(0)<='9')&&(substr5.charAt(1)>='0'&&substr5.charAt(1)<='9')&&
		                    (substr5.charAt(2)>='0'&&substr5.charAt(2)<='9')&&(substr5.charAt(3)>='0'&&substr5.charAt(3)<='9')&&
		                    (substr5.charAt(4)>='0'&&substr5.charAt(4)<='9'))
		                    {
		                        String substr6 = string.substring(12,18);
		                        System.out.println("Department Code: "+substr1);
		                        if(i1==101)
		                        System.out.println("Department Name: "+"Accounting");
		                        else if(i1==102)
		                        System.out.println("Department Name: "+"Economics");
		                        else if(i1==103)
		                        System.out.println("Department Name: "+"Engineering");
		                         System.out.println("Year of Publication: "+substr2);
		                         System.out.println("Number of Pages: "+substr3);
		                         System.out.println("Book Id: "+substr6);



		                    }
		                    else
		                    {
		                    	String substr6 = string.substring(12,18);
    		                    System.out.printf("%s  is invalid book id",substr6);
    		                    System.out.printf("\n");
		                    }
		                }
		                else 
		                {
		                	String substr6 = string.substring(12,18);
		                    System.out.printf("%s  is invalid book id",substr6);
		                    System.out.printf("\n");
		                }
		            }
		            else
		            {
		                System.out.printf("%s are invalid pages",substr3);
		                System.out.printf("\n");
		            }
		        }
		        else
		        {
		            System.out.printf("%d is invalid year",i2);
		            System.out.printf("\n");
		        }
		    }
		    else
		    {
		        System.out.printf("%d is invalid department code",i1);
		        System.out.printf("\n");
		    }
		}
		else
		{
		    System.out.printf("%s is invalid input",string);
		    System.out.printf("\n");
		}
	}
}
