package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class7_03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //�Է�
		 
		 StringBuilder sb = new StringBuilder(); // ���
		
		
			String s =bufferedReader.readLine(); //���� ���� ���ڿ� baekjoon
		
			for(char a = 'a'; a <= 'z'; a++) { //a ���� z����
				
				sb.append(s.indexOf(a)).append(" "); //indexOf �޼ҵ� �̿��ؼ� a-z���� Ȯ���ϰ� ��ȯ ���ڰ� ���ٸ� -1 + " "
				
				
			}
			System.out.println(sb.toString());
		
	}

}
