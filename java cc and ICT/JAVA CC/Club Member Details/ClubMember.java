
public class ClubMember{
    private int memberId;
    private String memberName;
    private String memberType;
    private double membershipFees;
    
    public void setMemberId(int memberId){
        this.memberId = memberId;
    }
    
    public int getMemberId(){
        return memberId;
    }
    
    public void setMemberName(String memberName){
        this.memberName = memberName;
    }
    
    public String getMemberName(){
        return memberName;
    }
    
    public void setMemberType(String memberType){
        this.memberType = memberType;
    }
    
    public String getMemberType(){
        return memberType;
    }
    
    public void setMembershipFees(double membershipFees){
        this.membershipFees = membershipFees;
    }
    
    public double getMembershipFees(){
        return membershipFees;
    }
    
    public ClubMember(int memberId, String memberName, String memberType){
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberType = memberType;
    }
    
    public void calculateMembershipFees (){
        if (memberType.equals("Gold")) membershipFees = 50000.0;
        else if (memberType.equals("Premium")) membershipFees = 75000.0;
    }
    
    
    
}