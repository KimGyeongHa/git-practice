package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class printRank {
	
	static int[] rankChk(int[] answer) {
		int[] resultArr = new int[answer.length];
		int rank = 1;
		int chkVal = 0;
		for(int i=0;i<answer.length;i++) {
			
		}
		
		return resultArr;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		int[] answerArr = new int[cnt];
		for(int i=0 ; i < cnt; i++) {
			answerArr[i] = Integer.parseInt(br.readLine());
		}
		
	}

}
