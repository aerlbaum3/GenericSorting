import java.util.Comparator;

public class BubbleSortWithComparator<T> {
	
	private T[] arr;
	private Comparator<T> customComparator;
	private int comparisons = 0;
	private int swaps = 0;
	
	public BubbleSortWithComparator(T[] arr) {
		this.arr = arr;
	}
	public void performSort(Comparator<T> customComparator) {
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i ++) {
			for(int j = 0; j < n - 1 - i; j++) {
				comparisons++; // increment the comparison by one each time loop this array
				//compare the indexes
				if(customComparator.compare(arr[j], arr[j+1]) > 0);
					swaps++;
					T tempArray = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tempArray;
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
