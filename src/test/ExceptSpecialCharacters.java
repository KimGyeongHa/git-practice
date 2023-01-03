package test;

import java.util.Scanner;

public class ExceptSpecialCharacters {
	
	public static String palindrome(String sentence) {
		String answer = "YES";
		
		sentence = sentence.replaceAll("[^A-Z]", "");

		String temp = new StringBuilder(sentence).reverse().toString();

		System.out.println(sentence);
		if(!sentence.equals(temp)) return "NO";
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(palindrome(new Scanner(System.in).nextLine().toUpperCase()));
	}

}
