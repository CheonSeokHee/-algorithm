package nadongbinAr;

public class chapter04 {

	static int number = 10; 
	static int data[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
	
	public static void main(String[] args) {
		//�������� O(N * logN) �ٸ� �ǹ����� ���� �ð����⵵�� �޶��� �� �ִ�.
		//�ǹ� �� ������ �Ǵ� ���� �����ϰ� ��� == �������� �� ��� ����� ����ϱ� ����
		//���� �� ���� ���� �ǹ������� ���Ѵ�.
		
		quickSort(data, 0, number-1);
		System.out.println("����");
		show();
		
	}
	
	public static void quickSort(int[] data, int start, int end) { //����Լ� ���
		
		if(start >= end) { //�κ������� ���� ù��° start ���� �� end --> ���Ұ� 1���� ���
			return;
			
		}
		int key = start; //Ű�� ù��° ����
		int i = start + 1; //�迭�� ���� ��� ����
		int j = end; //�迭�� ������ ��� ����
		int temp;
		
		while( i <= j) { //������ ������ �ݺ� �������� ��ü
			
			while(i <= end &&  data[i] < data[key]) { // Ű ������ ū ���� ������ ����
				i++;
				
			} 
			while(data[j] >= data[key] && j > start) {// Ű ������ �������� ������ ����
				j--;
				
			} 
			if(i > j) { //�������� ���⼭ ��ü����
				
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
				
			} else {
				
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
				
			}
			
			
		}
		quickSort(data, start, j-1);
		quickSort(data, j+1, end);
					
	}
	
	public static void show() {
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
			
		}
		
	}
	

}
