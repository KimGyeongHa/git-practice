package test;

import java.util.*;


public class sentenseChange {
		
	public static String sentenceChange(String sentence) {
		
		for(char text : sentence.toCharArray()) {
			if(Character.isUpperCase(text)) Character.toLowerCase(text);
			else Character.toUpperCase(text);
		}
		
		return sentence;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String result = sentenceChange(sc.next());
		
		System.out.println(result);
		
	}

}
