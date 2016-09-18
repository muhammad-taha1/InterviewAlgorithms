import java.util.ArrayList;



public class Lists {
	
	protected static int protectedVar;
	
	public static void main(String[] args) {
	
		Integer[] x = {1,2,4,5,70,3};
		Object[] reversedX = reverseArray(x);
		System.out.println("Reversed array: ");
		System.out.println(toString(reversedX));
		
		Integer[] y = {30,405,404,0,5};
		Object[] intersections = findIntersection(x, y);
		System.out.println("Intersected array: ");
		System.out.println(toString(intersections));
		
		int[] a = {1,2,4,5,70,3};
		binarySearch(a, 11);
		
		System.out.println("\ndetermine squares result = " + determineSquares(0,10));
	}
	
	// Reverses an array of any object. Use objects of primitive types 
	// to reverse primitive objects
	private static Object[] reverseArray(Object[] toReverse) {
		Object[] reversed = new Object[toReverse.length];
		for (int i = 0; i < toReverse.length; i++) {
			reversed[toReverse.length - i - 1] = toReverse[i];
		}
		return reversed;
	}
	
	// Return a common subset array between two arrays
	private static Object[] findIntersection(Object[] a1, Object[] a2) {
		ArrayList<Object> intersection = new ArrayList<Object>();
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i].equals(a2[j])) {
					intersection.add(a2[j]);
				}
			}
		}
		return intersection.toArray();		
	}
	
	// binary search = divide and conquer
	private static void binarySearch(int[] array, int toSearch) {
		int[] sortedArray = SortingAlgorithms.bubbleSort(array);
		System.out.println("\nAfter sorting the input array: ");
		SortingAlgorithms.printArray(sortedArray);
		int start = 0;
		int end = sortedArray.length - 1;
		while (start <= end) {
			int mid = (start + end)/2;
			if (toSearch == sortedArray[mid]) {
				System.out.printf("Found number %d at index %d of the array", toSearch, mid);
				return;
			} 
			else if (toSearch < sortedArray[mid]) {
				// number is in lower half of sorted list
				end = mid - 1;
			} else {
				// number is in upper half of sorted list
				start = mid + 1;
			}
		}
		System.out.printf("Cannot find %d in the array!", toSearch);
	}
	
	private static int determineSquares(int a, int b) {
		int answer = 0;
		for (int i = a; i <= b; i++) {
			double x = Math.pow(i, 0.5);
			if (x == (int) x) {
				answer++;
			}
		}
		
		return answer;
	}
	
	
	/*
	 *  Note: Auxiliary functions below
	 */
	private static String toString(Object[] x) {
		if (x == null || x.length == 0) {
			return null;
		}
		String arrayInString = "{";
		for (int i = 0; i < x.length; i++) {
			arrayInString += x[i] + ", ";
		}
		arrayInString = arrayInString.substring(0, arrayInString.length() - 2);
		arrayInString += "}";
		return arrayInString;
		
	}
}
