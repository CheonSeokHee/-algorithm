package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class class12_11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		 
		int num = Integer.parseInt(br.readLine());
			
   	 	int[] array = new int[num];
   	 	int cnt = 0;
   	 	
   	 	
   	 	String[] arr = br.readLine().split(" "); 
		
		for(int i = 0; i < array.length; i++) 
			
		array[i] = Integer.parseInt(arr[i]);
					
		
		int temp[] = array.clone(); //���ĵ� �迭�� �Է� �״�� ���� �迭 2���� �ʿ��ϱ� ���� Ÿ���� �ٸ��� ���簡 �ȵȴ�.
		
	
		Arrays.sort(array);
		
		HashMap<Integer, Integer> hmap = new HashMap<>(); //�ε��� ��� key�� ����� �迭 ���� �迭�� 0���� �����Ѵٸ� key�� ���� a b c ������ ǥ�� ����
		
   	 	for(int i = 0 ; i < array.length ; i++) {
   	 		
   	 		if(!hmap.containsKey(array[i])) //array[i]�� ������ ������ true ������ false�� ��ȯ���ִ� �޼ҵ�   ������ 0�� �����ϰ� ������ -1����
   	 			
   	 			hmap.put(array[i], cnt++);
   	 	}
		
   	 	for(int i = 0; i < num ; i++) { //temp�� ������ ������� ���� ����ؾ� �ϴ� ������ ó�� �Է¹��� �����̾�� �ϱ� ������
   	 		
	 		sb.append(hmap.get(temp[i])).append(" ");
	 	}
	 	
	 	System.out.println(sb);
	}
	

}
