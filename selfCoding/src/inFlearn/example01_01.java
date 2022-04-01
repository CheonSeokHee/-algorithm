package inFlearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example01_01 {

	public int solution(String str, char t) {
		
		int answer = 0;
		
		str = str.toUpperCase(); //��ҹ��� ���� x �� �빮��

		t = Character.toUpperCase(t); //���� ������ �𸣴� �Ȱ��� ��ҹ��� ���� x
		
		for(char x : str.toCharArray()) { // forEach ���� ������ �������� �÷��� �����ӿ�ũ�� ���������� �����ϹǷ� �迭ó�� ������־����
			
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
		
		char c = br.readLine().charAt(0); //�ε����� �����ؼ� 0��° ���� ���ڸ� �ϳ� �� �о��
		
		System.out.println(T.solution(s, c));
		
		
	}

}
