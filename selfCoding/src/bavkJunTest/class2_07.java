package bavkJunTest;

import java.io.IOException;
import java.util.Scanner;

public class class2_07 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		 Scanner sc = new Scanner(System.in);
		 
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		 
		 int result = 0;
		 
		 if(a == b && a == c && b == c) {
			 
		result = 10000 + (a * 1000);
		
		System.out.println("1"+result);
			 
		 }
		 
		 else if(a == b || a == c) {
			 	 
		 result = 1000 + (a*100);
			 
		 System.out.println("2"+result);
		 
		 }else if(b == c) {
			 
			 result = 1000 + (b*100);
				 
			 System.out.println("3"+result);
			 
		 } else if (a != b && a != c && b != c) {
			 							
			 System.out.println("4"+Math.max(a, Math.max(b, c))*100);
		 }
		
	
	}
}
