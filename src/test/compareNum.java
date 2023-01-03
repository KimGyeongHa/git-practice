package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class compareNum {

	public static ArrayList<Integer> answer(int[] NumValues) {
		ArrayList<Integer> answerList = new ArrayList<>();
		answerList.add(NumValues[0]);
		
		for(int i=1; i < NumValues.length-1; i++) {
			if(NumValues[i] < NumValues[i+1]) answerList.add(NumValues[i+1]);
		}
		
		
		return answerList;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		int[] NumValues = new int[cnt];
		for(int i=0;i<cnt ; i++) {
			NumValues[i] = Integer.parseInt(br.readLine());
		}
		
		ArrayList<Integer> answer = answer(NumValues);
		
		for(int val : answer) {
			bw.write(val + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
