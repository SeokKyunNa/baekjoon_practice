package part005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* º° Âï±â - 21 */
public class Q010996 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < n; j++) {
			if(n%2 == 0) {
				for(int i = 0; i < n; i++) {
					sb.append("* ");
					if(i == n/2-1) sb.append("\n ");
				}
			} else {
				for(int i = 0; i < n; i++) {
					sb.append("* ");
					if(i == n/2) sb.append("\n ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
