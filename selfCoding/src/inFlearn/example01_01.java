package inFlearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example01_01 {

	public int solution(String str, char t) {
		
		int answer = 0;
		
		str = str.toUpperCase(); //대소문자 구분 x 다 대문자

		t = Character.toUpperCase(t); //뭐가 들어올지 모르니 똑같이 대소문자 구분 x
		
		for(char x : str.toCharArray()) { // forEach 문을 쓰려면 범위에서 컬렉션 프레임워크만 범위설정이 가능하므로 배열처럼 만들어주어야함
			
			if(x == t) {
				answer ++;
			}
			
		}
		
		return answer;
		
	}
	public static void main(String[] args) throws IOException {
		
		example01_01 T = new example01_01();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		char c = br.readLine().charAt(0); //인덱스로 접근해서 0번째 부터 문자를 하나 씩 읽어라
		
		System.out.println(T.solution(s, c));
		
		
	}

}
