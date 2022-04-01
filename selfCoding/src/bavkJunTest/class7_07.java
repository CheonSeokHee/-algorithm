package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class class7_07 {

	public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력
		 
		 StringTokenizer st = new StringTokenizer(br.readLine()); //문자열을 여러개의 토큰으로 분리하는 클래스 디폴트는 띄어쓰기
		 
		 int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		 
		 int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		 
		 if(a < b) {
			 
			 System.out.println(b);
		 } else {
			 System.out.println(a);
			 			 
		 }
			 
		 }
		 
	}

