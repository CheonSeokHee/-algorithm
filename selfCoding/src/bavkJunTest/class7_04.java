package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class7_04 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //�Է�
		 
		 //StringBuilder sb = new StringBuilder();
		 
		 int T = Integer.parseInt(bufferedReader.readLine()); //�׽�Ʈ���̽� ����
		 
		 int R; //�ݺ�Ƚ��
		 
		 String[] str; // ������ �迭 + �ݺ�
		 
		 String S; // ������ �迭
		 
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
