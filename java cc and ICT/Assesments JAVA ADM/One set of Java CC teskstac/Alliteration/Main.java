package java_lc_cc.Alliteration;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter");
		String letter = sc.nextLine().toLowerCase();
		String sentence = sc.nextLine().toLowerCase();
		
		String[] words = sentence.split(" ");
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].startsWith(letter)) {
				count++;
			}
		}
		
		if (count >= 3) {
			int score = (count * 2 - 4);
			System.out.println("Good,You get a score of "+score);
		} else {
			System.out.println("No score for "+letter+" in "+sentence);
		}
	}

}
