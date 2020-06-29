package part005_QuickSort;

/* �� ���� */
/* �迭�� ��յ��ϰ� �����Ͽ� ���� �����ϰ� ����� ��Ƽ� ����  */
/* ���ذ��� �Ǵ� ���� �ǹ�(pivot)�̶�� �� */
/* �ǹ��� �������� �ǹ����� ���� ������ �ǹ��� ��������, ū ������ �ǹ��� ���������� �Űܰ��� ���� */
/* �ǹ��� �������� �ǹ����� ���� ������ ������ ���� ������� �����ϰ� �ǹ����� ū �������� ���� ���� ���� ������� �����ϴ� ������ �ݺ� */

/* �ð� ���⵵ */
/* �ð� ���⵵�� big O ǥ��� (�˰����� ���� Ƚ���� ǥ��) */
/* O(NlogN) */
/* �ּ� O(NlogN) ~ �ִ� O(N^2) */
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

