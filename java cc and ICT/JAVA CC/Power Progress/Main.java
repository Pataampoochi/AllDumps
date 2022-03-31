import java.util.*;
public class Main 
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            //Fill the code 
            int m=sc.nextInt();
            if(m<=0){
                System.out.println(""+m+" is an invalid");
                return;
            }
            int n=sc.nextInt();
            if(n<=0){
                System.out.println(""+n+" is an invalid");
                return;
            }
            if(m>=n){
                System.out.println(""+m+" is not less than "+n);
                return; 
            }
            
            for(int i=1;i<=n;i++){
                System.out.print((int)Math.pow(m,i)+" ");
            }
            
        }
}