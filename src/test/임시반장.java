package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 임시반장 {
	
	static int tempNumChk(int size,int[][] answer) {
		int maxLine = 0;
		int temp = 0;
		
		for(int i=1 ; i <= size ; i++) {
			int cnt = 0;
			for(int j=1 ; j <= size; j++) {
				for(int z=1; z < answer.length ; z++) {
					if(answer[i][z] == answer[j][z]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt > temp) {
				maxLine = i;
				temp = cnt;
			}
		}
		
		return maxLine;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arrSize =  Integer.valueOf(br.readLine());
		
		int[][] answer = new int[arrSize+1][6];
		
		for(int i=1 ; i<=arrSize ; i++) {
			for(int j=1 ; j <= 5 ; j++) {
				answer[i][j] = Integer.valueOf(br.readLine());
			}
		}
		System.out.println(tempNumChk(arrSize,answer));
		
	}

}
