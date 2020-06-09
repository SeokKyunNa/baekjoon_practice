package part006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ÃÖ´ñ°ª */
public class Q002562 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int max = 0;
		int num;
		
		for(int i = 0; i < 9; i++) {
			num = Integer.parseInt(br.readLine());
			if(max < num) {
				max = num;
				if(sb.length() > 0) {
					sb.setLength(0);
				}
				sb.append(max).append("\n").append(i+1);
			}
		}
		
		System.out.println(sb);
		br.close();
	}

}
