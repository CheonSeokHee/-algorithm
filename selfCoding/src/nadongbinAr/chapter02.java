package nadongbinAr;

public class chapter02 {

	public static void main(String[] args) {
		
		int temp;
		
		int array[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9}; //�������ķ� �غ��� �������ĺ��� ���������� ���� ���� ���� �����ִ°Ͱ� ���ؼ� �ڸ��� �ٲٴ� ������ �����Ͽ� ���� ������
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < 9-i; j++) {
				
				if(array[j] > array[j+1]) {
					
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			
		}
		
		for(int i = 0; i < array.length; i++) {
		
			System.out.print(" " + array[i]);
			
		}

	}

}
