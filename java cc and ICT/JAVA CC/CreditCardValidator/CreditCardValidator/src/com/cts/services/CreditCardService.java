package com.cts.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cts.entity.CreditCard;

public class CreditCardService {
	//check whether the card is blocklisted and card contains only 16 digits
	public static String validate(CreditCard card,String fileName) throws IOException
	{
		String msg=null;
		if(validateAgainstBlocklist(card, fileName))
		{
			msg="Card is blocked";
		}
		else if(validateNumber(card.getNumber()))
		{
			msg="card is not having 16 digits";
		}
		else
		{
			msg="valid card";
		}
		return msg;
	}
	// Validate a credit card against a blocklist.
	public static boolean validateAgainstBlocklist(CreditCard card, String fileName) throws IOException {
		//write your code here
		BufferedReader br=new BufferedReader(new FileReader(fileName));
		String line=br.readLine();
		ArrayList<String> blocklist=new ArrayList<String>();
		boolean result=false;
		while(line!=null){
		    String cards[]=line.split(",");
		    for(int i=0;i<cards.length;i++){
		        blocklist.add(cards[i]);
		    }
		    line=br.readLine();
		}
		if(blocklist.contains(card.getNumber())){
		    result=true;
		}
		else{
		    result=false;
		}
		
		return result;
	}
	// Validate the card number length
	public static boolean validateNumber(String number) {
		//write your code here
		boolean result=true;
		if(number.length()==16){
		    result=false;
		}
		else{
		    result=true;
		}
		
 	  return result;
	}
	// Get the blocklisted no's from the file and return list of numbers
	public List<String> getBlockListNumbers(String fileName) throws IOException {
		//write your code here
		BufferedReader br=new BufferedReader(new FileReader(fileName));
		String line=br.readLine();
		ArrayList<String> blocklist=new ArrayList<String>();
		while(line!=null){
		    String cards[]=line.split(",");
		    for(int i=0;i<cards.length;i++){
		        blocklist.add(cards[i]);
		    }
		    line=br.readLine();
		}
		return blocklist;
	}
}
