package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최대길이연속부분수열2 {
	
	public int findMaxLengthInArr(int[] answerValues,int changeCnt) {
		int result = 0, tempCnt = 0, max= 0, lt=0;
		
		for(int rt = 0; rt < answerValues.length ; rt++) {
			if(answerValues[rt] == 0) tempCnt++;
			while(tempCnt > changeCnt) {
				if(answerValues[lt] == 0) tempCnt--;
				lt++;
			}
			result = Math.max(result, rt-lt+1);
		}
		
		
		return result;
	}
	
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arrLength = Integer.valueOf(br.readLine());
		int changeArrCnt = Integer.valueOf(br.readLine());
		int[] answerArr = new int[arrLength];
		
		for(int i=0; i<arrLength; i++) {
			answerArr[i] = Integer.valueOf(br.readLine());
		}
		최대길이연속부분수열 aa = new 최대길이연속부분수열();
		System.out.println(aa.findMaxLengthInArr(answerArr,changeArrCnt));
	}
}
