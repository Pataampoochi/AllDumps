import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Encrypted text: ");
       String code= sc.nextLine();
       int shift = 7;
       int f=0;
       
      String decryptMessage = " ";
      for(int i = 0; i < code.length(); i++){
          char alpha = code.charAt(i);
          if(alpha >='a' && alpha <= 'z'){
              f=1;
              alpha=(char)(alpha - shift);
              if(alpha < 'a'){
                  alpha = (char)(alpha - 'a'+'z'+1);
              }
              decryptMessage=decryptMessage+alpha;
          }
          else if (alpha >='A' && alpha <= 'Z'){
              f=1;
              alpha=(char)(alpha - shift);
              if(alpha < 'A'){
                  alpha = (char)(alpha - 'A'+'Z'+1);
              }
              decryptMessage=decryptMessage+alpha;
          }
          else if(alpha == ' '){
              decryptMessage=decryptMessage+alpha;
          }
      }
      if(decryptMessage.length() == 0 || f == 0){
          System.out.println("No hidden Message");
          System.exit(0);
      }
       System.out.println("Decrpted Text:\n"+decryptMessage);
    }
}