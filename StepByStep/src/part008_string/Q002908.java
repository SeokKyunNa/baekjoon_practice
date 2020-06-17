package part008_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* »ó¼ö */
public class Q002908 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		String n1 = st.nextToken();
		String n2 = st.nextToken();
		
		int result1 = reverseSangsu(n1);
		int result2 = reverseSangsu(n2);
		
		if(result1 > result2) {
			System.out.println(result1);
		} else {
			System.out.println(result2);
		}
		
	}
	
	public static int reverseSangsu(String s) {
		
		int result = 0;
		
		result = Integer.parseInt(s.substring(2, 3) + s.substring(1, 2) + s.substring(0, 1));
		
		return result;
	}

}
