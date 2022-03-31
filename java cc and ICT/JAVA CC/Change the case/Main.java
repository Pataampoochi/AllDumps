import java.util.*;

public class Main{

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String a = sc.next();
  if(a.length() < 3) {
    System.out.println("String length of " + a + " is too short");
    return;
  }
  else if(a.length() > 10) {
   System.out.println("String length of " + a + " is too long");
   return;
  }
  
  char[] arr = a.toCharArray();
  char[] arr1 = new char[arr.length];
  int j = 0;
  for(int i = 0; i < a.length(); i++) {
   if((arr[i]<65 || ((arr[i]>90) && (arr[i]<97)) || arr[i]>122)) {
    arr1[j++] = arr[i];
   }
  }
  if(j!=0) {
   System.out.print("String should not contain ");
   for(int i = 0; i<=j; i++) {
    System.out.print(arr1[i]);
   }
   return;
  }
  char b = sc.next().charAt(0);
  int present = 0;
  for(int i = 0; i<a.length(); i++) {
   if(arr[i] == Character.toUpperCase(b)) {
    arr[i] = Character.toLowerCase(b);
    present = 1;
   }
   else if(arr[i] == Character.toLowerCase(b)) {
    arr[i] = Character.toUpperCase(b);
    present = 1;
   }
  }
  if(present == 0) {
   System.out.println("Character " + b + " is not found");
  }
  else {
   for(int i = 0; i <a.length(); i++) {
    System.out.print(arr[i]);
   }
  }
 }

}