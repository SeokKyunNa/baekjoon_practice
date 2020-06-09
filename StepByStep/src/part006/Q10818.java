package part006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 최소, 최대 */
public class Q10818 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, temp;
		
		for(int i = 0; i < n; i++) {
			temp = Integer.parseInt(st.nextToken());
			min = Math.min(temp, min);
			max = Math.max(temp, max);
		}
		
		System.out.println(min + " " + max);
		
	}

}
