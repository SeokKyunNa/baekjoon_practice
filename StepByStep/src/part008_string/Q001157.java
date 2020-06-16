package part008_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 단어 공부 */
public class Q001157 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toUpperCase();	// A = 65, a = 97
		int[] alphabet = new int[26];

		for(int i = 0; i < word.length(); i++) {
			System.out.println(alphabet[word.charAt(i)-'A']);
			alphabet[word.charAt(i)-'A'] += 1;
		}
		System.out.println();
		for(int i : alphabet) {
			System.out.println(alphabet[i]);
		}
	}

}
