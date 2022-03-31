package java_lc_cc.SetGradeAndViewStudent;


public class Student {
	private int studId;
	private String studName;
	private int total;
	private char grade;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade() {
		if((getTotal()>=900)&&(getTotal()<=1000))
			grade='A';
		if((getTotal()>=800)&&(getTotal()<=899))
			grade='B';
		if((getTotal()>=700)&&(getTotal()<=799))
			grade='C';
	}

}

