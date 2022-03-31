package java_lc_cc.Find_MemberShip_Category_Count;

import java.util.List;


public class ZEEShop extends Thread
{
	private String memberCategory;
	private int count;
	private List<Member>memberList;
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
	public ZEEShop(String memberCategory, List<Member> memberList) {
		super();
		this.memberCategory = memberCategory;
		this.memberList = memberList;
	}
	
	public void run()
	{  count=0;
		for(Member m:memberList)
		{
			if(m.getCategory().equals(memberCategory))
				count++;
		}
		System.out.println(memberCategory+":"+count);
	}
	
}

