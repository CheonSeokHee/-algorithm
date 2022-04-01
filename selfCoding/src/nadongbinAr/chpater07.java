package nadongbinAr;

public class chpater07 {

	public static void main(String[] args) {
	//힙 정렬 O(N logN)
	//트리구조
	//완전 이진 트리 == 데어터가 왼쪽 오른쪽 노드로 하나씩 들어가는 구조
	//힙 == 최솟값 이나 최댓값을 빠르게 찾아내기 위한 구조 더 큰 값이 부모가 됨 즉, 상위로 감
	//힙 생성(heapify) 알고리즘 == 하나의 노드를 제외하고 최대힙이 구성되는 상태 하나의 노드때문에 붕괴 되었을때 이용
	//전체 개수에서 절반반 수행해주면 된다
	//맨위의 값을 제일 밑으로 보내고 힙 수행하는것을 반복 그렇다면 하위로 정렬가능
		
		int num = 9;
		
		int heap[] = {7, 6, 5, 8, 3, 5, 9, 1, 6};
		
		//먼저 전체 트리 구조를 힙 구조로 바꾼다.
		for(int i = 1; i< num; i++) {
			
			int c = i;
			
			do{
			
				int root = (c-1) / 2; //자기 자신의 부모노드
				
				if(heap[root] < heap[c]) {
					int temp = heap[root];
					heap[root] = heap[c];
					heap[c] = temp;
					
				}
				
				c = root;			
			} while( c != 0);
		}
		
		//크기를 줄여가며 반복적으로 힙을 구성
		for(int i = num-1; i >= 0; i--) {
			
			int temp = heap[0]; //제일 큰값을 뒤로 보낸다
			heap[0] = heap[i];
			heap[i] = temp;
			
			int root = 0;
			int c = 1;
			
			do {
				c = 2 * root + 1; //자식 노드
			
				//자식 노드중에 더 큰값을 찾기
				if( c < i-1 && heap[c] < heap[c+1]) { //왼쪽 자식노드 보다 오른쪽이 클 경우 그리고 자식 노드의 다음 자식과 비교 시 인덱스 오류 방지위해 (c < i-1)
					c++;
					
				}
				
				//루트보다 자식이 더 크다면 교환
				if(c < i && heap[root] < heap[c] ) { //두 자식노드 중 큰 자식노드와 부모노드 비교 후 크다면 교환 그리고 자식노드가 전체 노드의 수를 벗어나지 않기 위해 (c < i)	
				temp = heap[root];
				heap[root] = heap[c];
				heap[c] = temp;
				}
				
				root = c; // 재귀적으로 힙 구조를 만드는구조
				
			}while(c < i);
			
		}
		
		for(int i = 0; i < num; i++) {
			
			System.out.print(" " + heap[i]);
			
		}
	}

}
