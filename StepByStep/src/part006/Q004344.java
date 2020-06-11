package part006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/* 평균은 넘겠지 */
public class Q004344 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int sum = 0, average = 0, count = 0;
		double ratio;
		String ratio_s;
		DecimalFormat df = new DecimalFormat("0.000");
		
		for(int i = 0; i < n; i ++) {
			sum = 0; average = 0; count = 0; ratio = 0;
			String[] score = br.readLine().split(" ");	
			for(int j = 1; j <= Integer.parseInt(score[0]); j++) {
				sum += Integer.parseInt(score[j]);
			}
			
			average = sum / Integer.parseInt(score[0]);
			
			for(int j = 1; j <= Integer.parseInt(score[0]); j++) {
				if(average < Integer.parseInt(score[j])) count++;
			}
			
			ratio = count / (double)Integer.parseInt(score[0]) * 100;
			ratio = Math.round(ratio * 1000) / 1000.0;
			ratio_s = df.format(ratio);

			sb.append(ratio_s + "%").append("\n");
			
		}
		
		System.out.println(sb);
		
	}

}
