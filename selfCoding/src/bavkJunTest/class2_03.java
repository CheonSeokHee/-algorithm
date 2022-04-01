package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class2_03 {
	 public static void main(String[] args) throws NumberFormatException, IOException {
	    	
			
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 
		int year = Integer.parseInt(bufferedReader.readLine());
		
		if(year % 4 == 0) {
			
			if( year % 400 == 0) {
				System.out.println("1");
				
		} else if(year % 100 == 0) {
			
			System.out.println("0");
			
			
		} else {
			
			System.out.println("1");

		} 
		}
		else {
			
			System.out.println("0");
		}
		}
	 }	

