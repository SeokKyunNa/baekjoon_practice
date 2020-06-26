package part003_BubbleSort;

/* 버블 정렬 */
/* 옆에 있는 값과 비교해서 더 작은 값을 앞으로 보내는 알고리즘 */
/* index 기준으로 1~9 비교, 1~8 비교, 1~7 비교, ... , 1~2 비교 */

/* 시간 복잡도 */
/* 10 + 9 + 8 + ... + 1 
 * = 10 * (10 + 1) / 2 = 55 
 * N * (N + 1) / 2 */
/* N이 매우 큰 수라고 가정하고 +1과 /2는 생략함 */
/* 시간 복잡도의 big O 표기법 (알고리즘의 연산 횟수를 표현) */
/* O(N * N) = O(N^2) */

/* 선택 정렬과 버블 정렬의 시간 복잡도는 O(N^2)로 같음. 하지만, 
 * 선택 정렬은 한 싸이클에 한 번의 자리 교체가 일어나지만,
 * 버블 정렬은 비교가 일어날 때마다 자리 교체가 일어나기 때문에
 * 실제 연산 시간은 버블 정렬이 더 오래 걸림. */
public class BubbleSort001 {

	public static void main(String[] args) {

		int i, j, temp;
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int count = 1;	// 시간 복잡도 확인용 변수
		
		for(i = 0; i < 10; i++) {
			for(j = 0; j < 9-i; j++) {
				System.out.println(count);
				count++;
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for(i = 0; i < 10; i++) {
			System.out.printf("%d ", array[i]);
		}
	}

}
