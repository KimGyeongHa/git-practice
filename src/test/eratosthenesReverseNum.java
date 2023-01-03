package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class eratosthenesReverseNum {
	
	static boolean isEratosthenesNum(int reverseNum) {
		if(reverseNum <= 1) return false;
		for(int i=2; i < reverseNum ; i++) {
			if(reverseNum%i == 0 )return false;
		}
		return true;
	}
	
	static List<Integer> findEratosthenesNum(int[] answer) {
		List<Integer> result = new ArrayList<>();

		for(int temp : answer) {
			int reverseNum = 0;
			while(temp > 0) {
				reverseNum = reverseNum*10 + temp%10;
				temp = temp/10;
			}
			if(isEratosthenesNum(reverseNum)) result.add(reverseNum);
		}
		
		return result;
	}
	
	public static void main(String[] args){
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		int[] answer = new int[sc.nextInt()];
		
		for(int i=0 ; i < answer.length ; i++) {
			answer[i] = sc.nextInt();
		}
		List<Integer> result = findEratosthenesNum(answer);
		
		for(int resultVal : result) {
			System.out.print(resultVal + " ");
		}
		
	}

}
