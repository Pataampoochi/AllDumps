package java_lc_cc.SetDesignationAndViewEmployeeInfo;


public class Employee {

	private int empId;
	private String empName;
	private int experience;
	private String designation;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation() {
		if((getExperience()>=5)&&(getExperience()<=7))
		designation="Team Member";
		if((getExperience()>=8)&&(getExperience()<=10))
		designation="Team Lead";
		if((getExperience()>=11)&&(getExperience()<=13))
		designation="Project Manager";
	}
}

