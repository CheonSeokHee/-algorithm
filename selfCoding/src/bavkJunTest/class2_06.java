package bavkJunTest;

import java.io.IOException;
import java.util.Scanner;

public class class2_06 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
    	
		
		// BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
		 Scanner sc = new Scanner(System.in);
		 
		 
		 
		 int hour = sc.nextInt();
		 int min = sc.nextInt();
		
		 int cookMin = sc.nextInt();
		 
		 hour += cookMin / 60;
		 min += cookMin % 60;
		 
		if(59 < min) {

			hour += 1;
			min -= 60;
		 }
		 
		 if(23 < hour) {
			 
			hour -= 24;

		 }
		 
		 System.out.println(hour + " " + min );
		 
		}
}
