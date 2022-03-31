package java_lc_cc.PF_and_Salary_Calculation;

public class PermanentEmployee extends Employee {
	private float pfpercentage;
	private float pfamount;
	
	

	public float getPfpercentage() {
		return pfpercentage;
	}

	public void setPfpercentage(float pfpercentage) {
		this.pfpercentage = pfpercentage;
	}

	public float getPfamount() {
		return pfamount;
	}

	public void setPfamount(float pfamount) {
		this.pfamount = pfamount;
	}

	public boolean validateInput(float salary, float pfpercentage) {
		if ((salary > 0) && (pfpercentage >= 0))
			return true;
		else
			return false;
	}


	public void findNetSalary() {
		pfamount = (pfpercentage * getSalary()) / 100;
		float netSal = getSalary() - pfamount;
		setNetsalary(netSal);
	}

}