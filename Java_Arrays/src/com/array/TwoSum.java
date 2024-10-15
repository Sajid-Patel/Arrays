package com.array;
/*
 Problem Statement=
 Given an array of integers nums and an integer target, 
 return indices of the two numbers such that they add up to target
 
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

class TwoSum {

	// Brute Force Approach
	public int[] twoSum(int[] nums, int target) {

		// Iterate over the numbers in the array.
		for (int i = 0; i < nums.length; i++) {
			// For each number, iterate over the rest of the numbers in the array.
			for (int j = i + 1; j < nums.length; j++) {
				// Check if the current two numbers add up to the target.
				if (nums[i] + nums[j] == target) {
					// If they do, return their indices.
					return new int[] { i, j };
				}
			}
		}
		// If no two numbers sum up to the target, return null.
		return new int[] {};
	}

	public static void main(String[] args) {

		TwoSum ts = new TwoSum();

		int[] nums = { 2, 7, 11, 13 };
		int target = 18;

		int[] result = ts.twoSum(nums, target);

		// Print the result
		if (result.length == 0) {
			System.out.println("No solution found.");
		} else {
			System.out.println("Indices: " + result[0] + " " + result[1]);
		}
	}

}
