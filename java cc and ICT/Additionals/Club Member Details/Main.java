import java.util.Scanner;

public class Main{
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Member Id");
        int memberId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name");
        String memberName = sc.nextLine();
        System.out.println("Enter Member Type");
        String memberType = sc.next();
        
        ClubMember clubMemberObj = new ClubMember(memberId,memberName,memberType);
        clubMemberObj.calculateMembershipFees();
        
        System.out.println("Member Id is " + clubMemberObj.getMemberId());
        System.out.println("Member Name is " + clubMemberObj.getMemberName());
        System.out.println("Member Type is " + clubMemberObj.getMemberType());
        System.out.println("Membership Fees is " + clubMemberObj.getMembershipFees());
    }    
}