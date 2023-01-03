package test;

import java.util.Scanner;

public class sameSentence {
	
	public static String chkSentence(String st) {
		String answer = "";
		
		char olWord  = 0;
		int cnt = 1;
		int cntChk = 0;
		for(char a : st.toCharArray()) {
			cntChk++;
			
			if(a == olWord) {
				cnt++;
				if(cnt > 1 && cntChk == st.length()) answer += cnt;
			}else {
				olWord = a;
				if(cnt > 1 && cntChk != st.length()) {
					answer += cnt;
					cnt = 1;	
				}
				answer += a;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(chkSentence(sc.next().toUpperCase()));
	}
	

}
