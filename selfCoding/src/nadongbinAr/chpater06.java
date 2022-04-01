package nadongbinAr;

public class chpater06 {

	static int num = 8;
	static int sort[] = new int[8];
	
	public static void main(String[] args) {
		//병합정렬: 일단 반으로 쪼개고 나중에 합치자  O(n log n)
		// 2의 제곱씩 합쳐 나가기 2 4 8 
		int array[] = {7,6,5,8,3,5,9,1};
		
		mergeSort(array, 0, num-1);
		
		for(int i =0; i < num; i++) {
			System.out.print(array[i]);
			
		}
		
	}
	
	public static void merge(int a[], int m , int middle, int n) {
		
		int i = m;
		int j = middle +1;
		int k = m; //k는 i 와 j 를 비교해서 새로운 정렬을 만들때 순서
		
		//작은 순서대로 배열에 삽입해보기
		while(i <= middle && j <= n) { // i와 j의 값을 항상 비교해서 더 작은값을 넣어주기
			if(a[i] <= a[j]) {
				
				sort[k] = a[i];
				i++;
			} else {
				
				sort[k] = a[j];
				j++;
			}
			
			k++;
			
		}
		
		//남은 데이터도 삽입
		if(i > middle) { // i가 먼저 끝났다면 남은 j값들을 모두 넣어주기
			for(int t = j; t <= n; t++) {
				sort[k] = a[t];
				
			} 
		}else {
				
				for(int t = i; t < n; t++) {
					sort[k] = a[t];
					
				}
				
			}
			
		//이제 정렬된 배열 삽입
		for(int t = m; t <= n; t++) {
			a[t] = sort[k];
			
		}
		
		
	}

	public static void mergeSort(int a[], int m, int n) {
		//크기가 1보다 큰 경우
		if(m < n) {
			int middle = (m + n) /2; //정중앙
			mergeSort(a, m, middle); // 왼쪽
			mergeSort(a, middle+1, n); // 오른쪽
			merge(a, m, middle, n); // 나중에 합쳐주기
		}
		
	}
	
}
