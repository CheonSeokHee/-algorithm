package nadongbinAr;

public class chpater07 {

	public static void main(String[] args) {
	//�� ���� O(N logN)
	//Ʈ������
	//���� ���� Ʈ�� == �����Ͱ� ���� ������ ���� �ϳ��� ���� ����
	//�� == �ּڰ� �̳� �ִ��� ������ ã�Ƴ��� ���� ���� �� ū ���� �θ� �� ��, ������ ��
	//�� ����(heapify) �˰��� == �ϳ��� ��带 �����ϰ� �ִ����� �����Ǵ� ���� �ϳ��� ��嶧���� �ر� �Ǿ����� �̿�
	//��ü �������� ���ݹ� �������ָ� �ȴ�
	//������ ���� ���� ������ ������ �� �����ϴ°��� �ݺ� �׷��ٸ� ������ ���İ���
		
		int num = 9;
		
		int heap[] = {7, 6, 5, 8, 3, 5, 9, 1, 6};
		
		//���� ��ü Ʈ�� ������ �� ������ �ٲ۴�.
		for(int i = 1; i< num; i++) {
			
			int c = i;
			
			do{
			
				int root = (c-1) / 2; //�ڱ� �ڽ��� �θ���
				
				if(heap[root] < heap[c]) {
					int temp = heap[root];
					heap[root] = heap[c];
					heap[c] = temp;
					
				}
				
				c = root;			
			} while( c != 0);
		}
		
		//ũ�⸦ �ٿ����� �ݺ������� ���� ����
		for(int i = num-1; i >= 0; i--) {
			
			int temp = heap[0]; //���� ū���� �ڷ� ������
			heap[0] = heap[i];
			heap[i] = temp;
			
			int root = 0;
			int c = 1;
			
			do {
				c = 2 * root + 1; //�ڽ� ���
			
				//�ڽ� ����߿� �� ū���� ã��
				if( c < i-1 && heap[c] < heap[c+1]) { //���� �ڽĳ�� ���� �������� Ŭ ��� �׸��� �ڽ� ����� ���� �ڽİ� �� �� �ε��� ���� �������� (c < i-1)
					c++;
					
				}
				
				//��Ʈ���� �ڽ��� �� ũ�ٸ� ��ȯ
				if(c < i && heap[root] < heap[c] ) { //�� �ڽĳ�� �� ū �ڽĳ��� �θ��� �� �� ũ�ٸ� ��ȯ �׸��� �ڽĳ�尡 ��ü ����� ���� ����� �ʱ� ���� (c < i)	
				temp = heap[root];
				heap[root] = heap[c];
				heap[c] = temp;
				}
				
				root = c; // ��������� �� ������ ����±���
				
			}while(c < i);
			
		}
		
		for(int i = 0; i < num; i++) {
			
			System.out.print(" " + heap[i]);
			
		}
	}

}
