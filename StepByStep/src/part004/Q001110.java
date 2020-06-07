package part004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 더하기 사이클 */
public class Q001110 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int n = Integer.parseInt(br.readLine());
		int a, b, temp, cycle = 0, result = 0;

		do {
			if(cycle==0) result = n;
			a = result / 10;
			b = result % 10;
			temp = a + b;
			result = (b * 10) + (temp % 10);
			cycle++;
		} while(n != result);
		System.out.println(cycle);
	}

}