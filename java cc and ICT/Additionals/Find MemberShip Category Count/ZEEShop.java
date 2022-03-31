import java.util.List;


public class ZEEShop extends Thread 
{
	
	private String memberCategory;
	private int count;
	private List<Member> memberList;
	
	public ZEEShop(String memberCategory, List<Member> memberList) {
		super();
		this.memberCategory = memberCategory;
		this.memberList = memberList;
	}
	
	

	public String getMemberCategory() {
		return memberCategory;
	}



	public void setMemberCategory(String memberCategory) {
		this.memberCategory = memberCategory;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public List<Member> getMemberList() {
		return memberList;
	}



	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}



	public void run()
	{
		
		synchronized(this)
		{
			for(Member m:memberList)
			{
				if(m.getCategory().equals(memberCategory))
					count++;
			}
			
		}
		
	}
	

}
