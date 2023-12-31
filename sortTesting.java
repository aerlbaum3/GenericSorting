
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class sortTesting {

	@Test
	void testBubbleSort() {
		
		BubbleSort<Integer> bubbleSort = new BubbleSort<Integer>();
		Integer[] arr = {4,8,3,1,9};
		bubbleSort.performSort(arr);
		
		Integer[] expected = {1,3,4,8,9};
		assertArrayEquals(expected,arr);
		
	}
	
	@Test
	void testSelectSort() {
		SelectionSort<Integer> selectSort = new SelectionSort<Integer>();
		Integer[] arr = {10,8,3,13};
		
		selectSort.performSort(arr);
		Integer[] expected = {3,8,10,13};
		
		assertArrayEquals(expected,arr);
	}
	@Test
	void testSelectSortWithNegatives() {
		SelectionSort<Integer> selectSort = new SelectionSort<Integer>();
		Integer[] arr = {-10,19,-3,5};
		selectSort.performSort(arr);
		
		Integer[] expected = {-10,-3,5,19};
		
		assertArrayEquals(expected,arr);
	}
	@Test
	void testBubbleSortWithNegatives() {
		BubbleSort<Integer> bubbleSort = new BubbleSort<Integer>();
		
		Integer[] arr = {-10,19,-3,5};
		bubbleSort.performSort(arr);
		
		Integer[] expected = {-10,-3,5,19};
		
		assertArrayEquals(expected,arr);
	}
	@Test 
	void testBubbleSortWithComparator() {
		Dress[] bubbleDress = new Dress[4];
		bubbleDress[0] = new Dress(150.00,2,"midi");
		bubbleDress[1] = new Dress(100.00,0,"gown");
		bubbleDress[2] = new Dress(100.00,6,"maxi");
		bubbleDress[3] = new Dress(100.00,4,"maxi");
		
		BubbleSortWithComparator<Dress> bubbleSort = new BubbleSortWithComparator<Dress>(bubbleDress);
		DressSizeCompare compareSize = new DressSizeCompare();
		bubbleSort.performSort(compareSize);
		
		Dress[] expected = new Dress[4];
		expected[0] = new Dress(100.00,0,"gown");
		expected[1] = new Dress(150.00,2,"midi");
		expected[2] = new Dress(100.00,4,"maxi");
		expected[3] = new Dress(100.00,6,"maxi");
		
		assertEquals(Arrays.toString(expected),Arrays.toString(bubbleDress));
		
		
	}

}
