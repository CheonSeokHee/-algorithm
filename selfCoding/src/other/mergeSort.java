package other;

public class mergeSort {

	private static void mergeSort(int[] arr) {
		
		int[] tmp = new int[arr.length]; // �迭�� ũ�⸸ŭ �ӽ� ����� �����
		mergeSort(arr, tmp, 0, arr.length-1); // �������� ��� ȣ�� �����ϱ�
	}
	private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
		
		if(start < end) { //���� �ε����� �� �ε������� �������� ==> �迭�� 1�� �̻�
			
			int mid = (start + end) / 2; //�Ǻ����̶� ��¦ �ٸ�
			
			mergeSort(arr, tmp, start, mid); // ���� ��Ʈ
			mergeSort(arr, tmp, mid+1, end); // ������ ��Ʈ
			merge(arr, tmp, start, mid, end); // ���������� ����
		}
	}
	
	private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		
		for(int i = start; i <= end; i++) {
			
			tmp[i] = arr[i];
			
		}
		
		int part1 = start; //ù��° �濡 ù��° �ε���
		int part2 = mid + 1; // �ι�° �濡 ù��° �ε���
		int index = start; //���� �������
		
		while(part1 <= mid && part2 <= end ) { //���� ���� ������ �������
			
			if(tmp[part1] <= tmp[part2]) {
				
				arr[index] = tmp[part1];
				part1 ++;
			} else {
				arr[index] = tmp[part2];
				part2 ++;
			}
			
			index ++;
		}
		
		for(int i = 0; i <= mid - part1; i++) { 
			
			arr[index + i] = tmp[part1 + i]; // �զU �����͸� �Ű� ���� �ȴ� �ڦU�� �ڵ����� �Ǿ��ֱ⶧��
			
		}
		
	}
	public static void main(String[] args) {
		//������Ʈ�� �ӽ��� ��������� �ʿ��ϴ�. �׷��Ƿ� �޸� ������ ����Ʈ�� �����ؾ��� �ʿ䰡 ����
		
		//int arr[] = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};
		int arr[] = {4, 5, 2, 3, 8, 7, 9, 1, 6, 0};
		for(int i : arr) {
			
			System.out.print(" " + arr[i]);
			
		}
		
		mergeSort(arr);
		
		System.out.println();
		
		for(int i : arr) {
			
			System.out.print(" " + arr[i]);
			
		}
	}

}
