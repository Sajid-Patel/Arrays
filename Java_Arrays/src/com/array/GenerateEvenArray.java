package com.array;

//Generate Array of  Even  numbers only
class GenerateEvenArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}
		}

		int b[] = new int[count];

		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				b[k] = a[i];
				k++;

			}

		}

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

}
