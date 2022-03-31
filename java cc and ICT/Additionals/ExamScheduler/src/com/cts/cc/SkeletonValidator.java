package com.cts.cc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.cts.cc.model.Assessment;

public class SkeletonValidator {
	private static final Logger LOG = Logger.getLogger("SkeletonValidator");

	public SkeletonValidator() {

		String assessmentClass = "com.cts.cc.model.Assessment";
		String assessmentDAOClass = "com.cts.cc.dao.AssessmentDAO";
		String funtionalClass = "com.cts.cc.functions.GenerateAssessmentFunction";
		String databaseUtilClass = "com.cts.cc.util.DatabaseUtil";
		String fileUtilClass = "com.cts.cc.util.FileUtil";

		Class[] assessmentParams = { String.class, String.class, LocalDate.class, LocalTime.class, Duration.class,
				Period.class };
		String[] assessmentFields = { "examCode", "examTitle", "examDate", "examTime", "examDuration", "evalDays" };

		testClass(assessmentClass, assessmentParams);
		testClass(assessmentDAOClass, null);
		testClass(funtionalClass, null);
		testClass(databaseUtilClass, null);
		testClass(fileUtilClass, null);

		testFields(assessmentClass, assessmentFields);
		testMethods(assessmentClass, "printDetails", null, null);
		testMethods(assessmentDAOClass, "uploadAssessments", new Class[] { List.class }, boolean.class);
		testMethods(assessmentDAOClass, "findAssessment", new Class[] { String.class }, Assessment.class);
		testMethods(funtionalClass, "apply", new Class[] { String.class }, Assessment.class);
		testMethods(databaseUtilClass, "getConnection", null, Connection.class);
		testMethods(fileUtilClass, "loadData", new Class[] { String.class }, List.class);
	}

	public void testClass(String className, Class[] paramTypes) {
		try {
			Class classUnderTest = Class.forName(className);
			LOG.info("Class Name " + className + " is correct");
			Constructor<?> constructor = classUnderTest.getConstructor(paramTypes);
			constructor.equals(constructor);
			LOG.info(className + " Constructor is valid");
		} catch (ClassNotFoundException e) {
			LOG.log(Level.SEVERE, "You have changed either the class name/package. "
					+ "Use the correct package and class name as provided in the skeleton");
		} catch (NoSuchMethodException e) {
			LOG.log(Level.SEVERE, " Unable to find the given constructor. "
					+ "Do not change the given public constructor. " + "Verify it with the skeleton");
		} catch (SecurityException e) {
			LOG.log(Level.SEVERE,
					"There is an error in validating the " + className + ". " + "Please verify the skeleton manually");
		}
	}

	public void testFields(String className, String[] fields) {
		try {
			Class classUnderTest = Class.forName(className);
			for (String field : fields) {
				classUnderTest.getDeclaredField(field);
			}
			LOG.info("Fields in " + className + " are correct");
		} catch (ClassNotFoundException e) {
			LOG.log(Level.SEVERE, "You have changed either the class name/package. "
					+ "Use the correct package and class name as provided in the skeleton");
		} catch (NoSuchFieldException e) {
			LOG.log(Level.SEVERE,
					"You have changed one/more field(s). " + "Use the field name(s) as provided in the skeleton");
		} catch (SecurityException e) {
			LOG.log(Level.SEVERE,
					"There is an error in validating the " + className + ". " + "Please verify the skeleton manually");
		}
	}

	public void testMethods(String className, String methodName, Class[] paramTypes, Class returnType) {
		try {
			Class classUnderTest = Class.forName(className);
			Method method = classUnderTest.getDeclaredMethod(methodName, paramTypes);
			Class retType = method.getReturnType();
			if (returnType != null && !retType.equals(returnType)) {
				LOG.log(Level.SEVERE, " You have changed the " + "return type in '" + methodName
						+ "' method. Please stick to the " + "skeleton provided");
				throw new NoSuchMethodException();
			}
			LOG.info(methodName + " signature is valid.");
		} catch (ClassNotFoundException e) {
			LOG.log(Level.SEVERE, "You have changed either the class name/package. "
					+ "Use the correct package and class name as provided in the skeleton");
		} catch (NoSuchMethodException e) {
			LOG.log(Level.SEVERE, "You have changed/removed method " + methodName + ". "
					+ "Use the method signature as provided in the skeleton");
		} catch (SecurityException e) {
			LOG.log(Level.SEVERE,
					"There is an error in validating the " + className + ". " + "Please verify the skeleton manually");
		}
	}
}
