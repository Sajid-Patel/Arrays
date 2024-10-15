package com.array;

class Reverse_Transverse_array {

	public static void main(String[] args) {
		int a[] = { 11, -7, 33, 44, 55 };
		int rev[] = new int[a.length];

		for (int i = a.length - 1, k = 0; i >= 0; i--, k++) {
			rev[k] = a[i];
		}

		System.out.println("Orignal Array : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println("New Array : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(rev[i] + " ");
		}

	}

}
