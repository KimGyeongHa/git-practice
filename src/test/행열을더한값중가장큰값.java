package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 행열을더한값중가장큰값 {
	
	static int maxNum(int[][] answer) {
		int result = 0;
		int crossTemp1 = 0;
		int crossTemp2 = 0;
		
		for(int i=0 ; i < answer.length ; i++) {
			int widthTemp = 0;
			int heigthTemp = 0;
			
			for(int j=0 ; j < answer.length; j++) {
				widthTemp += answer[i][j];
				heigthTemp += answer[j][i];
			}
			result = Math.max(result, widthTemp);
			result = Math.max(result, heigthTemp);
		}
		
		
		for(int i=0 ; i< answer.length; i++) {
			crossTemp1 += answer[i][i];
			crossTemp2 += answer[i][answer.length-1-i];
		}
		result = Math.max(result, crossTemp1);
		result = Math.max(result, crossTemp2);
		

		return result;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arrSize = Integer.valueOf(br.readLine());
		int[][] answer = new int[arrSize][arrSize];
		
		for(int i=0; i < arrSize ; i++) {
			for(int j=0; j< arrSize ; j++) {
				answer[i][j] = Integer.valueOf(br.readLine());
			}
		}
		
		int reuslt = maxNum(answer);
		
		System.out.println(reuslt);
		
	}

}
