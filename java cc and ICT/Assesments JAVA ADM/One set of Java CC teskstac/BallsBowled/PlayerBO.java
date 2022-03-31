package java_lc_cc.BallsBowled;
//package com.utility;

//import com.ui.*;
import java.util.*;

public class PlayerBO {

	private List<Integer> playerList=new ArrayList<>();


	public List<Integer> getPlayerList() {
		return playerList;
	}


	public void setPlayerList(List<Integer> playerList) {
		this.playerList = playerList;
	}


	//This method should add the oversBowled passed as the argument in to the List
	public void addOversDetails(int oversBowled)
	{playerList.add(oversBowled);

	}


	/* This method should return the number of balls bowled by the player 
	 Number of balls bowled can be calculated based on the sum of (oversBowled *6) available in the playerList.
	 For Example:
	 List contains[5,10,5]
	 NoOfBallsBowled=(5+10+5)*6=120
	 so this method should return 120
	 If list is empty return 0
	 */
	public int getNoOfBallsBowled()
	{	
		int sum = 0;
		for (int j : playerList)
			sum += (j * 6);
		return sum;

	}


}
