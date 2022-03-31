package com.utility;

import java.util.List;

public class Player {
		
	private List<Integer> scoreList;
	
	
	public List<Integer> getScoreList() {
		return scoreList;
	}


	public void setScoreList(List<Integer> scoreList) {
		this.scoreList = scoreList;
	}
	
	//This method should add the runScored passed as the argument into the scoreList
	public void addScoreDetails(int runScored) {
		
		// fill the code
		scoreList.add(runScored);
	}
	
	
	/* This method should return the  average runs scored by the player 
	 Average runs can be calculated based on the sum of all runScored available in the scoreList divided by the number of elements in the scoreList.
     For Example:
	 List contains[150,50,50]
	 average runs secured=(150+50+50)/3=83.33333333333333
	 so this method should return 83.33333333333333
	 If list is empty return 0
	 */
	public double getAverageRunScored() {
		
		// fill the code
		if(scoreList.isEmpty())
		{
		    return 0.0;
		}
		int size=scoreList.size();
		int totalScore=0;
		for(int runScored : scoreList)
		{
		    totalScore=totalScore+runScored;
		}

		return (double)totalScore / (double)size;
	}

}
