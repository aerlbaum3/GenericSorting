import java.util.Arrays;
import java.util.Comparator;

public class Main {

	
	public static void copyArray(Integer[] sourceArray, Integer[] destArray) {
		for (int i = 0; i < sourceArray.length; i++) {
			destArray[i] = sourceArray[i];
		}
	}
	
	public static void copyArray(Circle[] sourceArray, Circle[] destArray) {
		for (int i = 0; i < sourceArray.length; i++) {
			destArray[i] = sourceArray[i];
		}
	}
	
	public static void main(String[] args) {
			final int SIZE = 50;
//			SelectionSort<Integer> selectSort = new SelectionSort<>();
//		
//			Integer[] origArray = new Integer[SIZE]; 
//			for (int i = 0; i < origArray.length; i++) {
//				origArray[i] = (int) (Math.random() * 500 + 1);
//			}
//			Integer[] arraySelect = new Integer[origArray.length]; 
//			copyArray(origArray, arraySelect);
//			
//
//			System.out.println("Original array: " + Arrays.toString(arraySelect) );
//		
//			selectSort.performSort(arraySelect);
//		
//			System.out.println("Swaps for Selection Sort: " + selectSort.getSwaps());
//			System.out.println("Comparisons for Selection Sort: " + selectSort.getComparisons());
//			System.out.println("Sorted array: " + Arrays.toString(arraySelect));
//		
//		
//			BubbleSort<Integer> bubbleSort = new BubbleSort<>();
//			String[] array2 = {"Hello" , "GoodBye" ,"See you later"};
//			
//			Integer[] arrayBubble = new Integer[origArray.length]; 
//			copyArray(origArray, arrayBubble);
//			System.out.println("Original array: " + Arrays.toString(arrayBubble));
//			
//
//			bubbleSort.performSort(arrayBubble);
//			
//			System.out.println("Swaps for bubble Sort: " + bubbleSort.getSwaps());
//			System.out.println("Comparisons for Bubble Sort: " + bubbleSort.getComparisons());
//			System.out.println("Sorted array: " + Arrays.toString(arrayBubble));
//		
//		
//			if(selectSort.getComparisons()< bubbleSort.getComparisons()) {
//				System.out.println("The Selection Sort is more efficient");
//			} else {
//				System.out.println("The Bubble Sort is more efficient");
//			}
			
			
//		Comparator<String> lengthComparator = Comparator.comparing(String::length); //creating a comparator which compares the length of a string
//		
//		BubbleSortWithComparator<String> stringBubbleSort = new BubbleSortWithComparator<>(new String[] {"apple", "banana" , "pear", "cucumber"},lengthComparator);
//		
//		stringBubbleSort.performSort();
//		String[] sortedArray = stringBubbleSort.getArray();
//		System.out.println("Sorted array: " + Arrays.toString(sortedArray));
//		
			SelectionSort<Circle> selectSort = new SelectionSort<>();
			
			Circle[] origArray = new Circle[SIZE]; 
			for (int i = 0; i < origArray.length; i++) {
				origArray[i] = new Circle((int) (Math.random() * 20 + 1));
			}
			Circle[] arraySelect = new Circle[origArray.length]; 
			copyArray(origArray, arraySelect);
			

			System.out.println("Original array: " + Arrays.toString(arraySelect) );
		
			selectSort.performSort(arraySelect);
		
			System.out.println("Swaps for Selection Sort: " + selectSort.getSwaps());
			System.out.println("Comparisons for Selection Sort: " + selectSort.getComparisons());
			System.out.println("Sorted array: " + Arrays.toString(arraySelect));

	
		BubbleSort<Circle> bubbleSort = new BubbleSort<>();
		
		Circle[] arrayBubble = new Circle[origArray.length]; 
		copyArray(origArray, arrayBubble);
	

		System.out.println("Original array: " + Arrays.toString(arrayBubble) );

		bubbleSort.performSort(arrayBubble);

		System.out.println("Swaps for Bubble Sort: " + bubbleSort.getSwaps());
		System.out.println("Comparisons for Bubble Sort: " + bubbleSort.getComparisons());
		System.out.println("Sorted array: " + Arrays.toString(arrayBubble));
	}

	
}

