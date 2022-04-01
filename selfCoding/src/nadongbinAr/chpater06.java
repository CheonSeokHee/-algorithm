package nadongbinAr;

public class chpater06 {

	static int num = 8;
	static int sort[] = new int[8];
	
	public static void main(String[] args) {
		//��������: �ϴ� ������ �ɰ��� ���߿� ��ġ��  O(n log n)
		// 2�� ������ ���� ������ 2 4 8 
		int array[] = {7,6,5,8,3,5,9,1};
		
		mergeSort(array, 0, num-1);
		
		for(int i =0; i < num; i++) {
			System.out.print(array[i]);
			
		}
		
	}
	
	public static void merge(int a[], int m , int middle, int n) {
		
		int i = m;
		int j = middle +1;
		int k = m; //k�� i �� j �� ���ؼ� ���ο� ������ ���鶧 ����
		
		//���� ������� �迭�� �����غ���
		while(i <= middle && j <= n) { // i�� j�� ���� �׻� ���ؼ� �� �������� �־��ֱ�
			if(a[i] <= a[j]) {
				
				sort[k] = a[i];
				i++;
			} else {
				
				sort[k] = a[j];
				j++;
			}
			
			k++;
			
		}
		
		//���� �����͵� ����
		if(i > middle) { // i�� ���� �����ٸ� ���� j������ ��� �־��ֱ�
			for(int t = j; t <= n; t++) {
				sort[k] = a[t];
				
			} 
		}else {
				
				for(int t = i; t < n; t++) {
					sort[k] = a[t];
					
				}
				
			}
			
		//���� ���ĵ� �迭 ����
		for(int t = m; t <= n; t++) {
			a[t] = sort[k];
			
		}
		
		
	}

	public static void mergeSort(int a[], int m, int n) {
		//ũ�Ⱑ 1���� ū ���
		if(m < n) {
			int middle = (m + n) /2; //���߾�
			mergeSort(a, m, middle); // ����
			mergeSort(a, middle+1, n); // ������
			merge(a, m, middle, n); // ���߿� �����ֱ�
		}
		
	}
	
}
