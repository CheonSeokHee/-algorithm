package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class class12_02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//�����ķ� Ǯ����ϴµ�.. 
		//�׷������� collections.sort�� ����غ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		//StringBulider ����ؼ� �ð��ʰ��� �ٿ��־���� ���ϸ� �ٿ��־���
		
		int num = Integer.parseInt(br.readLine());
		
		//list �迭 �������ֱ�
		ArrayList <Integer> list = new ArrayList<>();
		
		for(int i = 0; i < num; i++ ) {
			
			list.add(Integer.parseInt(br.readLine()));
		}
		
		//���
		Collections.sort(list);
		
		for(int i : list) {
			
			//�ٷ� �̾��ְ� �Ǹ� �ð��ʰ� �߻��ϹǷ� StringBuilder�� ����ؼ� �־��־����
			sb.append(i).append("\n");
		
		}
		System.out.println(sb);
	}
}
