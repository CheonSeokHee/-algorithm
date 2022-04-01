package inFlearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example02_09 {
	public int solution(int n, int[][] arr) {
		
		int answer = Integer.MIN_VALUE; // �ִ��� ã�ƾߵǴϱ� ���������� ���� ���������� ����
		
		int sum1; //���� ��
		int sum2; //���� ��
		
		for(int i = 0; i < n; i++) {
			
			sum1 = 0;
			sum2 = 0;
			
			for(int j = 0; j < n; j++) {
			
				sum1 += arr[i][j];  //���� [0][1] [0][2] �̷������� ��
				sum2 += arr[j][i];  //���� [1][0] [2][0] �̷������� ��
				
			}
			answer = Math.max(answer, sum1); //���� �ִ�			
			answer = Math.max(answer, sum2); //���� �ִ�
			
		}
		
		sum1 = sum2 = 0;
		
		for(int i = 0; i < n; i++) { // �밢�� 2���� ���ϱ�
			
			sum1 += arr[i][i]; //���� �밢��
			sum2 += arr[i][n-i-1]; // ������ �밢��
			
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
		
	}
	
	public static void main(String[] args) throws IOException {
		example02_09 T = new example02_09();
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = br.read();
		int[][] arr = new int[n][n]; //2���� �迭
		
		for(int i = 0; i < n;  i++) { //����for��
			for(int j = 0; j < n; j++) {
				arr[i][j] = br.read();
				
			}
			
		}
		System.out.println(T.solution(n, arr));	
	}

}
