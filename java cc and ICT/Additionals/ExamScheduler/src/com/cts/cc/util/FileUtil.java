package com.cts.cc.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;
import java.util.*;

import com.cts.cc.functions.GenerateAssessmentFunction;
import com.cts.cc.model.Assessment;

public class FileUtil {
	public static List<Assessment> loadData(String fileName) throws IOException {
		List<Assessment> list = null;
		Function<String, Assessment> function = new GenerateAssessmentFunction(); 
		BufferedReader br=new BufferedReader(new FileReader(fileName));
		String line="";
		list=new ArrayList<Assessment>();
		while((line=br.readLine())!=null)
		{
		    list.add(function.apply(line));
		}
		//Write your code here...
		
		return list;
	}
}
