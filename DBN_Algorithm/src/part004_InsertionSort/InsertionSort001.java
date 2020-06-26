package part004_InsertionSort;

/* 삽입 정렬 */
/* 각 숫자를 적절한 위치에 삽입하는 알고리즘 */
/* 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여 위치를 찾고 삽입함 */

/* 시간 복잡도 */
/* 시간 복잡도의 big O 표기법 (알고리즘의 연산 횟수를 표현) */
/* O(N * N) = O(N^2) */
/* 단, 정렬이 되어있는 배열이라면 O(N)의 시간 복잡도를 가짐 */
/* 최소 O(N) ~ 최대 O(N^2) */
public class InsertionSort001 {

	public static void main(String[] args) {

		int i, j, temp;
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int count = 1;	// 시간 복잡도 확인용 변수
		
		for(i = 0; i < array.length-1; i++) {
			j = i;
			while(j >= 0 && array[j] > array[j+1]) {
				System.out.println(count);
				count++;
				
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				j--;
			}
		}
		
		for(i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
	}

}
