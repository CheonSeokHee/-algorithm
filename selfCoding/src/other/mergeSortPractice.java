package other;

public class mergeSortPractice {

	
	private static void mergeSort(int[] arr) {
		
		int[] tmp = new int[arr.length]; //별도의 저장공간
		
		mergeSort(arr, tmp, 0, arr.length-1);
		
	}
	
	private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
		
		if(start < end) {
			
			int mid = (start + end) / 2;
			
			mergeSort(arr, tmp, start, mid);
			mergeSort(arr, tmp, mid +1, end);

			System.out.println("tmp 배열 값: ");
			
			for(int i=0; i<tmp.length; i++) {
				
				System.out.print(" " + tmp[i]);
				
			}
			merge(arr, tmp, start, mid, end);
		}
		
	}
	
	private static void merge(int[]arr, int[] tmp, int start, int end, int mid) {
		
		for(int i = start; i <= end; i++) {
			
			tmp[i] = arr[i];
			
		}
		
			int left = start;
			int right = mid+1;
			int index = start;
		
			while(left <= mid && right <= mid) {
				if(tmp[left] <= tmp[right]) {
					arr[index] = tmp[left];
					left++;
				} else {
					arr[index] = tmp[right];
					right++;
				}				
				
				index++;
			}
			
			for(int i = 0; i <= mid - left; i++) { 
				
				arr[index + i] = tmp[left + i]; // 앞쪾 데이터만 신경 쓰면 된다 뒤쪾은 자동으로 되어있기때문
				
			}
			
			
		}
		
	
	public static void main(String[] args) {
	
		int arr[] = {4, 5, 2, 3, 8, 7, 9, 1, 6, 0};
		
		for(int i= 0; i < arr.length; i++) {
			
			System.out.print(" " + arr[i]);
			
		}
		
		mergeSort(arr);
		
		System.out.println();
		
		for(int i= 0; i < arr.length; i++) {
			
			System.out.print(" " + arr[i]);
			
		}
	}

}
