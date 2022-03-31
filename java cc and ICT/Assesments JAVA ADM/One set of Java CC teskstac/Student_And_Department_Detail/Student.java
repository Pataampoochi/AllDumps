package java_lc_cc.Student_And_Department_Detail;

public class Student {
	
	private int sid;
	private String sname;
	private Department department;
	
	public Student() {
		
	}

	public Student(int sid, String sname, Department department) {
		this.sid = sid;
		this.sname = sname;
		this.department = department;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
