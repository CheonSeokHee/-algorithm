package other;

public class quickSort {
	
	private static void quickSort(int[] arr) {
		
		quickSort(arr, 0, arr.length-1); //�迭�� ���ۺ��� ��
		
	}
	
	private static void quickSort(int[] arr, int start, int end) {
		
		int part2 = partition(arr, start, end); //�ش� �迭�� ���۰� �� ���� �ȿ��� ������ ���� �����ʹ��� ù��° ����
		
		if(start < part2 -1) { //�����ʹ��� ���� 1����� ���̻� �θ��� �ʾƵ� �ǹǷ� ���� ����
							   //������ part2�� ���� �� ũ�ٸ� ���ʰ��� �ִٴ� �ǹ̴ϱ� quickSort �޼ҵ�� �ٽ� ������ �����ϰ� �Ѵ�
			
			quickSort(arr, start, part2-1); // �Ǻ� �������� �ٽ� ����ũ�� ������ �������ش� �Ǻ������� �ϳ� ��������
			
		} if(part2 < end) { 	//�̰� ������ �κ��ε� part2�κ��� ������ ���̴ϱ� 
			
			quickSort(arr, part2, end);
			
		}	
	}
	
	private static int partition(int[] arr, int start, int end) {
		
		int pivot = arr[(start + end) / 2]; //�Ǻ��� �������ֱ�
		
		while(start <= end) {
			
			while(arr[start] < pivot) start ++; //���� �κ� ���������� �ű��
			while(arr[end] > pivot) end --;		//�����ʿ��� �������� ����
			
			if(start <= end) {
				
				swap(arr, start, end);
				
				start ++;
				end --;
			}
		}
		return start;
		
	}
	
	private static void swap(int[] arr, int start, int end) {
		
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	public static void main(String[] args) {
	//�� ��Ʈ�� ���ٷ��� �Ǻ����� �����ִ°� �߾ӿ��� ������� ��
		int arr[] = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};
		
		for(int i : arr) {
			
			System.out.print(" " + arr[i]);
			
		}
		
		quickSort(arr);
		
		System.out.println();
		
		for(int i : arr) {
			
			System.out.print(" " + arr[i]);
			
		}
	  	
	}

}
