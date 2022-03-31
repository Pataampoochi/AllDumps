package java_lc_cc.Call_Details;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the call details:");
		String data = sc.nextLine();
		Call call = new Call();
		call.parseData(data);
		System.out.println("Call id:"+call.getCallId());
		System.out.println("Called number:"+call.getCalledNumber());
		System.out.println("Duration:"+call.getDuration());
	}

}
