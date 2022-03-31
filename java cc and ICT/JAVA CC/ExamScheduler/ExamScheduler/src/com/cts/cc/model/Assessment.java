package com.cts.cc.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Assessment {
	private String examCode;
	private String examTitle;
	private LocalDate examDate;
	private LocalTime examTime;
	private Duration examDuration;
	private Period evalDays;

	public Assessment(String examCode, String examTitle, LocalDate examDate, LocalTime examTime, Duration examDuration,
			Period evalDays) {
		super();
		this.examCode = examCode;
		this.examTitle = examTitle;
		this.examDate = examDate;
		this.examTime = examTime;
		this.examDuration = examDuration;
		this.evalDays = evalDays;
	}

	public Assessment() {
	}

	public String getExamCode() {
		return examCode;
	}

	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}

	public String getExamTitle() {
		return examTitle;
	}

	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}

	public LocalDate getExamDate() {
		return examDate;
	}

	public void setExamDate(LocalDate examDate) {
		this.examDate = examDate;
	}

	public LocalTime getExamTime() {
		return examTime;
	}

	public void setExamTime(LocalTime examTime) {
		this.examTime = examTime;
	}

	public Duration getExamDuration() {
		return examDuration;
	}

	public void setExamDuration(Duration examDuration) {
		this.examDuration = examDuration;
	}

	public Period getEvalDays() {
		return evalDays;
	}

	public void setEvalDays(Period evalDays) {
		this.evalDays = evalDays;
	}

	public void printDetails() {
	    DateTimeFormatter date1=DateTimeFormatter.ofPattern("dd-MMM-y");
	    DateTimeFormatter date2=DateTimeFormatter.ofPattern("HH:mm");
	    LocalTime t=examTime.plus(examDuration);
	    String d=DateTimeFormatter.ofPattern("HH:mm").format(t);
	    LocalDate t1=examDate.plus(evalDays);
	    String d1=DateTimeFormatter.ofPattern("dd-MMM-y").format(t1);
	    System.out.println("Assessment Code: "+examCode);
	    System.out.println("Title: "+examTitle);
	    System.out.println("Assessment Date: "+examDate.format(date1));
	    System.out.println("Start Time: "+examTime.format(date2));
	    System.out.println("End Time: "+d);
	    System.out.println("Result Date: "+d1);
		//Write your code here...
	}

}
