package part002_SelectionSort;

/* 선택 정렬 */
/* 가장 작은 수를 맨 앞으로 보내는 알고리즘 */
/* index 기준으로 1~10 비교, 2~10 비교, 3~10 비교, ... , 9~10 비교 */

/* 시간 복잡도 */
/* 10 + 9 + 8 + ... + 1 
 * = 10 * (10 + 1) / 2 = 55 
 * N * (N + 1) / 2 */
/* N이 매우 큰 수라고 가정하고 +1과 /2는 생략함 */
/* 시간 복잡도의 big O 표기법 (알고리즘의 연산 횟수를 표현) */
/* O(N * N) = O(N^2) */
public class SelectionSort001 {

	public static void main(String[] args) {

		int i, j, min, index = 0, temp;
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int count = 1;	// 시간 복잡도 확인용 변수
		
		for(i = 0; i < 10; i++) {
			min = Integer.MAX_VALUE;
			for(j = i; j < 10; j++) {
				System.out.println(count);
				count++;
				if(min > array[j]) {
					min = array[j];
					index = j;
				}
			}
			
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		
		for(i = 0; i < 10; i++) {
			System.out.printf("%d ", array[i]);
		}
	}

}
