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

	public static void quickSort(int[] data, int start, int end) {
		if(start >= end) {	// ���Ұ� 1���� ���
			return;
		}
		
		int key = start;	// Ű�� ù ��° ����
		int i = start + 1;	// index�� ���� ��� ����
		int j = end;	// index�� ������ ��� ����
		int temp;
		
		while(i <= j) {	// ������ ������ �ݺ�
			while(data[i] <= data[key] && i <= end) {	// Ű ������ ū ���� ���� ������ 
				i++;
			}
			
			while(data[j] >= data[key] && j > start) {	// Ű ������ ���� ���� ���� ������
				j--;
			}
			
			if(i > j) {	// ���� ������ ���¸� Ű ���� ��ü
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

