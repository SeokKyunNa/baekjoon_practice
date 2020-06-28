package part005_QuickSort;

/* 퀵 정렬 */
/* 배열을 비균등하게 분할하여 각각 정렬하고 결과를 모아서 정렬  */
/* 기준값이 되는 값을 피벗(pivot)이라고 함 */
/* 피벗을 기준으로 피벗보다 작은 값들은 피벗의 왼쪽으로, 큰 값들은 피벗의 오른쪽으로 옮겨가며 정렬 */
/* 피벗을 기준으로 피벗보다 작은 왼쪽의 값들을 같은 방식으로 정렬하고 피벗보다 큰 오른쪽의 값들 또한 같은 방식으로 정렬하는 과정을 반복 */

/* 시간 복잡도 */
/* 시간 복잡도의 big O 표기법 (알고리즘의 연산 횟수를 표현) */
/* O(NlogN) */
/* 최소 O(NlogN) ~ 최대 O(N^2) */
public class QuickSort001 {

	public static void main(String[] args) {

		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		quickSort(array, 0, array.length-1);
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
		
	}

	public static void quickSort(int[] data, int start, int end) {
		if(start >= end) {	// 원소가 1개인 경우
			return;
		}
		
		int key = start;	// 키는 첫 번째 원소
		int i = start + 1;	// index의 왼쪽 출발 지점
		int j = end;	// index의 오른쪽 출발 지점
		int temp;
		
		while(i <= j) {	// 엇갈릴 때까지 반복
			while(data[i] <= data[key] && i <= end) {	// 키 값보다 큰 값을 만날 때까지 
				i++;
			}
			
			while(data[j] >= data[key] && j > start) {	// 키 값보다 작은 값을 만날 때까지
				j--;
			}
			
			if(i > j) {	// 현재 엇갈린 상태면 키 값과 교체
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			} else {
				temp = data[j];
				data[j] = data[i];
				data[i] = temp;
			}
		}
		
		quickSort(data ,start, j-1);
		quickSort(data, j+1, end);
	}

}

