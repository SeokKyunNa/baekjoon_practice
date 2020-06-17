package part008_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ´ÙÀÌ¾ó */
public class Q005622 {

	public static void main(String[] args) throws IOException {

		// ABC = 3, DEF = 4, GHI = 5, JKL = 6, MNO = 7, PQRS = 8, TUV = 9, WXYZ = 10
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		br.close();
		
		int total = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if('A' <= c && c < 'D') {
				total += 3;
			} else if('D' <= c && c < 'G') {
				total += 4;
			} else if('G' <= c && c < 'J') {
				total += 5;
			} else if('J' <= c && c < 'M') {
				total += 6;
			} else if('M' <= c && c < 'P') {
				total += 7;
			} else if('P' <= c && c < 'T') {
				total += 8;
			} else if('T' <= c && c < 'W') {
				total += 9;
			} else if('W' <= c && c <= 'Z') {
				total += 10;
			} else if(c == ' '){
				total += 2;
			}
			
		}
		
		System.out.println(total);
	}

}
