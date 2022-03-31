package java_lc_cc.GPA_Calculation;
//package com.utility;

//import com.ui.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class GradeBO {
	List<Integer> gradeList = new ArrayList<>();

	public List<Integer> getGradeList() {
		return gradeList;
	}

	public void setGradeList(List<Integer> gradeList) {
		this.gradeList = gradeList;
	}

	public void addGradeDetails(int gradePoint) {
		gradeList.add(gradePoint);
	}

	public double getGPAScored() {
		if (gradeList.size() == 0)
			return 0;
		else {
			int creditPoint = 3;double Gradetot=0;
			for (int i : gradeList) {
				Gradetot += i * creditPoint;
			}
			return (Gradetot / (gradeList.size()*3));
		}
	}
}