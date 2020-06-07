package part005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* ¼¼ ¼ö */
public class Q010817 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int temp;
		
		if(a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		if(a > c) {
			temp = a;
			a = c;
			c = temp;
		}
		if(b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		
		System.out.println(b);
	}
	
}