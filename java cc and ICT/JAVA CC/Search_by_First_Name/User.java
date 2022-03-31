package java_lc_cc.Search_by_First_Name;

public class User 
{
	private Integer id;
	private String userName;
	private String firstName;
	private String lastName;
	private String password;
	private Contact contact;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public User(Integer id,String userName,String firstName,String lastName,String password,Contact contact)
	{
		super();
		this.id=id;
		this.userName=userName;
		this.firstName=firstName;
		this.lastName=lastName;
		this.password=password;
		this.contact=contact;
	}
}
