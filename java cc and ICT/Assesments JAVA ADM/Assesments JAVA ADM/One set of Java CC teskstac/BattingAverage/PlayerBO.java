package java_lc_cc.BattingAverage;

//package com.utility;

import java.util.*;

public class PlayerBO {

	private List<Integer> playerList = new ArrayList<Integer>();


	public List<Integer> getPlayerList() {
		return playerList;
	}


	public void setPlayerList(List<Integer> playerList) {
		this.playerList = playerList;
	}

	//This method should add the runScored passed as the argument into the playerList
	public void addScoreDetails(int runScored) {
		this.playerList.add(runScored);
	}


	/* This method should return the  average runs secured by the player 
	 Average runs can be calculated based on the sum of all runScored available in the playerList divided by the number of elements in the playerList.
     For Example:
	 List contains[150,50,50]
	 average runs secured=(150+50+50)/3=83.33333333333333
	 so this method should return 83.33333333333333
	 If list is empty return 0
	 */
	public double getAverageRunsSecured() {

		if (this.playerList.size() == 0 ) {
			return 0;
		} else {
			int sum = 0;
			for (Integer score : playerList) {
				sum = sum + score;
			}
			return (double) sum/(double) this.playerList.size();
		}
	}

}
