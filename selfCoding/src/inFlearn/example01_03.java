package inFlearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example01_03 {

	public String solution(String str) {
	
		String answer=""; //���� �� �ܾ�

		int m = Integer.MIN_VALUE; //ī��Ʈ�� �ܾ ���� �ּҰ����� �ʱ⼳��
		
		String[] s = str.split(" ");
		
		for(String x : s) {
			
			int length = x.length();
			
			if(m < length) {
				
				m = length; //�ִ븦 ���ϴ� ����
				answer = x;
							
				//System.out.println(m);
			}
		}
	
		return answer;	
		
	}
	
	public static void main(String[] args) throws IOException {
		
		example01_03 T = new example01_03();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine(); // ������ ��� �о�� �ϹǷ� readLine���� �޾ƾ���
		
		System.out.println(T.solution(str));
	}

}
