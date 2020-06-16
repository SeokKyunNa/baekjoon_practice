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
		int max = 0, c = 0, overlap = 0;;

		for(int i = 0; i < word.length(); i++) {
			alphabet[word.charAt(i)-'A'] += 1;
		}
		
		for(int i = 0; i < alphabet.length; i++) {
			if(max < alphabet[i]) {
				max = alphabet[i];
				c = i;
			}
		}
		
		for(int i = 0; i < alphabet.length; i++) {
			if(max == alphabet[i]) overlap++;
		}
		
		if(overlap > 1) c = -2;

		System.out.println((char)(c + 'A'));
		
	}

}
