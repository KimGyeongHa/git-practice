package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class compareKey {
	
	static int answer(int[] keyArr){
		ArrayList<Integer> answerList = new ArrayList<>();
		int tempKey = 0;
		int answer = 0;
		
		for(int temp : keyArr) {
			if(temp > tempKey) {
				answerList.add(temp);
				tempKey = temp;
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		
		int[] keyArr = new int[cnt];
		
		for(int i=0 ; i < cnt ; i++) {
			keyArr[i]  = Integer.parseInt(br.readLine());
		}
		
		int answer = answer(keyArr);
		
		bw.write(answer + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
