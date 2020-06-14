package part007_function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ÇÑ¼ö */
public class Q001065 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 99;
		
		int n = Integer.parseInt(br.readLine());
		
		if(n < 100) {
			count = n;
		} else {
			for(int i = 100; i <= n; i++) {
				int t = 0, temp = i;
				int[] term = new int[4];
				
				while(temp > 0) {
					term[t] = temp % 10;
					temp = temp / 10;
					t++;
				}
				
				if(i < 1000) {
					if(term[2]-term[1] == term[1]-term[0]) {
						count++;
					}
				} else {
					if(term[3]-term[2] == term[2]-term[1] && term[2]-term[1] == term[1]-term[0]) {
						count++;
					}
				}
			}
		} 
		
		System.out.println(count);
		
	}

}
