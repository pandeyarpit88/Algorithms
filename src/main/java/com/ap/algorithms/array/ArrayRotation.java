package com.ap.algorithms.array;

public class ArrayRotation {

	public static int[] rotateArray(int[] arr, int rotationCount) {
		int tempArr[] = new int[rotationCount];
		int j=0;
		for(int i = 0; i<tempArr.length + rotationCount; i++) {
			if(i<rotationCount) {
				tempArr[i] = arr[i];
			} else if(i<arr.length){
				arr[i-rotationCount] = arr[i];
			} else {
				arr[i-rotationCount] = tempArr[j++];
			}
		}
		for(int num : tempArr)
			System.out.print(num + " ");
		System.out.println();

		for(int num : arr)
			System.out.print(num + " ");
		System.out.println();
		return arr;
	}
	
	public static void main(String... args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arr1= rotateArray(arr, 2);
		for(int num : arr1)
			System.out.print(num + " ");
	}
}
