package java_lc_cc.Average_And_Grade_Calculation;

public class Student {
	
	private int id;
	private String name;
	private int[] marks;
	private float average;
	private char grade;
	
	public Student(int id, String name, int[] marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Student() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void calculateAvg() {
		
		float total = 0;
		for (int i = 0; i < marks.length; i++) {
			total = total + marks[i];
		}
		average = total / marks.length;
	}
	
	public void findGrade() {
		
		if (average >= 80 && average <= 100) {
			grade = 'O';
		} else {
			grade = 'A';
		}
		
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < 50) {
				grade = 'F';
			}
		}
	}
}
