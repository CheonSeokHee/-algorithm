package nadongbinAr;

public class chapter08 {

	public static void main(String[] args) {
		//��� ����
		//���������� �ִ� ��쿡 ���ؼ� �����ϴ�
		//ũ�⸦ �������� ���� �˰���
		//��ġ�� �ٲ��� �ʿ�� ����.
		//ũ���� �濡 ���缭 �迭�� �����͸� �ϳ��� ���� �����ش�. 1� 2� 3� �̷���
		
		int temp;
		int count[] = new int[5];
		int array[] = {	 1,3,2,4,3,2,5,3,1,2,
						 3,4,4,3,5,1,2,3,5,2,
						 3,1,4,3,5,1,2,1,1,1  };
		
		for(int i = 0; i < count.length; i++) {
			
			count[i] = 0;
			
		}
		for(int i = 0; i < array.length; i++) {
			
			count[array[i] - 1]++;
			
			//System.out.println(" " + count[i]);
			
		}
		for(int i = 0; i < count.length; i++) {
			if(count[i] != 0) {
				
				for(int j = 0; j < count[i]; j++) {
					System.out.print(" " + i);
					
				}
			}
			
		}
 
	}

}
