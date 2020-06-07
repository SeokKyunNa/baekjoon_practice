package part005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 상근 날드 */
public class Q005543 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int burger = 0, beverage = 0, input = 0;
		for(int i = 0; i < 3; i++) {
			input = Integer.parseInt(br.readLine());
			if(i == 0) burger = input;
			if(burger > input) burger = input;
		}
		
		for(int i = 0; i < 2; i++) {
			input = Integer.parseInt(br.readLine());
			if(i == 0) beverage = input;
			if(beverage > input) beverage = input;
		}
		
		System.out.println(burger + beverage - 50);
	}

}
