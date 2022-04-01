package inFlearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example01_03 {

	public String solution(String str) {
	
		String answer=""; //가장 긴 단어

		int m = Integer.MIN_VALUE; //카운트할 단어를 가장 최소값으로 초기설정
		
		String[] s = str.split(" ");
		
		for(String x : s) {
			
			int length = x.length();
			
			if(m < length) {
				
				m = length; //최대를 구하는 공식
				answer = x;
							
				//System.out.println(m);
			}
		}
	
		return answer;	
		
	}
	
	public static void main(String[] args) throws IOException {
		
		example01_03 T = new example01_03();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine(); // 한줄을 모두 읽어야 하므로 readLine으로 받아야함
		
		System.out.println(T.solution(str));
	}

}
