package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 배열합치기twoPointer {
	
	
	static List<Integer> arrAdd(int[] firstArr, int[] secondArr) {
		List<Integer> resultList = new ArrayList<Integer>();
		int firArrCnt = 0;
		int secArrCnt = 0;
		
		while(firArrCnt < firstArr.length && secArrCnt < secondArr.length) {
			if(firstArr[firArrCnt] < secondArr[secArrCnt]) resultList.add(firstArr[firArrCnt++]);
			else resultList.add(secondArr[secArrCnt++]);
		}
		
		while(firArrCnt < firstArr.length) resultList.add(firstArr[firArrCnt++]);
		while(secArrCnt < secondArr.length) resultList.add(secondArr[secArrCnt++]);

		
		return resultList;
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int firstArrSize = Integer.valueOf(br.readLine());
		int[] firstArr = new int[firstArrSize];
		
		for(int i=0; i< firstArrSize ; i++) {
			firstArr[i] = Integer.valueOf(br.readLine());
		}
		
		int secondArrSize = Integer.valueOf(br.readLine());
		int[] secondArr = new int[secondArrSize];
		
		for(int i=0; i < secondArrSize ; i++) {
			secondArr[i] = Integer.valueOf(br.readLine());
		}		
		
		List<Integer> resultList = arrAdd(firstArr, secondArr);
		
		for(int resultVal : resultList) {
			System.out.print(resultVal + " ");
		}

		
	}
}
