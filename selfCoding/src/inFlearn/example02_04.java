package inFlearn;

import java.util.Scanner;

public class example02_04 {
	
	public int[] solution(int n) {
		
		int[] answer = new int[n]; // n��ŭ ���� �迭 �����
	
		answer[0] = 1;
		answer[1] = 1;
		
		for(int i = 2; i < n; i++) {  //0 1�� ������ �ξ����� 2���� ���ƾߵ�
			
			answer[i] = answer[i-2] + answer[i-1];  // i�� 2�϶� [0] + [1] --> i�� 3�϶� [1] + [2]
		
		}
		
		return answer;	
		
	}
	public static void main(String[] args) {
		
		example02_04 T = new example02_04();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int x : T.solution(n)) {
			
			System.out.print(x  + " ");
			
		}

	}

}
