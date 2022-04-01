package inFlearn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class example01_04 {
	
	public ArrayList<String> solution(int n, String[] str) {
		
		ArrayList<String> answer = new ArrayList<>();
		
		for(String x : str) {
			
			/*
			 * String tmp = new StringBuilder(x).reverse().toString(); //String���θ� ������ ���ο�
			 * ��ü�� �����ǹǷ� �޸� ������ ���������� StringBuilder�� �̿��ϸ� ����ɷ� ��� ��
			 * 
			 * answer.add(tmp); //array�� �߰�����
			 */			
			
			char[] s = x.toCharArray(); //String �迭�� ����
			
			int lt = 0;
			int rt = x.length()-1; // lt ���� rt �ڸ��� ���� ���ڸ� �ٲ㺸��
			
			while(lt < rt) {
				
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;			
				lt ++;
				rt --;
				
			}
			String tmp = String.valueOf(s); //valueOf�� ����ƽ �޼ҵ� �̹Ƿ� String���� ������ ������
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
