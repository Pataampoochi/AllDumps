import java.util.Scanner;

public class NumberTypeUtility 
{
    public static NumberType isOdd()
    {
        return n -> n%2 != 0;
    }
    public static void main (String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isOdd().checkNumberType(n))
        {
            System.out.println(n+" is odd");
        }
        else
        {
            System.out.println(n+" is not odd");
        }
    }
}