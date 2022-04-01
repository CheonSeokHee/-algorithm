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
			public int compare(String o1, String o2) { //compareTo 메소드를 사용해서 String 문자열을 사전순으로 정렬하는 기능, 
				
				if(o1.length() == o2.length()) { //길이 정렬
					
					return o1.compareTo(o2); //사전순으로 정렬
									
				} else {					
					return o1.length() - o2.length();
				}
			}
			
		});
	
		
		System.out.println(array[0]);	//1번째와 비교해야하기 때문에 제일 앞에있는걸 먼저 출력해주기
		
		for(int i = 1; i < array.length; i++) {			
			
			if(!array[i].equals(array[i-1])) { // 0번째랑 1번째랑..2번째..3번째
				
				System.out.println(array[i]);
			}
			
		}
}

	}


