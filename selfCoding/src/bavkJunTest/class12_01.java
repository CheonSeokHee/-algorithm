package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class class12_01 {
	
	public static void main(String[] args) throws IOException {
		
		
		//숫자 입력 받은것을 배열에 담고 배열 오름차순 계산해주고 for문 돌려서 출력해주면 될거같은데...
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
	
		int array[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			
			array[i] = Integer.parseInt(br.readLine());
			
		}
		
		Arrays.sort(array); //배열 자동 정렬 이거 꼭 기억하기
			
		for(int i : array) {
			
			System.out.println(i);
			
		}
	}
}
