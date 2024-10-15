package com.array;

/*
 The number should not be at index 0 and last beacuse we cannot compare left and right number
 Maxima= The number which is max campare to its left and right is maxima 
 Minima= The number which is min campare to its left and right is minima 
 */
class Maxima_Minima {

	public static void main(String[] args) {
		int a[] = { 11, 15, 14, 9, 10, 8, 13, 1, 17 };

		for (int i = 1; i < a.length - 1; i++) {

			for (int j = i; j < a.length - 1; j++) {

				if (a[j] > a[i + 1] && a[j] > a[i - 1]) {
					System.out.println("Maxima = " + a[j]);

				}
				break;

			}

			for (int j = i; j < a.length - 1; j++) {

				if (a[j] < a[i + 1] && a[j] < a[i - 1]) {
					System.out.println("Minima = " + a[j]);

				}
				break;
			}

		}

	}

}
