package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class 멘토링 {
	
	static int mentoChk(int studentSize,int examSize,int[][] answer) {
		int result = 0;
		
		for(int i=1 ; i <= studentSize ; i++) {
			for(int j=1 ; j <= studentSize ; j++) {
				int cnt = 0;
				for(int k = 0 ; k < examSize ; k++) {
					int pi =0, pj=0;
					for(int m = 0 ; m < studentSize ; m++) {
						if(answer[k][m] == i ) pi = m;
						if(answer[k][m] == j ) pj = m;
					} 
					if(pi < pj ) cnt++;
					else continue;
				}
				if(cnt == examSize) result++;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int studentCnt = Integer.valueOf(br.readLine());
		int examCnt = Integer.valueOf(br.readLine());
		
		int[][] answer = new int[examCnt][studentCnt];
		
		for(int i=0 ; i < examCnt ; i++) {
			for(int j=0 ; j < studentCnt ; j++) {
				answer[i][j] = Integer.valueOf(br.readLine());
			}
		}
		
		System.out.println(mentoChk(studentCnt,examCnt,answer));
	}

}
