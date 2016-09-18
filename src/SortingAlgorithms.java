import java.util.ArrayList;



public class SortingAlgorithms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Test sorting functions here
		int[] x = {57,888,35,23,-88,0,1,86,100,10000};
		int[] a = {3,4,6,78,9,45,3,63,4};
		int[] r1 = bubbleSort(x);
		System.out.println("Result of bubble sorting: ");
		printArray(r1);
		
		x = new int[] {57,888,35,23,-88,0,1,86,100,10000};
		System.out.println("\nResult of selection sort: ");
		printArray(selectionSort(x));
		
		x = new int[] {57,888,35,23,-88,0,1,86,100,10000};	
		
		System.out.println("\nResult of insertion sort: ");
		System.out.println(insertionSort(x));


	}

	// This sort works for ascending
	public static int[] bubbleSort(int[] toSort) {
		boolean swappedOnce = false;
		for (int i = 1; i < toSort.length; i++) {
			// to do sort in descending change > to <
			if (toSort[i - 1] > toSort[i]) {
				swap(toSort, i - 1, i);
				swappedOnce = true;
			}
		}
		if (swappedOnce) {
			// call bubbleSort recursively if swappedOnce is true.
			bubbleSort(toSort);
		}
		// We can conclude that the array is fully sorted only when 
		// it wasn't sorted once
		return toSort;
	}
	
	// This sort works for ascending
	private static int[] selectionSort(int[] toSort) {
		for(int i = 0; i < toSort.length - 1; i++) {
			int minIndex = i;     
			for(int j = i + 1; j < toSort.length; j++) {
				if(toSort[minIndex] > toSort[j]) {
					minIndex = j;
				}
			}
			if(i != minIndex && toSort[i] != toSort[minIndex]) {
				swap(toSort, i, minIndex);
			}
		}
		return toSort;
	}
	
	// sorts in ascending
	private static String insertionSort(int[] toSort) {
		String result = "";
		int toInsert = 0;
		ArrayList<Integer> tempResult = new ArrayList<Integer>();
		for (int i = 0; i < toSort.length; i++) {
			toInsert = toSort[i];
			if (i == 0) {
				tempResult.add(toInsert);
			} else {
				if (toInsert > tempResult.get(i - 1)) {
					tempResult.add(toInsert);
				} else {
					// Shift tempResult to right
					int shiftIndex = i - 1;
					while (shiftIndex > 0 && tempResult.get(shiftIndex - 1) > toInsert) {
						shiftIndex --;
					}
					tempResult.add(shiftIndex, toInsert);
				}
			}
		}
		result = tempResult.toString();
		return result;
	}
	
	
	
	/*
	 * Note: Section below contains useful auxiliary functions,
	 * but not sorting functions
	 */

	// Swap contents of array at i and j.
	private static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;     
	}
	
	// prints an input array
	public static void printArray(int[] array) {
		String toPrint = "{";
		for(int i = 0; i < array.length; i++) {
			toPrint += array[i];
			toPrint += ", ";
		}
		toPrint = toPrint.substring(0, toPrint.length()- 2);
		toPrint += "}";
		System.out.println(toPrint);
	}

}
