package part008_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 그룹 단어 체커 */
public class Q001316 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			char[] word = br.readLine().toCharArray();
			char[] alphabet = new char[26];
			for(int j = 0; j < word.length; j++) {
				
			}
		}
		
		System.out.println(count);
	}

}
