package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class class12_05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		char array[] = br.readLine().toCharArray();		
		
		/*
		 * for(int i = 0; i < array; i++) {
		 * 
		 * array[i] = Integer.parseInt(br.readLine());
		 * 
		 * }
		 */
		
		Arrays.sort(array); //배열 자동 정렬 이거 꼭 기억하기
				
		//System.out.println(array); // 2143??
		for(int i = array.length-1; i >= 0; i--) {
			
			System.out.print(array[i]);
			
		}
}

}
