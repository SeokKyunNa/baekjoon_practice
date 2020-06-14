package part006_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* Æò±Õ (Á¡¼ö/M*100) */
public class Q001546 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] score;
		int highest = 0;
		int total = 0;
		
		int n = Integer.parseInt(br.readLine());
		score = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			score[i] = Integer.parseInt(st.nextToken());
			if(highest < score[i]) {
				highest = score[i];
			}
			total += score[i];
		}
		
		System.out.println(((total / (double)highest) * 100) / n);
	}

}
