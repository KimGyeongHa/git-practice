package test;

import java.util.Scanner;

public class overlappingChk {
	
	public static String chk(String sentence) {
		String answer = "";
		
		for(int i=0; i<sentence.length(); i++) {
			if(sentence.indexOf(sentence.charAt(i))== i) {
				answer += sentence.charAt(i);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(chk(sc.next()));
		
	}
	
}
