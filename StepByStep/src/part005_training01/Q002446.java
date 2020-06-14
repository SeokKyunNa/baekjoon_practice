package part005_training01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 별 찍기 - 9 */
public class Q002446 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		// n * 2 - 1 개 출력
		for(int i = n; i > 0; i--) {
			for(int j = 0; j < n-i; j++) {
				sb.append(" ");
			}
			for(int j = i*2-1; j > 0; j--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		for(int i = 2; i <= n; i++) {
			for(int j = n-i; j > 0; j--) {
				sb.append(" ");
			}
			for(int j = i*2-1; j > 0; j--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}

}
