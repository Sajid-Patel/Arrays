package com.array;

class RemoveZero {

	public static void main(String[] args) {
		int a[] = { 1, 2, 0, 5, 0, 8 };
		// Find the count of non zero element

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				count++;
			}
		}

		// Create new Array

		int b[] = new int[count];

		// Itterate the main array,Find the non zero element and add it to new array

		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				b[k] = a[i];
				k++;
			}
		}

		// Print new Array

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println("\n \n");

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
