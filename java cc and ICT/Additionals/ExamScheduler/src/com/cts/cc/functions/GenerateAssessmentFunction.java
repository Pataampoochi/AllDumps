package com.cts.cc.functions;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.function.Function;

import com.cts.cc.model.Assessment;

public class GenerateAssessmentFunction implements Function<String, Assessment>{

	@Override
	public Assessment apply(String t) {
		//Write your code here...
		String temp[]=t.split(",");
		    Assessment a = new Assessment(temp[0],temp[1],LocalDate.parse(temp[2]),LocalTime.parse(temp[3]),Duration.parse(temp[4]),Period.parse(temp[5]));
	return a;
	}

}
