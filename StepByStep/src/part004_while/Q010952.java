package part004_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* A+B */
public class Q010952 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a, b;
		
		while(1==1) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if(a==0 && b==0) {
				break;
			}
			
			sb.append(a+b).append("\n");
		}
		
		System.out.println(sb);
		
	}
}
