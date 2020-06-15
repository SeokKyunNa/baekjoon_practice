package part008_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q010809 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		br.close();
		
		StringBuilder sb = new StringBuilder();
		int[] alphabet = new int[26];
		Arrays.fill(alphabet, -1);
		
		for(int i = 0; i < S.length(); i++) {
			if(alphabet[S.charAt(i)-'a'] == -1) {
				alphabet[S.charAt(i)-'a'] = i;
			}
		}
		
		for(int i : alphabet) {
			sb.append(i).append(" ");
		}
		System.out.println(sb);
	}

}
