package com.ap.algorithms.search;

public class LinearSearch {

	public static void linearSearch(int arr[], int num) {
		for(int i : arr) {
			if(i == num) {
				System.out.println("number found: " + num);
				return;
			}
		}
		System.out.println("number missing: " + num);
	}
	
	public static void main(String ...args) {
		int arr[] = {10,4,3,9,7,6};
		LinearSearch.linearSearch(arr, 7);
		LinearSearch.linearSearch(arr, 8);
	}
}
