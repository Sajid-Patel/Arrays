package com.array;

/*
 Problem Statement= 
 Print Transpose Array of Matrix given 2D matrix array
 int a[] []={ {1,2,3},
              {4,5,6},
              {7,8,9}   };
              
              O/P= 1 4 7
                   2 5 8
                   3 6 9
 
 
 */
class TransposeArray {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.print(a[0][0] + " " + a[1][0] + " " + a[2][0]);
		System.out.print("\n" + a[0][1] + " " + a[1][1] + " " + a[2][1]);
		System.out.print("\n" + a[0][2] + " " + a[1][2] + " " + a[2][2]);

		System.out.println("\n \n \n");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
	}

}
