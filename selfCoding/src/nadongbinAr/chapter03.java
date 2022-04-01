package nadongbinAr;

public class chapter03 {

	public static void main(String[] args) {
		//정렬, 버블 , 삽입은 시간 복잡도 O(N의 제곱)
		int temp, j;
		
		int array[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9}; //삽입정렬로 풀어보기 하나를 정해서 왼쪽으로 갈지 오른쪽으로 갈지 비교해나감, 좋은점은 선택한걸 기준으로 죈쪽은 정렬이 되어있음
				
		
		for(int i = 0; i < array.length-1; i++) { //1은 가장 작으니까 1개를 빼고 정렬을 시작해야함 안그러면 인덱스바운드 오류
			
			j = i;
			 
			while(array[j] > array[j+1]) {
				
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				j--; 
			}
		}
		
		for(int i = 0; i < array.length; i++) {
		
			System.out.print(" " + array[i]);
			
		}
		
	}

}
