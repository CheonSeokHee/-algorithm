package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class class12_10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] arr = new String [N][2];
		
		for(int i=0; i<N; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken(); 
		}
		
		//System.out.println(arr[0][0]);
		
		Arrays.sort(arr, new Comparator<String[]>() { //arrays.stream 찾아보기
			
   	 		@Override 
   	 		public int compare(String[] s1, String[] s2) {
   	 			
   	 		if(s1[0] == s2[0]) { //나이 비교  20과 21 비교
   	 			
   	 			
   	 			return 1; //먼저 들어온사람이 우선시
   	 			
   	 		}else {
   	 					
   	 			return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]); //이게 포인트 sysout 찍으면 더 작은게 앞으로 감
   	 		}
   	 	}
   	 	});
		
		for(int i = 0; i < N; i++) {
			
			System.out.println(arr[i][0] + " " + arr[i][1]);
			
		}

		
		
	}

}
