package com.alien.studying;

import java.util.Arrays;
import java.util.Scanner;

public class SubField {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int m,n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		int[][] sc1 = new int[n][4];
		int[] res = new int[16];
		int index = 0;
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < 4; j++) {
				int sum = 0;
				for (int k = 0; k < m/4; k++) {
					sum += Integer.parseInt(String.valueOf(str.charAt(m/4*j+k)));
				}
				sc1[i][j] = sum;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int sum = 0;
				for (int k = 0; k < n/4; k++) {
					sum += sc1[n/4*j+k][i];
				}
				res[index++] = sum;
			}
		}
		Arrays.sort(res);
		System.out.println(res[0]);
	}
}
