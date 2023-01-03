package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 연속부분수열 {
	
	static int continueSumArr(int[] answerArr,int continueSum) {
		int result = 0;
		int temp = 0;
		int tempCnt = 0;
		
		for(int i=0; i<answerArr.length ; i++) {
			temp += answerArr[i];
			if(continueSum == temp) result++;
			while(temp > continueSum) {
					temp -= answerArr[tempCnt++];
					if(temp == continueSum) result++;
				}
			}

		return result;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arrSize = Integer.valueOf(br.readLine());
		int[] answerArr = new int[arrSize];
		int continueSum = Integer.valueOf(br.readLine());
		
		for(int i=0; i<arrSize; i++) {
			answerArr[i] = Integer.valueOf(br.readLine());
		}
		
		System.out.println(continueSumArr(answerArr, continueSum));
		
	}

}
