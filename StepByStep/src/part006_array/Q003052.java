package part006_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ³ª¸ÓÁö */
public class Q003052 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] remainder = new int[42];
		int num = 0;
		
		for(int i = 0; i < 10; i++) {
			remainder[(Integer.parseInt(br.readLine())) % 42]++;
			
		}
		
		for(int c : remainder) {
			if(c > 0) {
				num++;
			}
		}
		
		System.out.println(num);
	}

}
