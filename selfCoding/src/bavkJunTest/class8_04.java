package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class class8_04 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()); //2  5
		int b = Integer.parseInt(st.nextToken()); //1  1
		int c = Integer.parseInt(st.nextToken()); //5  6

		//System.out.println(a + b+ c);
		
		int real = (c-b)/(a-b); //  4   
		
		if((c-b)%(a-b) != 0) {
			
			real ++;
			
		}
		System.out.println(real);
		
	}

}
