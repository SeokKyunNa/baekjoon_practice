package part007_function;

/* 정수 N개의 합 */
public class Q015596 {

	public static void main(String[] args) {

	}
	
	public long Test(int[] a) {
		
		long sum = 0;
		
		for(long c : a) {
			sum += c;
		}
		
		return sum;
	}

}
