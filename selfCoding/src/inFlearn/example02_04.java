package inFlearn;

import java.util.Scanner;

public class example02_04 {
	
	public int[] solution(int n) {
		
		int[] answer = new int[n]; // n만큼 넣을 배열 만들기
	
		answer[0] = 1;
		answer[1] = 1;
		
		for(int i = 2; i < n; i++) {  //0 1을 설정해 두었으니 2부터 돌아야됨
			
			answer[i] = answer[i-2] + answer[i-1];  // i가 2일때 [0] + [1] --> i가 3일때 [1] + [2]
		
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
