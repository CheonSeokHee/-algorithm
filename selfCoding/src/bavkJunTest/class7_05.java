package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class7_05 {
		public static void main(String[] args) throws NumberFormatException, IOException {
			
			 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //ют╥б
			 
			 StringBuilder sb = new StringBuilder();
			 
				String s =bufferedReader.readLine().toUpperCase(); 
				
				int[] arr = new int[26];
				
				int max = 0;
				
				char c = 'a';
				
				for(int i = 0; i < s.length(); i++) {
				
					arr[s.charAt(i)-65] ++;
					
					
					if(max < arr[s.charAt(i)-65]) {
						
						max = arr[s.charAt(i)-65];
						
						c = s.charAt(i);
						
					}else if(max == arr[s.charAt(i)-65]){
						
						c = '?';
						
					}
					
				}
				System.out.println(c);
				
		}

	}


