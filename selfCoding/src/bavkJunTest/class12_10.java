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
		
		Arrays.sort(arr, new Comparator<String[]>() { //arrays.stream ã�ƺ���
			
   	 		@Override 
   	 		public int compare(String[] s1, String[] s2) {
   	 			
   	 		if(s1[0] == s2[0]) { //���� ��  20�� 21 ��
   	 			
   	 			
   	 			return 1; //���� ���»���� �켱��
   	 			
   	 		}else {
   	 					
   	 			return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]); //�̰� ����Ʈ sysout ������ �� ������ ������ ��
   	 		}
   	 	}
   	 	});
		
		for(int i = 0; i < N; i++) {
			
			System.out.println(arr[i][0] + " " + arr[i][1]);
			
		}

		
		
	}

}
