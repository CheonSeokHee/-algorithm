package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class class12_07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int [N][2];
		
		for(int i=0; i<N; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (arr_1, arr_2) -> { //람다식으로 2차원 배열끼리 비교해주어야함

			if(arr_1[0] == arr_2[0])  { //둘이 같을 때
				
				return arr_1[1] - arr_2[1]; //음수면 서로 자리를 바꾸지 않고
			}
			else {
				return arr_1[0] - arr_2[0];	//양수면 자리 바꾸기 
			}
		});
		
		for(int i=0; i<N; i++) {
			
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}

		System.out.println(sb);
		
	}
}
