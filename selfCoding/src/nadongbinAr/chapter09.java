package nadongbinAr;

import java.util.Stack;

public class chapter09 {

	public static void main(String[] args) {
	//����
	//Last In First out
	//���� ���̺귯�� ���
		
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1); //�ֱ�
		stack.push(2);
		stack.push(3);
		stack.push(4);
	
		System.out.println(stack.pop()); // �� �������� ���� ������ �������� �����
		System.out.println(stack.pop());
		System.out.println(stack.peek()); //�� ���� �ִ°� ���������� ������ �ʴ´�
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty()); //����� Ȯ��
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		
				
							
			
			
		}
		

	}

