package java_lc_cc.Student_Grade_Count;
//package com.ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class StudentBO {
	private Map<String, Character> studentMap = new HashMap<>();

	public Map<String, Character> getStudentMap() {
		return studentMap;
	}

	public void setStudentMap(Map<String, Character> studentMap) {
		this.studentMap = studentMap;
	}

	public void addStudentDetails(String rollNumber, char securedGrade) {
		studentMap.put(rollNumber, securedGrade);
	}

	public int findCountofStudents(char grade) {
		int count = 0;
		Set<Map.Entry<String, Character>> values = studentMap.entrySet();
		for (Map.Entry<String, Character> value : values) {
			if (value.getValue() == grade)
				count++;
		}
		return count;
	}
}
