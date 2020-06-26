package part004_InsertionSort;

/* ���� ���� */
/* �� ���ڸ� ������ ��ġ�� �����ϴ� �˰��� */
/* �տ������� ���ʴ�� �̹� ���ĵ� �迭 �κа� ���Ͽ� ��ġ�� ã�� ������ */

/* �ð� ���⵵ */
/* �ð� ���⵵�� big O ǥ��� (�˰����� ���� Ƚ���� ǥ��) */
/* O(N * N) = O(N^2) */
/* ��, ������ �Ǿ��ִ� �迭�̶�� O(N)�� �ð� ���⵵�� ���� */
/* �ּ� O(N) ~ �ִ� O(N^2) */
public class InsertionSort001 {

	public static void main(String[] args) {

		int i, j, temp;
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int count = 1;	// �ð� ���⵵ Ȯ�ο� ����
		
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
