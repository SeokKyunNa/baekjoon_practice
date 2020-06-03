package part002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q002884 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if(h == 0) {
			if(m >= 45) {
				m = m - 45;
			} else {
				h = 23;
				m = 60 - (45 - m); // 13 - 45 -> 남은 32를 60분에서 뺌60 - 32
			}
		} else {
			if(m >= 45) {
				m = m - 45;
			} else {
				h = h - 1;
				m = 60 - (45 - m); // 13 - 45 -> 남은 32를 60분에서 뺌60 - 32
			}
		}
		
		System.out.println(h + " " + m);
	}

}
