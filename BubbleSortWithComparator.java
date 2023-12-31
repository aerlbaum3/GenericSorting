import java.util.Comparator;

public class BubbleSortWithComparator<T> {
	
	private T[] arr;
	private Comparator<? super T> customComparator;
	private int comparisons = 0;

	public BubbleSortWithComparator(T[] arr, Comparator<? super T> customComparator) {
		this.arr = arr;
		this.customComparator = customComparator;
	}
	public void performSort() {
		int n = arr.length;
		
		for(int i = 0; i < n - i; i ++) {
			for(int j = 0; j < n - i - 1; j++) {
				comparisons++; // increment the comparison by one each time loop this array
				//compare the indexes
				if(customComparator.compare(arr[j], arr[j+1]) > 0);
					
					T tempArray = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tempArray;
				}
			}
		}

	public T[] getArray() {
		return arr;
	}
	public int getComparisons() {
		return comparisons;
	}
}
