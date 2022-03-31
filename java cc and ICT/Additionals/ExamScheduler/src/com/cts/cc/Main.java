package com.cts.cc;

import java.util.List;

import com.cts.cc.dao.AssessmentDAO;
import com.cts.cc.model.Assessment;
import com.cts.cc.util.FileUtil;

public class Main {

	public static void main(String[] args) {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE
		new SkeletonValidator();
		// CODE SKELETON - VALIDATION ENDS
		
		try {
			List<Assessment> assessments = FileUtil.loadData("resource/data.txt");
			AssessmentDAO dao = new AssessmentDAO();
			dao.uploadAssessments(assessments);
			Assessment assessment = dao.findAssessment("ASEJE025");
			assessment.printDetails();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
