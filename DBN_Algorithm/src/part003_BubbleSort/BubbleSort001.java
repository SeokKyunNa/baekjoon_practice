package part003_BubbleSort;

/* ���� ���� */
/* ���� �ִ� ���� ���ؼ� �� ���� ���� ������ ������ �˰����� */
/* index �������� 1~9 ��, 1~8 ��, 1~7 ��, ... , 1~2 �� */

/* �ð� ���⵵ */
/* 10 + 9 + 8 + ... + 1 
 * = 10 * (10 + 1) / 2 = 55 
 * N * (N + 1) / 2 */
/* N�� �ſ� ū ����� �����ϰ� +1�� /2�� ������ */
/* �ð� ���⵵�� big O ǥ��� (�˰������� ���� Ƚ���� ǥ��) */
/* O(N * N) = O(N^2) */

/* ���� ���İ� ���� ������ �ð� ���⵵�� O(N^2)�� ����. ������, 
 * ���� ������ �� ����Ŭ�� �� ���� �ڸ� ��ü�� �Ͼ����,
 * ���� ������ �񱳰� �Ͼ ������ �ڸ� ��ü�� �Ͼ�� ������
 * ���� ���� �ð��� ���� ������ �� ���� �ɸ�. */
public class BubbleSort001 {

	public static void main(String[] args) {

		int i, j, temp;
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int count = 1;	// �ð� ���⵵ Ȯ�ο� ����
		
		for(i = 0; i < array.length; i++) {
			for(j = 0; j < array.length-(i+1); j++) {
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