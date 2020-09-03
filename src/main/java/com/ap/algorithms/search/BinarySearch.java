package com.ap.algorithms.search;

public class BinarySearch {
	
	public static void binarySearch(int arr[], int left, int right, int numberToBeSearched) {
		int mid = (left + right)/2;
		if(left < right || arr[mid] == numberToBeSearched) {
			if(arr[mid] == numberToBeSearched) {
				System.out.println(numberToBeSearched + " found at position: " + mid);
				return;
			}
				
			if(numberToBeSearched > arr[mid]) {
				binarySearch(arr, mid+1, right, numberToBeSearched);
			} else {
				binarySearch(arr, left, mid-1, numberToBeSearched);
			}
		}
	}

	public static void main(String ...args) {
		int arr[] = {10,20,30,40,50,60};
		binarySearch(arr, 0, arr.length-1, 60);
		binarySearch(arr, 0, arr.length-1, 10);
		binarySearch(arr, 0, arr.length-1, 40);
		binarySearch(arr, 0, arr.length-1, 45);
	}
}
