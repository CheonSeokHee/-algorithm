package nadongbinAr;

public class chapter03 {

	public static void main(String[] args) {
		//����, ���� , ������ �ð� ���⵵ O(N�� ����)
		int temp, j;
		
		int array[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9}; //�������ķ� Ǯ��� �ϳ��� ���ؼ� �������� ���� ���������� ���� ���س���, �������� �����Ѱ� �������� ������ ������ �Ǿ�����
				
		
		for(int i = 0; i < array.length-1; i++) { //1�� ���� �����ϱ� 1���� ���� ������ �����ؾ��� �ȱ׷��� �ε����ٿ�� ����
			
			j = i;
			 
			while(array[j] > array[j+1]) {
				
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				j--; 
			}
		}
		
		for(int i = 0; i < array.length; i++) {
		
			System.out.print(" " + array[i]);
			
		}
		
	}

}
