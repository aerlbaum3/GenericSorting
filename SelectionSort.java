import java.util.Comparator;

public class SelectionSort<T extends Comparable<T>> {
	
	
	private int comparisons = 0; //for the performance race
	private int swaps = 0;
	
	
	public void performSort(T[] arr) {
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i++) {
			
			//start off with the currIndex being the minimum
			int minIndex = i;
			
			//go through rest of array and switch the minIndex with any other thats smaller
			
			for(int j = i + 1; j < n; j++) {
				comparisons++; //each time loop through add one to the comparison
				if(arr[j].compareTo(arr[minIndex]) < 0) {
					minIndex = j;
				}
			}
			//swap the found minimum element
			if (i != minIndex) {
				swaps++;
				T temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	public int getComparisons() {
		return comparisons;
	}
	public int getSwaps() {
		return swaps;
	}
	
	
	
	
}
