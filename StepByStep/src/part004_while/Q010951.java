package part004_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* A+B */
public class Q010951 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String tmp;
		int a, b;
		
		while((tmp = br.readLine()) != null) {
			st = new StringTokenizer(tmp, " ");
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			System.out.println(a+b);
			sb.append(a+b).append("\n");
		} 
		
		System.out.println(sb);
	}

}
