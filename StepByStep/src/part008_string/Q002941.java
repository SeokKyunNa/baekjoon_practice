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
			System.out.println(i);
			count++;
			
			if(i+1<calphabet.length) {
				if(calphabet[i]=='c') {
					if(calphabet[i+1]=='=' || calphabet[i+1]=='-') {
						System.out.println("c=c-");
						i++;
					}
				} else if(calphabet[i]=='d') {
					if(i+2<calphabet.length && calphabet[i+1]=='z' && calphabet[i+2]=='=') {
						System.out.println("dz=");
						i+=2;
					} else if(calphabet[i+1]=='-') {
						System.out.println("d-");
						i++;
					}
				} else if(calphabet[i]=='l') {
					if(calphabet[i+1]=='j') {
						System.out.println("lj");
						i++;
					}
				} else if(calphabet[i]=='n') {
					if(calphabet[i+1]=='j') {
						System.out.println("nj");
						i++;
					}
				} else if(calphabet[i]=='s' || calphabet[i]=='z') {
					if(calphabet[i+1]=='=') {
						System.out.println("s=z=");
						i++;
					}
				}
			}
		}
		
		System.out.println(count);
	}

}
