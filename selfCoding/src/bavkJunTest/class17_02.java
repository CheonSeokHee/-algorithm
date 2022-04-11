package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class class17_02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int K = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < K; i++) {
			
			int number = Integer.parseInt(br.readLine());	// ���� �Է�
			
			if(number == 0) {	// 0�̶�� ���ÿ� ����� top ���Ҹ� �����.
				stack.pop();
			}
			else {
				/*
				 * push() ��� add()�� ��ü�ص� �� (�Ȱ��� ��ܿ� ���Ҹ� �߰��ϴ� �޼ҵ��.)
				 * ex) stack.add(number);
				 */
				stack.push(number);
			}
		}
		int sum = 0;
		
		for(int o : stack) {
			sum += o;
		}
 
		System.out.println(sum);		
	}
		

}
