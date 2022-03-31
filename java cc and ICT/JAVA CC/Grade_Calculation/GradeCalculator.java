package java_lc_cc.Grade_Calculation;

public class GradeCalculator extends Thread
{
    
     private String studName;
	 private char result;
	 private int[] marks;
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public char getResult() {
		return result;
	}
	public void setResult(char result) {
		this.result = result;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public GradeCalculator(String studName, int[] marks) {
		super();
		this.studName = studName;
		this.marks = marks;
	}
	
	public void run()
	{
		int sum=0;
		int[]score=getMarks();
		for(int i=0;i<score.length;i++)
			sum=sum+score[i];
		if((400<=sum)&&(sum<=500))
			System.out.println(getStudName()+":"+'A');
		if((300<=sum)&&(sum<=399))
			System.out.println(getStudName()+":"+'B');
		if((200<=sum)&&(sum<=299))
		System.out.println(getStudName()+":"+'C');
		if(sum<200)
			System.out.println(getStudName()+":"+'E');	
	}
		
}