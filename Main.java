import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	
	public static void copyArray(Circle[] sourceArray, Circle[] destArray) {
		for (int i = 0; i < sourceArray.length; i++) {
			destArray[i] = sourceArray[i];
		}
	}
	
	public static void copyArray(Dress[] sourceArray, Dress[] destArray) {
		for (int i = 0; i < sourceArray.length; i++) {
			destArray[i] = sourceArray[i];
		}
	}
	
	public static void main(String[] args) {
			final int SIZE = 50;

			SelectionSort<Circle> selectSort = new SelectionSort<>();
			
			Circle[] origArray = new Circle[SIZE]; 
			for (int i = 0; i < origArray.length; i++) {
				origArray[i] = new Circle((int) (Math.random() * 20 + 1));
			}
			Circle[] arraySelect = new Circle[origArray.length]; 
			copyArray(origArray, arraySelect);
			
			
			System.out.println("******Circles With Comparable****");
			System.out.println("                                 ");
			System.out.println("Selection Sort:      ");
			System.out.println("----------------------");
			System.out.println("Original array: " + Arrays.toString(arraySelect) );
		
			selectSort.performSort(arraySelect);
		
			System.out.println("Swaps for Selection Sort: " + selectSort.getSwaps());
			System.out.println("Comparisons for Selection Sort: " + selectSort.getComparisons());
			System.out.println("Sorted array: " + Arrays.toString(arraySelect));

	
		BubbleSort<Circle> bubbleSort = new BubbleSort<>();
		
		Circle[] arrayBubble = new Circle[origArray.length]; 
		copyArray(origArray, arrayBubble);
		System.out.println("                                 ");
		System.out.println("Bubble Sort: ");
		System.out.println("------------------------");
		System.out.println("Original array: " + Arrays.toString(arrayBubble) );

		bubbleSort.performSort(arrayBubble);

		System.out.println("Swaps for Bubble Sort: " + bubbleSort.getSwaps());
		System.out.println("Comparisons for Bubble Sort: " + bubbleSort.getComparisons());
		System.out.println("Sorted array: " + Arrays.toString(arrayBubble));
	
	
		Dress[] dresses = new Dress[5];
		dresses[0] = new Dress(100.99,0,"midi");
		dresses[1] = new Dress(250.00,6,"gown");
		dresses[2] = new Dress(89.59,2,"midi");
		dresses[3] = new Dress(150.45,4,"short");
		dresses[4] = new Dress(67.90,10,"midi");
		
		
		Dress[] selectDress = new Dress[5];
		copyArray(dresses, selectDress);
		
		Dress[] bubbleDress = new Dress[5];
		copyArray(dresses, bubbleDress);
		
		
		SelectionSortWithComparator<Dress> selectWithComparator = new SelectionSortWithComparator<Dress>(selectDress);
		BubbleSortWithComparator<Dress> bubbleWithComparator = new BubbleSortWithComparator<Dress>(bubbleDress);
	
		System.out.println("                                 ");
		System.out.println("********Dresses with Comparator***********");
		System.out.println("Dresses: " + Arrays.toString(dresses));
		
		
		Scanner keyboard = new Scanner(System.in);
//		boolean stillCompare = true;
//		while(stillCompare) {
		System.out.println("Would you like to sort by: "
				+ "\n1.Size"
				+ "\n2.Price"
				+ "\n3.Style"
				+ "(Select a number)");
		
		int choice = keyboard.nextInt();
		
		
		if(choice == 1) {
		DressSizeCompare compareSize = new DressSizeCompare();
		selectWithComparator.performSort(compareSize);
		bubbleWithComparator.performSort(compareSize);
		
		}
		else if(choice == 2) {
			DressPriceCompare comparePrice = new DressPriceCompare();
			selectWithComparator.performSort(comparePrice);
			bubbleWithComparator.performSort(comparePrice);
		}
		else if(choice == 3) {
			DressStyleCompare compareStyle = new DressStyleCompare();
			selectWithComparator.performSort(compareStyle);
			bubbleWithComparator.performSort(compareStyle);
		}
		
		System.out.println("Selection Sort:  ");
		System.out.println("---------------------");
		System.out.println("Original array: " + Arrays.toString(dresses));
		
		
		System.out.println("Swaps for Selection Sort: " + selectWithComparator.getSwaps());
		System.out.println("Comparsions for Selection Sort: " + selectWithComparator.getComparisons());
		System.out.println("Sorted array:  " + Arrays.toString(selectDress));

		System.out.println("                                 ");
		System.out.println("Bubble Sort: ");
		System.out.println("------------------------");
		System.out.println("Original array: " + Arrays.toString(dresses) );
		System.out.println("Swaps for Bubble Sort: " + bubbleWithComparator.getSwaps());
		System.out.println("Comparsions for Bubble Sort: " + bubbleWithComparator.getComparisons());
		System.out.println("Sorted array:  " + Arrays.toString(bubbleDress));

}	
}

