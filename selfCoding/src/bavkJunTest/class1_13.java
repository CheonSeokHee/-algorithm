package bavkJunTest;

import java.util.Scanner;

public class class1_13 {
	 public static void main(String[] args) {
	    	
			Scanner src = new Scanner(System.in);
			
			int a , b;
			
			a = src.nextInt(); //4
			b = src.nextInt(); //5
			
						
			System.out.println(a * (b %10));
			System.out.println(a * (b %100 / 10));
			System.out.println(a * (b /100));
			System.out.println(a * b);



	    	
	    }
}
