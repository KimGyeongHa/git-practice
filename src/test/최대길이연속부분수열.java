package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최대길이연속부분수열 {
	
	public int findMaxLengthInArr(int[] answerValues,int changeCnt) {
		int result = 0, tempCnt = 0, max= 0, rt=0;
		
		for(int i=0 ; i< answerValues.length; i++) {

			if(tempCnt == changeCnt && answerValues[i] == 0) {
				i = ++rt;
				max = 0;
				tempCnt = 0;
			}

			if(answerValues[i] == 0) {
				tempCnt++;
				if(tempCnt == 1) rt = i;
			}
			max++;
			result = Math.max(result,max);
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
