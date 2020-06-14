package part001_io;

import java.util.Scanner;

/* °ö¼À */
public class Q002588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int[] temp = new int[3];
		
		temp[0] = num2 / 100;	// 3
		temp[1] = (num2 - (temp[0] * 100)) / 10;	// 8
		temp[2] = num2 - ((temp[0] * 100) + (temp[1]) * 10); 
		
		System.out.println(num1 * temp[2]);
		System.out.println(num1 * temp[1]);
		System.out.println(num1 * temp[0]);
		System.out.println(num1 * num2);
	}

}
