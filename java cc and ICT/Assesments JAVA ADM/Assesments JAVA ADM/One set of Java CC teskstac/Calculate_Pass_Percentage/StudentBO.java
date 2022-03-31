package java_lc_cc.Calculate_Pass_Percentage;
//package com.utility;

//import com.ui.*;
import java.util.*;
import java.util.Map.Entry;

public class StudentBO {

	private List<Integer> studentList = new ArrayList<>();


	public List<Integer> getStudentList() {
		return studentList;
	}


	public void setStudentList(List<Integer> studentList) {
		this.studentList = studentList;
	}


	//This method should add the marks secured by the students which passed as the argument in to the List
	public void addStudentDetails(int securedMarks)
	{
		//Type your logic here
		studentList.add(securedMarks);
	}


	/* This method should return the pass percentage of the subject 
	passPercentage  can be calculated based on the following formula
	passPercentage= ((Total number of marks greater than 49) * 100) / (Total number of marks in the List) 

	For Example:
	 if the list contains the following marks [50,48,75,81,42,95,62]
	 passPercentage= (5*100) * 7  = 71

	 */
	public int findPassPercentage()
	{
		if (studentList.size() == 0)
			return -1;
		else {
			int count = 0;
			for (int marks : studentList) {
				if (marks > 49)
					count++;
			}
			return (count * 100) / studentList.size();
		}

	}
}
