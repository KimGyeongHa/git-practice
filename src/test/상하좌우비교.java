package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 봉우리찾기
public class 상하좌우비교 {
	
	static int peakFind(int[][] answer) {
		int result = 0;
		int[] dx= {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		
		for(int i=1 ; i < answer.length-1; i++) {
			for(int j = 1; j < answer.length-1 ; j++) {
				boolean peakChk = true;
				for(int z=0; z <dx.length; z++) {
					if(answer[i][j] < answer[i+dx[z]][j+dy[z]]) {
						peakChk = false;
						break;
					}
				}
				if(peakChk) result++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arrVal = Integer.valueOf(br.readLine());
		int[][] answer = new int[arrVal+2][arrVal+2];
		
		for(int i=1 ; i < answer.length-1 ; i++) {
			for(int j=1 ; j < answer.length-1 ; j++) {
				answer[i][j] = Integer.valueOf(br.readLine());
			}
		}
		int result = peakFind(answer);
		System.out.println(result);
	}

}
