package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class eratosthenesChk {
	
	static int eratosthenesCnt(int answer) {
		int result = 0;
		int[] chkArr = new int[answer+1];
		for(int i=2 ; i < answer; i++) {
			if(chkArr[i] == 0) result++;
			for(int j=i ; j<answer ; j=j+i) chkArr[j] = 1;
		}
		return result;
	}
	
	public static void main(String[] args) throws IOException{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		int reuslt = eratosthenesCnt(cnt);
		System.out.println(reuslt);
		
	}

}
