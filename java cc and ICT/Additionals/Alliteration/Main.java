import java.util.*;

public class Main {
    
     public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0; 
        System.out.println("Enter the letter");
        char aletter=sc.next().charAt(0); 
        char acon=Character.toLowerCase(aletter);
        sc.nextLine();
        String sentence_letter=sc.nextLine();
        String cons=sentence_letter.toLowerCase();
        char ch[]=new char[cons.length()];
        for(int i=0;i<cons.length();i++)
        {
         ch[i]=cons.charAt(i);
         if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ') && (ch[i]==acon)) || ((ch[0]!=' ')&&(i==0)) )
         {
          count++;  
         }
        }
        System.out.println(count);
        if(count>3)
        {
         System.out.println("Good,You get a score of "+(2+(count-3)*2));
        }
        else if(count == 3)
        {
         System.out.println("Good,You get a score of "+2);
        }
        else if(count < 3)
        {
         System.out.println("No score");
        }
        
        
    }
        
}