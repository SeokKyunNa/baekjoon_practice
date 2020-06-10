package part006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 평균은 넘겠지 */
public class Q004344 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i ++) {
			String[] score = br.readLine().split(" ");
			for(int j = 0; j < Integer.parseInt(score[0]); j++) {
				/*평균 구하고
				 * 평균 넘으면 num++, 아니면 pass;
				 * num/학생수 * 100; */
			}
		}
		
		
		
	}

}
