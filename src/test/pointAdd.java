package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class pointAdd {
	
	static int addVal(int[] answer) {
		int result = 0;
		int temp = 0;
		
		
		for(int i=0 ; i < answer.length; i++) {
			if(answer[i] == 1) {
				temp++;
				result += temp;
			}else temp = 0;
		}
		
		return result;
	}
	
	public static void main(String[] args) throws IOException{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new  Scanner(System.in);
		
		
		int cnt = sc.nextInt();
		int[] answerArr = new int[cnt];
		for(int i=0 ; i<cnt ;i++) {
			answerArr[i] = sc.nextInt();
		}
		
		System.out.println(addVal(answerArr));
		
	}

}
