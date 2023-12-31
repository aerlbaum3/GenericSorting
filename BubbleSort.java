
public class BubbleSort<T extends Comparable<T>> {
	
	private int comparisons = 0;//for the performance race
	private int swaps = 0;
	

	public void performSort(T[] array) {
		int n = array.length;
		
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - 1 - i; j++) {
				comparisons++; // increment the comparison by one each time loop this array
				//compare the indexes
				if (array[j].compareTo(array[j + 1]) > 0) {   //swap needed			
					swaps++;
					T tempArray = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tempArray;
				}
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
