package java_lc_cc.Search_by_First_Name;


public class Contact 
{
	private Integer id;
	private String mobileNumber;
	private String emailId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Contact(Integer id,String mobileNumber,String emailId)
	{
		super();
		this.id =id;
		this.mobileNumber=mobileNumber;
		this.emailId=emailId;
	}
}

