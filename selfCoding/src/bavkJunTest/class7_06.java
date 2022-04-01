package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class7_06 {

	public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //ют╥б
		 
  		 String s =br.readLine().trim(); 
			
			
			if(s.isEmpty()) {
				
				System.out.println("0");
				
			} else {
				
				System.out.println(s.split(" ").length);
			}
	}

}
