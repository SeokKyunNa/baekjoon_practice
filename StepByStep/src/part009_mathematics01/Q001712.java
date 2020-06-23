package part009_mathematics01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 손익분기점 */
public class Q001712 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int n = 0;
		
		if(b >= c) {
			n = -1;
		} else {
			do {
				n++;
			} while((c * n) - (a + (b * n)) <= 0);
		}
		
		System.out.println(n);

	}

}
