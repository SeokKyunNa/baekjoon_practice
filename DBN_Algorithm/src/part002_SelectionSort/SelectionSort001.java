package part002_SelectionSort;

/* ���� ���� */
/* ���� ���� ���� �� ������ ������ �˰��� */

/* �ð� ���⵵ */
/* 10 + 9 + 8 + ... + 1 
 * = 10 * (10 + 1) / 2 = 55 
 * N * (N + 1) / 2 */
/* N�� �ſ� ū ����� �����ϰ� +1�� /2�� ������ */
/* �ð� ���⵵�� big O ǥ��� (�˰����� ���� Ƚ���� ǥ��) */
/* O(N * N) = O(N^2) */
public class SelectionSort001 {

	public static void main(String[] args) {

		int i, j, min, index = 0, temp;
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		for(i = 0; i < 10; i++) {
			min = Integer.MAX_VALUE;
			for(j = i; j < 10; j++) {
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
