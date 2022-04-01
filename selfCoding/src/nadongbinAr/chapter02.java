package nadongbinAr;

public class chapter02 {

	public static void main(String[] args) {
		
		int temp;
		
		int array[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9}; //버블정렬로 해보기 선택정렬보다 버블정렬이 느린 이유 당장 옆에있는것과 비교해서 자리를 바꾸는 연산을 수행하여 양이 많아짐
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < 9-i; j++) {
				
				if(array[j] > array[j+1]) {
					
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			
		}
		
		for(int i = 0; i < array.length; i++) {
		
			System.out.print(" " + array[i]);
			
		}

	}

}
