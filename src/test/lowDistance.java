package test;

import java.util.Scanner;

public class lowDistance {
	
	public static String distanceChk(String s,char t) {
		String answer = "";
		int distanceCnt = 0;
		
		for(char c : s.toCharArray()) {
			if(c == t) {
				distanceCnt = 0;
				answer += distanceCnt;
			}else {
				distanceCnt++;
				answer += distanceCnt;
			}
		}

		return answer;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(distanceChk(sc.nextLine().toLowerCase(), sc.next().toLowerCase().charAt(0)));
		
	}

}
