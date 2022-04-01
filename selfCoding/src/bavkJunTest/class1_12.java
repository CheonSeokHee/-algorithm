package bavkJunTest;

import java.util.Scanner;

public class class1_12 {
	public static void main(String[] args) {
    	
		Scanner src = new Scanner(System.in);
		
		int a , b , c;
		
		a = src.nextInt(); //4
		b = src.nextInt(); //5
		c = src.nextInt(); //5
		
		System.out.println((a+b)%c);
		System.out.println(((a%c) + (b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c) * (b%c))%c);

    	
    }
}
