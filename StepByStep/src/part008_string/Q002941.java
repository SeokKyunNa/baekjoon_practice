package part008_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 크로아티아 알파벳 */
public class Q002941 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] calphabet = br.readLine().toCharArray();
		int count = 0;
		
		for(int i = 0; i < calphabet.length; i++) {
			count++;
			if(calphabet[i]=='c') {
				if(i+1<calphabet.length && (calphabet[i+1]=='=' || calphabet[i+1]=='-')) {
					i++;
				}
			} else if(calphabet[i]=='d') {
				if(i+2<calphabet.length && calphabet[i+1]=='z' && calphabet[i+2]=='=') {
					i+=2;
				} else if(i+1<=calphabet.length && calphabet[i+1]=='-') {
					i++;
				}
			} else if(calphabet[i]=='l') {
				if(i+1<calphabet.length && calphabet[i+1]=='j') {
					i++;
				}
			} else if(calphabet[i]=='n') {
				if(i+1<calphabet.length && calphabet[i+1]=='j') {
					i++;
				}
			} else if(calphabet[i]=='s' || calphabet[i]=='z') {
				if(i+1<calphabet.length && calphabet[i+1]=='=') {
					i++;
				}
			}
		}
		
		System.out.println(count);
	}

}
