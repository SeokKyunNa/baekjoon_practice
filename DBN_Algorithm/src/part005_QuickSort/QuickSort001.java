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

	public static int partition(int[] array, int low, int high) {

		int pivot = array[(low + high) / 2];

		while (low < high) {
			while ((array[low] < pivot) && (low < high))
				low++;
			while ((array[high] > pivot) && (low < high))
				high--;

			if (low < high) {
				int temp = array[low];
				array[low] = array[high];
				array[high] = temp;
			}
		}

		return low;
	}

	public static void quickSort(int arr[], int low, int high) {

		if (low < high) {
			int pivotNewIndex = partition(arr, low, high);

			quickSort(arr, low, pivotNewIndex - 1);
			quickSort(arr, pivotNewIndex + 1, high);
		}

	}

}

