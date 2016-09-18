
public class TwoElementBubbleSort {
	
	
	private static boolean[] sortTrueFalse(boolean [] toSort) {
		int reverseIdx = toSort.length - 1;

		for (int i = 0; i < toSort.length; i++) {
			
			
			if (toSort[i]) {
				boolean temp = toSort[i];
				toSort[i] = toSort[reverseIdx];
				toSort[reverseIdx] = temp;
				reverseIdx--;
			}
			if (reverseIdx < 0) {
				break;
			}
			
			if (toSort[reverseIdx]) {
				reverseIdx--;
			}
			
			for (int j = 0; j < toSort.length; j++) {
				System.out.print(toSort[j] + ", ");
			}
			System.out.println("");

		}
		
		return toSort;
	}
	public static void main(String[] args) {
		
		boolean[] a = {false, true, false, false, true, true, false, true, false};
		boolean[] x = sortTrueFalse(a);
		System.out.println("FINAL resu");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + ", ");
		}

	}

}
