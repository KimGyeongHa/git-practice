package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 연속된자연수의합2 {
	
	static int continueNaturalNumSum(int answerNum) {
		int result = 0;
		int cnt = 1;
		int temp = 0;
		--answerNum;
		while(answerNum > 0) {
			cnt++;
			answerNum = answerNum - cnt;
			if(answerNum%cnt == 0) result++;
		}

		return result;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(continueNaturalNumSum(Integer.valueOf(br.readLine())));
	}

}
