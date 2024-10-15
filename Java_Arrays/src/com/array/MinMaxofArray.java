package com.array;

class MinMaxofArray {

	public static void main(String[] args) {
		int a[] = { 9, 8, 85, 3, 2, 6, 1, 4, 7 };
		int min = a[0];
		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];

			}
		}
		System.out.println("Min of Array is : " + min);

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];

			}
		}
		System.out.println("Max of Array is : " + max);

	}

}
