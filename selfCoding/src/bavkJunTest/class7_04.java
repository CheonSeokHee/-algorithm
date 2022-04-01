package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class7_04 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //입력
		 
		 //StringBuilder sb = new StringBuilder();
		 
		 int T = Integer.parseInt(bufferedReader.readLine()); //테스트케이스 개수
		 
		 int R; //반복횟수
		 
		 String[] str; // 문자형 배열 + 반복
		 
		 String S; // 문자형 배열
		 
		 for(int i = 0; i < T; i++) {
			 
			str = bufferedReader.readLine().split(" ");
			
			R = Integer.parseInt(str[0]);
			
			S = str[1];
			
			for(int j = 0; j < S.length(); j++) {
				
				for(int x = 0; x < R; x++) {
					
					System.out.print(S.charAt(j));
				}
				
			}
			
			System.out.println();
		 }
		 
	}
}
