package com.array;

import java.util.Arrays;

class MinMaxofArray2 {

	public static void main(String[] args) {
		int a[] = { 9, 8, 85, 3, 2, 6, 1, 4, 7 };

		Arrays.sort(a);

		System.out.println("Min of array = " + a[0]);
		System.out.println("Max of array = " + a[a.length - 1]);
		System.out.println("Sum of array = " + a[0] + a[a.length - 1]);

	}

}
