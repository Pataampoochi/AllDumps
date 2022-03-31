package com.cts.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.*;

import com.cts.entity.CreditCard;

public class CreditCardService {
	//check whether the card is blocklisted and card contains only 16 digits
	public String validate(CreditCard card,String fileName) throws IOException
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
	public boolean validateAgainstBlocklist(CreditCard card, String fileName) throws IOException {
		//write your code here
		boolean bol = true;
		String str = "";
		str = new String(Files.readAllBytes(Paths.get(fileName)));
		String dig[] = str.split(",");
		String str2 = dig[0];
		String str3 = dig[1];
		if(card.getNumber().equalsIgnoreCase(str2) || card.getNumber().equalsIgnoreCase(str3))
		{
		    bol=true;
		}
		else{
		    bol=false;
		}
		
		return bol;
	}
	// Validate the card number length
	public boolean validateNumber(String number) {
		int len = number.length();
		boolean bol=true;
		if(len!=16)
		{
		    bol=true;
		}
		else{
		    bol=false;
		}
		
		
		return bol;
	}
	// Get the blocklisted no's from the file and return list of numbers
	public List<String> getBlockListNumbers(String fileName) throws IOException {
		
		List<String> li = new ArrayList<String>();
		String data = "";
		data = new String(Files.readAllBytes(Paths.get(fileName)));
		String dig1[] = data.split(",");
		for(int i=0;i<dig1.length;i++)
		{
		    li.add(dig1[i]);
		}
		
		return li;
	}
}
