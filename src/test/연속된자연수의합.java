package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 연속된자연수의합 {
	
	static int continueNaturalNumSum(int answerNum) {
		int result = 0;
		int tempSum = 0;
		int tempCnt = 1;
		
		for(int i=1; i<answerNum ; i++) {
			tempSum += i;
			if(tempSum == answerNum) result++;
			while(tempSum > answerNum) {
				tempSum -= tempCnt++;
				if(tempSum == answerNum) result++; 
			}
		}

		return result;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(continueNaturalNumSum(Integer.valueOf(br.readLine())));
	}

}
