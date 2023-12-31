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
	void testBubbleWithCircle() {
		BubbleSort<Circle> bubbleSort = new BubbleSort<>();

		Circle[] origArray = new Circle[5]; 
		origArray[1].setRadius(1);
		origArray[2].setRadius(9);
		origArray[3].setRadius(5);
		origArray[4].setRadius(7);
		origArray[5].setRadius(13);
		
		Integer[] expected = {1,5,7,9,13};
		
		bubbleSort.performSort(origArray);
		
		assertArrayEquals(expected,origArray);
		
	}

}
