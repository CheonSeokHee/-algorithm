package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class class7_07 {

	public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //�Է�
		 
		 StringTokenizer st = new StringTokenizer(br.readLine()); //���ڿ��� �������� ��ū���� �и��ϴ� Ŭ���� ����Ʈ�� ����
		 
		 int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		 
		 int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		 
		 if(a < b) {
			 
			 System.out.println(b);
		 } else {
			 System.out.println(a);
			 			 
		 }
			 
		 }
		 
	}

