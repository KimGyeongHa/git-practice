package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 배열합치기 {
	
	
	static List<Integer> arrAdd(int[] answerOne,int[] answerTwo) {
		List<Integer> resultList = new ArrayList<>();
		
		for(int arrVal : answerOne) {
			resultList.add(arrVal);
		}
		
		for(int arrVal : answerTwo) {
			resultList.add(arrVal);
		}
		
		for(int i=0 ; i< resultList.size() ; i++) {
			for(int j=1 ; j <resultList.size() ; j++) {
				if(resultList.get(j-1) > resultList.get(j)) {
					int temp = resultList.get(j-1);
					resultList.set(j-1, resultList.get(j));
					resultList.set(j, temp);
				}else continue;
			}
		}
		
		
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
