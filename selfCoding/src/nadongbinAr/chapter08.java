package nadongbinAr;

public class chapter08 {

	public static void main(String[] args) {
		//계수 정렬
		//범위조건이 있는 경우에 한해서 유용하다
		//크기를 기준으로 세는 알고리즘
		//위치를 바꿔줄 필요는 없다.
		//크기의 방에 맞춰서 배열의 데이터를 하나씩 증가 시켜준다. 1몇개 2몇개 3몇개 이런식
		
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
