package Lab_Programs;

import java.util.Scanner;

public class lab9_2 {

	public static void printArray(int[] a) {
		for (int d : a) {
			System.out.print(a[d] + " ");
		}
	}
	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length; i++) {
		double currentMin = list[i];
		int currentMinIndex = i;
		for (int j = i + 1; j < list.length; j++) {
		if (currentMin > list[j]) {
		currentMin = list[j];
		currentMinIndex = j;
		}
		}
		if (currentMinIndex != i) {
		list[currentMinIndex] = list[i];
		list[i] = (int) currentMin;
		}
		}
		}
	public static int linearSearch(int[] arr, int key) {
		
		for (int i = 0; i < arr.length;i++){
			if (arr[i]==key){
				return i;
			}
		}
		return -1;

	}
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -1 - low;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[100000];
		int key = 55;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		
		//Linear Search
		long startTime = System.currentTimeMillis();
		linearSearch(arr, key);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("linear search time: "+executionTime);

		//Binary Search	
		long startTime2 = System.currentTimeMillis();
		selectionSort(arr);
		binarySearch(arr, key);
		long endTime2 = System.currentTimeMillis();
		long executionTime2 = endTime2 - startTime2;
		System.out.println("binary search time: " + executionTime2);
		
	}
}
