package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class class12_01 {
	
	public static void main(String[] args) throws IOException {
		
		
		//���� �Է� �������� �迭�� ��� �迭 �������� ������ְ� for�� ������ ������ָ� �ɰŰ�����...
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
	
		int array[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			
			array[i] = Integer.parseInt(br.readLine());
			
		}
		
		Arrays.sort(array); //�迭 �ڵ� ���� �̰� �� ����ϱ�
			
		for(int i : array) {
			
			System.out.println(i);
			
		}
	}
}
