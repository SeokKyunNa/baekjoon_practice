package part006_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* OXÄûÁî */
public class Q008958 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int score = 0, total = 0;
		char temp;
		
		for(int i = 0; i < n; i++) {
			String ox = br.readLine();
			score = 0;
			total = 0;
			
			while(ox.length() > 0) {
				temp = ox.charAt(ox.length()-1);
				if(temp=='O') {
					score++;
				} else {
					score = 0;
				}
				total += score;
				ox = ox.substring(0, ox.length() - 1);
			}
			sb.append(total).append("\n");
		}
		
		System.out.println(sb);
		
	}

}
