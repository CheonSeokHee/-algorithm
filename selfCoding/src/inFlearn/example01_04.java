package inFlearn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class example01_04 {
	
	public ArrayList<String> solution(int n, String[] str) {
		
		ArrayList<String> answer = new ArrayList<>();
		
		for(String x : str) {
			
			/*
			 * String tmp = new StringBuilder(x).reverse().toString(); //String으로만 붙으면 새로운
			 * 객체가 생성되므로 메모리 공간이 차지하지만 StringBuilder를 이용하면 만든걸로 계쏙 씀
			 * 
			 * answer.add(tmp); //array에 추가해줌
			 */			
			
			char[] s = x.toCharArray(); //String 배열로 만듬
			
			int lt = 0;
			int rt = x.length()-1; // lt 부터 rt 자리만 서로 문자를 바꿔보자
			
			while(lt < rt) {
				
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;			
				lt ++;
				rt --;
				
			}
			String tmp = String.valueOf(s); //valueOf는 스태틱 메소드 이므로 String에서 접근이 가능함
			answer.add(tmp);
		}
		return answer;	
		
	}
	
	public static void main(String[] args) throws IOException {
		
		example01_04 T = new example01_04();
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		
		int str = sc.nextInt();
	
		String[] s = new String[str];
		
		for(int i = 0; i < str; i++) {
			
			s[i] = sc.next();
		}
	
		for(String x : T.solution(str, s)) {
			
		System.out.println(x);	
		
	}

	}

}
