package part008_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q002675 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			char[] c = st.nextToken().toCharArray();	// {A0, B1, C2}
			
			for(int j = 0; j < c.length; j++) {
				for(int k = 0; k < R; k++) {
					sb.append(c[j]);
				}
			}
			sb.append("\n");
		}
		
		br.close();
		System.out.println(sb);
		
	}

}
