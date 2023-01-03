package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class compareKey2 {
	
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
		Scanner sc = new Scanner(System.in);
		
		int cnt = Integer.parseInt(sc.next());
		
		int[] keyArr = new int[cnt];
		
		for(int i=0 ; i < cnt ; i++) {
			keyArr[i]  = Integer.parseInt(sc.next());
		}
		
		int answer = answer(keyArr);
		
		System.out.println(answer);
	}

}
