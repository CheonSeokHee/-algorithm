package other;

public class quickSort {
	
	private static void quickSort(int[] arr) {
		
		quickSort(arr, 0, arr.length-1); //배열의 시작부터 끝
		
	}
	
	private static void quickSort(int[] arr, int start, int end) {
		
		int part2 = partition(arr, start, end); //해당 배열의 시작과 끝 영역 안에서 구역을 나눈 오른쪽방의 첫번째 값임
		
		if(start < part2 -1) { //오른쪽방의 값이 1개라면 더이상 부르지 않아도 되므로 빼고 정렬
							   //예를들어서 part2의 값이 더 크다면 왼쪽값이 있다는 의미니까 quickSort 메소드로 다시 보내서 정렬하게 한다
			
			quickSort(arr, start, part2-1); // 피봇 기준으로 다시 퀵소크로 보내서 정렬해준다 피봇값에서 하나 전꺼까지
			
		} if(part2 < end) { 	//이건 오른쪽 부분인데 part2부분이 오른쪽 값이니까 
			
			quickSort(arr, part2, end);
			
		}	
	}
	
	private static int partition(int[] arr, int start, int end) {
		
		int pivot = arr[(start + end) / 2]; //피봇값 설정해주기
		
		while(start <= end) {
			
			while(arr[start] < pivot) start ++; //왼쪽 부분 오른쪽으로 옮기기
			while(arr[end] > pivot) end --;		//오른쪽에서 왼쪽으로 오기
			
			if(start <= end) {
				
				swap(arr, start, end);
				
				start ++;
				end --;
			}
		}
		return start;
		
	}
	
	private static void swap(int[] arr, int start, int end) {
		
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	public static void main(String[] args) {
	//퀵 소트를 해줄려면 피봇값을 정해주는것 중앙에서 가까워야 함
		int arr[] = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};
		
		for(int i : arr) {
			
			System.out.print(" " + arr[i]);
			
		}
		
		quickSort(arr);
		
		System.out.println();
		
		for(int i : arr) {
			
			System.out.print(" " + arr[i]);
			
		}
	  	
	}

}
