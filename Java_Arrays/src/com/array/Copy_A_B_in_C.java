package com.array;

import java.util.Arrays;

class Copy_A_B_in_C {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40 };
		int b[] = { 50, 60, 70, 80 };

		int c[] = new int[a.length + b.length];

		System.arraycopy(a, 0, c, 0, a.length);

		System.arraycopy(b, 0, c, a.length, b.length);

		// 1st way to print
		System.out.println(Arrays.toString(c));
		// 2st way to print
		for (int cc : c) {
			System.out.print(cc + " ");
		}

	}

}
