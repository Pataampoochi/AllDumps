public class Member {
	
	private String memberId;
	private String memberName;
	private String category;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Member(String memberId, String memberName, String category) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.category = category;
	}
	

}