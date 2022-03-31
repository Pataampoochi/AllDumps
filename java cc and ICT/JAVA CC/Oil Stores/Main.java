import java.util.Scanner;

public class Main{
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //Fill the code
        System.out.println("Enter oil name");
        String n=sc.next();
        System.out.println("Enter pack capacity");
        int pc=sc.nextInt();
        System.out.println("Enter category");
        char cat=sc.next().charAt(0);
        System.out.println("Enter cost");
        float c=sc.nextFloat();
        Oil obj=new Oil(n,pc,cat,c);
        obj.setName(n);
        obj.setPack(pc);
        obj.setCategory(cat);
        obj.setCost(c);
        System.out.println("Enter Quantity to purchase");
        float qty=sc.nextFloat();
        System.out.println("Oil cost rs."+obj.calculateTotalCost(qty));
    }    
}