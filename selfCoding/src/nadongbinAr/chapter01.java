package nadongbinAr;

public class chapter01 {
	
	
	public static void main(String[] args) {
		
		int  min, index = 0, temp;
		
		int array[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9}; //�������ķ� Ǯ���
		
		for(int i = 0; i < array.length; i++) { //array���̸�ŭ ���Ƽ�
			
			min = 9999; //min�� ���� �ȿ� ���� ���� �ִ밪���� ������
			
			for(int j = i; j < array.length; j++ ) { //i�� 0�϶��ϱ� j == i 
				
				if(min > array [j]) { // 9999 > 1
					
					min = array[j]; // min == 1
					index = j; //index == 0
					
				} 
									
			}
			
			temp = array[i]; //temp == 1
			array[i] = array[index]; // 
			array[index] = temp;
			
		}
		for(int i = 0; i < array.length; i++) {
			System.out.print(" "+array[i]);
			
		}
		
	}

}
