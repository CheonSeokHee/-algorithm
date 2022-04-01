package other;

public class mergeSort {

	private static void mergeSort(int[] arr) {
		
		int[] tmp = new int[arr.length]; // 배열의 크기만큼 임시 저장소 만들기
		mergeSort(arr, tmp, 0, arr.length-1); // 본격적인 재귀 호출 시작하기
	}
	private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
		
		if(start < end) { //시작 인덱스가 끝 인덱스보다 작을때만 ==> 배열이 1개 이상
			
			int mid = (start + end) / 2; //피봇값이랑 살짝 다름
			
			mergeSort(arr, tmp, start, mid); // 왼쪽 파트
			mergeSort(arr, tmp, mid+1, end); // 오른쪽 파트
			merge(arr, tmp, start, mid, end); // 마지막으로 병합
		}
	}
	
	private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		
		for(int i = start; i <= end; i++) {
			
			tmp[i] = arr[i];
			
		}
		
		int part1 = start; //첫번째 방에 첫번째 인덱스
		int part2 = mid + 1; // 두번째 방에 첫번째 인덱스
		int index = start; //다음 저장장소
		
		while(part1 <= mid && part2 <= end ) { //서로 먼저 정렬이 끝난경우
			
			if(tmp[part1] <= tmp[part2]) {
				
				arr[index] = tmp[part1];
				part1 ++;
			} else {
				arr[index] = tmp[part2];
				part2 ++;
			}
			
			index ++;
		}
		
		for(int i = 0; i <= mid - part1; i++) { 
			
			arr[index + i] = tmp[part1 + i]; // 앞쪾 데이터만 신경 쓰면 된다 뒤쪾은 자동으로 되어있기때문
			
		}
		
	}
	public static void main(String[] args) {
		//머지소트는 임시의 저장공간이 필요하다. 그러므로 메모리 부족시 퀵소트로 구현해야할 필요가 있음
		
		//int arr[] = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};
		int arr[] = {4, 5, 2, 3, 8, 7, 9, 1, 6, 0};
		for(int i : arr) {
			
			System.out.print(" " + arr[i]);
			
		}
		
		mergeSort(arr);
		
		System.out.println();
		
		for(int i : arr) {
			
			System.out.print(" " + arr[i]);
			
		}
	}

}
