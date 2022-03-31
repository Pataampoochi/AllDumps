package java_lc_cc.SetDesignationAndViewEmployeeInfo;

public class TestMain {

	public static void main(String[] args){
		
		Employee e=new Employee();
		e.setEmpId(100);
		e.setEmpName("Tom");
		e.setExperience(9);
		e.setDesignation();
		System.out.println(e.getDesignation());
		Company c=new Company();
		Employee e1=c.viewEmployee(2);
		System.out.println(e1.getEmpId());	
		System.out.println(e1.getEmpName());	
		System.out.println(e1.getExperience());
		
		
	}
}
