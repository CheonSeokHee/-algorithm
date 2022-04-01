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
					
		
		int temp[] = array.clone(); //정렬된 배열과 입력 그대로 받은 배열 2개가 필요하기 때문 타입이 다르면 복사가 안된다.
		
	
		Arrays.sort(array);
		
		HashMap<Integer, Integer> hmap = new HashMap<>(); //인덱스 대신 key를 사용한 배열 기존 배열은 0부터 시작한다면 key를 통해 a b c 등으로 표현 가능
		
   	 	for(int i = 0 ; i < array.length ; i++) {
   	 		
   	 		if(!hmap.containsKey(array[i])) //array[i]와 같은게 있으면 true 없으면 false를 반환해주는 메소드   있으면 0을 리턴하고 없으면 -1리턴
   	 			
   	 			hmap.put(array[i], cnt++);
   	 	}
		
   	 	for(int i = 0; i < num ; i++) { //temp를 위에서 만들었던 이유 출력해야 하는 순서는 처음 입력받은 순서이어야 하기 때문에
   	 		
	 		sb.append(hmap.get(temp[i])).append(" ");
	 	}
	 	
	 	System.out.println(sb);
	}
	

}
