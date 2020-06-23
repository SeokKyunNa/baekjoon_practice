package part008_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 그룹 단어 체커 */
public class Q001316 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = n;
		
		for(int i = 0; i < n; i++) {
			char[] word = br.readLine().toCharArray();
			boolean[] alphabet = new boolean[26];
			
			for(int j = 1; j < word.length; j++) {
				if(word[j-1] != word[j]) {
					if(alphabet[word[j]-'a'] == true) {
						count--;
						break;
					}
					alphabet[word[j-1]-'a'] = true;
				}
			}
		}
		
		System.out.println(count);
	}

}
