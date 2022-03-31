package com.utility;

import java.util.*;

public class GPACalculator {
	
    private List<Integer> gradePointList;
	
	
	public List<Integer> getGradePointList() {
		return gradePointList;
	}


	public void setGradePointList(List<Integer> gradePointList) {
		this.gradePointList = gradePointList;
	}


    /*This method should add equivalent grade points based on the grade obtained by the student passed as argument into gradePointList
	  Grade	        S	A	B	C	D	E
	  Grade Point	10	9	8	7	6	5
	  For example if the gradeobtained is A, its equivalent grade points is 9 has to added into the gradePointList*/
	public void addGradePoint(char gradeObtained) {
		
		if(gradeObtained == 'S')
		{
			gradePointList.add(10);
		}
		else if(gradeObtained == 'A')
		{
			gradePointList.add(9);
		}
		else if(gradeObtained == 'B')
		{
			gradePointList.add(8);
		}
		else if(gradeObtained == 'C')
		{
			gradePointList.add(7);
		}
		else if(gradeObtained == 'D')
		{
			gradePointList.add(6);
		}
		else
		{
			gradePointList.add(5);
		}
	}
	
	
	/* This method should return the GPA of all grades scored in the semester 
	 GPA  can be calculated based on the following formula
	 GPA= (gradePoint1 + gradePoint2 + ... + gradePointN) / (size of List)
	
	For Example:
	 if the list contains the following marks [9,10,8,5]
	 GPA = (9 + 10 + 8 + 5) / (4)= 8.0

	 */
	public double calculateGPAScored() {
	    
			double gpa=-1;
			double total=0,value=0,size=0;
			
			size = gradePointList.size();
			if(size < 1)
			{
				return 0;
			}
			// fill the code
			Iterator i = gradePointList.iterator();
			while(i.hasNext())
			{
				value = (Integer)i.next();
				total += value;
			}
			gpa = total/size;
			
			return gpa;
	}
}
