package nadongbinAr;

import java.util.LinkedList;
import java.util.Queue;

public class chpater10 {

	public static void main(String[] args) {
		//ť
		//First In First out
		
		Queue<Integer> q = new LinkedList();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());


		
		
		
		

	}

}
