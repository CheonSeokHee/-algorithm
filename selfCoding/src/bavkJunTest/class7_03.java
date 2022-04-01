package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class7_03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //입력
		 
		 StringBuilder sb = new StringBuilder(); // 출력
		
		
			String s =bufferedReader.readLine(); //내가 받을 문자열 baekjoon
		
			for(char a = 'a'; a <= 'z'; a++) { //a 부터 z까지
				
				sb.append(s.indexOf(a)).append(" "); //indexOf 메소드 이용해서 a-z까지 확인하고 반환 문자가 없다면 -1 + " "
				
				
			}
			System.out.println(sb.toString());
		
	}

}
