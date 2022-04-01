package inFlearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example02_09 {
	public int solution(int n, int[][] arr) {
		
		int answer = Integer.MIN_VALUE; // 최댓값을 찾아야되니까 정수값에서 가장 작은값으로 세팅
		
		int sum1; //행의 합
		int sum2; //열의 합
		
		for(int i = 0; i < n; i++) {
			
			sum1 = 0;
			sum2 = 0;
			
			for(int j = 0; j < n; j++) {
			
				sum1 += arr[i][j];  //행의 [0][1] [0][2] 이런식으로 합
				sum2 += arr[j][i];  //열의 [1][0] [2][0] 이런식으로 합
				
			}
			answer = Math.max(answer, sum1); //행의 최댓값			
			answer = Math.max(answer, sum2); //열의 최댓값
			
		}
		
		sum1 = sum2 = 0;
		
		for(int i = 0; i < n; i++) { // 대각선 2군데 구하기
			
			sum1 += arr[i][i]; //왼쪽 대각선
			sum2 += arr[i][n-i-1]; // 오른쪽 대각선
			
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
		
	}
	
	public static void main(String[] args) throws IOException {
		example02_09 T = new example02_09();
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = br.read();
		int[][] arr = new int[n][n]; //2차원 배열
		
		for(int i = 0; i < n;  i++) { //이중for문
			for(int j = 0; j < n; j++) {
				arr[i][j] = br.read();
				
			}
			
		}
		System.out.println(T.solution(n, arr));	
	}

}
