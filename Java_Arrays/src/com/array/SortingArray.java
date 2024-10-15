package com.array;

class SortingArray {

	public static void main(String[] args) {
		int a[] = { 11, 77, 8, -9, 10 };

		System.out.println("Before sorting");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// Sorting Code
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("After Sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
