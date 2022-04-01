package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class class12_09 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
			
		String array[] = new String[num];
		
		for(int i = 0; i < num; i++) {
			
			array[i] = br.readLine();
			
		}
		
		Arrays.sort(array, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) { //compareTo �޼ҵ带 ����ؼ� String ���ڿ��� ���������� �����ϴ� ���, 
				
				if(o1.length() == o2.length()) { //���� ����
					
					return o1.compareTo(o2); //���������� ����
									
				} else {					
					return o1.length() - o2.length();
				}
			}
			
		});
	
		
		System.out.println(array[0]);	//1��°�� ���ؾ��ϱ� ������ ���� �տ��ִ°� ���� ������ֱ�
		
		for(int i = 1; i < array.length; i++) {			
			
			if(!array[i].equals(array[i-1])) { // 0��°�� 1��°��..2��°..3��°
				
				System.out.println(array[i]);
			}
			
		}
}

	}


