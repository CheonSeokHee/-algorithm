package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class class12_02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//퀵정렬로 풀어야하는데.. 
		//그러지말고 collections.sort를 사용해보자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		//StringBulider 사용해서 시간초과를 줄여주어야함 부하를 줄여주야함
		
		int num = Integer.parseInt(br.readLine());
		
		//list 계열 선언해주기
		ArrayList <Integer> list = new ArrayList<>();
		
		for(int i = 0; i < num; i++ ) {
			
			list.add(Integer.parseInt(br.readLine()));
		}
		
		//사용
		Collections.sort(list);
		
		for(int i : list) {
			
			//바로 뽑아주게 되면 시간초과 발생하므로 StringBuilder를 사용해서 넣어주어야함
			sb.append(i).append("\n");
		
		}
		System.out.println(sb);
	}
}
