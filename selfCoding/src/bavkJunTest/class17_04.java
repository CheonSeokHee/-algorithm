package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class class17_04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Scanner sc = new Scanner(System.in);
		
		String N = sc.nextLine();
		
		Stack<Character> stack = new Stack<>();
		
		while(true) {
			
			if(N.equals(".")) {
				
				break;
			}

			for (int i = 0; i < N.length(); i++) {
				
				char temp = N.charAt(i);
				
				if (temp == '(' || temp == '[') {
					stack.push(temp);
				} else if (temp == ')' || temp == ']') {
					if (stack.isEmpty() || (stack.peek() == '(' && temp == ']') || (stack.peek() == '[' && temp == ')')) {
						stack.push(temp);
						break;
					}
					stack.pop();

				}
			}

			if (!stack.isEmpty())
				System.out.println("no");
			else
				System.out.println("yes");

		}
			
		}
			
	}
