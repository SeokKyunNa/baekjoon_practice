package part008_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q011720 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String num = br.readLine();
		br.close();
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += num.charAt(num.length()-1) - '0';
			num = num.substring(0, num.length()-1);
		}
		
		System.out.println(sum);
	}

}
