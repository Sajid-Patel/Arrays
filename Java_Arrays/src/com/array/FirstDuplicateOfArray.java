package com.array;

/*
Problem Statement= Print first dublicate number from an Array
 int a[]={11,22,33,22,33}
 O/P= 22
*/
class FirstDuplicateOfArray {

	public static void main(String[] args) {
		int a[] = { 11, 22, 33, 22, 33 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
					return;
				}

			}

		}

	}

}
