package java_lc_cc.Average_Rainfall_calculator;
//package com.utility;

//import com.ui.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class RMCBO {
	private List<Integer> rainfallList = new ArrayList<>();

	public List<Integer> getRainfallList() {
		return rainfallList;
	}

	public void setRainfallList(List<Integer> rainfallList) {
		this.rainfallList = rainfallList;
	}

	public void addRainfallDetails(int recordedRainfall) {
		rainfallList.add(recordedRainfall);
	}

	public double findAverageRainfallOccured() {
		double sum = 0;
		if(rainfallList.size()==0)
			return 0;
		else
		{
		for (int record : rainfallList)
			sum = sum + record;
		return (sum / rainfallList.size());
		}
	}
}

