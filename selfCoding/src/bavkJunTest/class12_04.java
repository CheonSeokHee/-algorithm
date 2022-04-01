package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class class12_04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//1.평균 2.중앙값 3.가장많이 나온값 4. 최대-최소
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		int array[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			
			array[i] = Integer.parseInt(br.readLine());
			
		}
		
		Arrays.sort(array); //배열 자동 정렬 이거 꼭 기억하기
		
		
		
		for(int i : array) {
			
		sb.append(i).append("\n");
		
		}
		
		System.out.print(sb);

}
	
	

	}

