package test;

import java.util.Scanner;

public class test {
	
	
	public static String reverseSentence(String sentence) {
		String answer = "";
		int lt =0;
		int rt = sentence.length()-1;
		char[] ch = sentence.toCharArray();
		char temp;
		
		while(lt<rt) {		
			if(Character.isAlphabetic(ch[lt]) == false) {
				lt++;
			}else if(Character.isAlphabetic(ch[rt]) == false) {
				rt--;
			}else {
				temp = ch[lt];
				ch[lt] = ch [rt];
				ch[rt] = temp;
				lt++;
				rt--;
			}	
		}
		
		answer  = String.valueOf(ch);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = reverseSentence(sc.next());
	
		System.out.println(a);
	
	}
	
	
	
	
	
	
	
	
	

	
}
