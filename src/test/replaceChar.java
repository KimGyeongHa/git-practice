package test;

import java.util.Scanner;

public class replaceChar {
	
	public static int numFind(String sentence) {
		int answer = 0;
		
		/*sentence = sentence.replaceAll("[^0-9]", "");
		
		answer = Integer.valueOf(sentence);
		*/
		
		for(char c : sentence.toCharArray()) {
			if(c >= 48 && c <= 57 ) System.out.println(c-1);
			//answer = answer*10 + (c-48);
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		System.out.println(numFind(new Scanner(System.in).nextLine()));
		
	}
	
	

}
