import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    int num,n,i,count1=0,count2=0,y;
	    char alpha,ch;
	    String n1,n2;
		Scanner sc = new Scanner(System.in);
		//fill the code
		System.out.println("Enter the number of passengers");
		n=sc.nextInt();
		if(n<=0){
		    System.out.println(n+" is invalid input");
		    System.exit(0);
		}
		String[] arr1=new String[n];
		String[] arr2=new String[n];
		for(i=0;i<n;i++,count1=0,count2=0){
		    System.out.println("Enter the name of the passenger "+(i+1));
		    arr1[i] =sc.next();
		    System.out.println("Enter the seat details of the passenger "+(i+1));
		    arr2[i]= sc.next();
		    num =Integer.parseInt(arr2[i].substring(1,(arr2[i].length())));
		    alpha= arr2[i].charAt(0);
		    if(num>=10 && num<=99){
		        count2++;
		    }
		    for(ch=65;ch<84;ch++){
		        if(ch==alpha){
		            count1++;
		        }
		    }
		    if(count1==0){
		        System.out.println(""+alpha+" is invalid coach");
		        System.exit(0);
		    }
		    if(count2==0){
		        System.out.println(num+" is invalid seat number");
		        System.exit(0);
		    }
		    
		}
		for(i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        if(arr2[i].charAt(0)==arr2[j].charAt(0)){
		            if((Integer.parseInt(arr2[i].substring(1,(arr2[i].length()))))<(Integer.parseInt(arr2[j].substring(1,arr2[j].length())))){
		                n1=arr1[i];
		                n2=arr2[i];
		                arr1[i]=arr1[j];
		                arr2[i]=arr2[j];
		                arr1[j]=n1;
		                arr2[j]=n2;
		            }
		        }
		        else
		            if(arr2[i].charAt(0)<arr2[j].charAt(0))
		            {
		                n1=arr1[i];
		                n2=arr2[i];
		                arr1[i]=arr1[j];
		                arr2[i]=arr2[j];
		                arr1[j]=n1;
		                arr2[j]=n2;
		            }
		        }
		    }
		    for(i=0;i<n;i++){
		        String a=arr1[i].toUpperCase();
		        String b=arr2[i];
		        System.out.print(a+" "+b);
		        System.out.println("");
		    }
		}
	}
