package nadongbinAr;

import java.util.Stack;

public class chapter09 {

	public static void main(String[] args) {
	//스택
	//Last In First out
	//스택 라이브러리 사용
		
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1); //넣기
		stack.push(2);
		stack.push(3);
		stack.push(4);
	
		System.out.println(stack.pop()); // 맨 마지막에 집어 넣은거 가져오고 지운다
		System.out.println(stack.pop());
		System.out.println(stack.peek()); //맨 위에 있는거 가져오지만 지우지 않는다
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty()); //비었나 확인
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		
				
							
			
			
		}
		

	}

