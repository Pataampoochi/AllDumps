package java_lc_cc.SetGradeAndViewStudent;

public class TestMain {

	public static void main(String[] args){
		
		Student s=new Student();
		s.setStudId(101);
		s.setStudName("john");
		s.setTotal(900);
		s.setGrade();
		System.out.println(s.getGrade());
		School scObj=new School();
		Student s1=scObj.viewStudent(2);
		System.out.println(s1.getStudId()+s1.getStudName()+s1.getTotal());
		
	}
}
