package test;

import java.util.Scanner;

public class palindrome {
	
	public static String chkSt(String chk) {
		String answer = "YES";
		
		String temp = new StringBuilder(chk).reverse().toString();
		
		if(!chk.equalsIgnoreCase(temp)) return "NO";
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(chkSt(sc.next()));
	}

}
