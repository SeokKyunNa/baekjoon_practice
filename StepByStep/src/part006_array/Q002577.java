package part006_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 숫자의 개수 */
public class Q002577 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[10];
		int mul = 1;
		int temp;
		
		for(int i = 0; i < 3; i++) {
			mul *= Integer.parseInt(br.readLine());
		}
		
		while(mul > 0) {
			temp = mul % 10;
			mul = mul / 10;
			num[temp]++;
		}
		
		for(int c : num) {
			System.out.println(c);
		}
	}

}
