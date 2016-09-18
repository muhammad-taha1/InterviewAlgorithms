import java.util.ArrayList;


public class HappyNumber {
	static ArrayList<Integer> listOfDigSquares = new ArrayList<Integer>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		determineHappiness(13);
	}
	
	private static void determineHappiness(int x) {
		int number = x;
		while (true) {
			int sum = 0;
			ArrayList<Integer> digits = splitNumberToDigits(number);
			for (int digit : digits) {
				sum += Math.pow(digit, 2);
			}
			number = sum;

			if (listOfDigSquares != null && listOfDigSquares.contains(number)) {
				System.out.println(x + " is not a happy number :(");
				return;
			}

			if(number == 1) {
				System.out.println(x + " is a happy number! ");
				return;
			}
			
			listOfDigSquares.add(number);
		}
	}
	
	private static ArrayList<Integer> splitNumberToDigits(int x) {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		
		while (x >= 10) {
			int dig = x % 10;
			digits.add(dig);
			x = (int) Math.floor(x/10);
		}
		
		digits.add(x);
		return digits;
	}

}
