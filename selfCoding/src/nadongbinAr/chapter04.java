package nadongbinAr;

public class chapter04 {

	static int number = 10; 
	static int data[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
	
	public static void main(String[] args) {
		//퀵정렬은 O(N * logN) 다만 피벗값의 따라 시간복잡도가 달라질 수 있다.
		//피벗 즉 기준이 되는 값을 설정하고 사용 == 분할정복 좌 우로 나누어서 계산하기 때문
		//보통 맨 앞의 값을 피벗값으로 정한다.
		
		quickSort(data, 0, number-1);
		System.out.println("시작");
		show();
		
	}
	
	public static void quickSort(int[] data, int start, int end) { //재귀함수 사용
		
		if(start >= end) { //부분집합의 가장 첫번째 start 가장 뒤 end --> 원소가 1개인 경우
			return;
			
		}
		int key = start; //키는 첫번째 원소
		int i = start + 1; //배열의 왼쪽 출발 지점
		int j = end; //배열의 오른쪽 출발 지점
		int temp;
		
		while( i <= j) { //엇갈릴 때까지 반복 엇갈리면 교체
			
			while(i <= end &&  data[i] < data[key]) { // 키 값보다 큰 값을 만날때 까지
				i++;
				
			} 
			while(data[j] >= data[key] && j > start) {// 키 값보다 작은값을 만날때 까지
				j--;
				
			} 
			if(i > j) { //엇갈리면 여기서 교체해줌
				
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
