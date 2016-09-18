import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;



public class Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lists.protectedVar = 2;
		// TODO Auto-generated method stub
		char [] alphabets = {'b','a', 'o', 'p', 'e', 'm', 's'};
		ArrayList<String> output = findPalindromes(alphabets, 6);
		//System.out.println(output.toString());
		
		ArrayList<String> output2 = findLongestPalindromes("abooba");
		System.out.println(output2.toString());
	}
	
	private static ArrayList<String> findPalindromes(char[] alphabets, int stringLength) {
		ArrayList<String> palindromes = new ArrayList<String>();
		ArrayList<String> allCombos = findAllCombos(alphabets, stringLength);
		
		for (int i = 0; i < allCombos.size(); i++) {
			if (allCombos.get(i).equals(reverseString(allCombos.get(i)))) {
				palindromes.add(allCombos.get(i));
			}
		}
		return palindromes;
	}
	
	// wrapper for recursion
	private static ArrayList<String> findAllCombos(char set[], int k) {
        int n = set.length;
        ArrayList<String> allCombos = new ArrayList<String>();
        findAllCombosRec(set, "", n, k, allCombos);
        return allCombos;
    }
	
	// The main recursive method to print all possible strings of length k
    private static void findAllCombosRec(
    		char set[],
    		String prefix,
    		int n,
    		int k,
    		ArrayList<String> allCombos) {
         
        // Base case: k is 0, print prefix
        if (k == 0) {
        	allCombos.add(prefix);
            return;
        }
 
        // One by one add all characters from set and call recursively 
        for (int i = 0; i < n; i++) {
             
            // Next character of input added
            String newPrefix = prefix + set[i]; 
             
            // k is decreased, because we have added a new character
            findAllCombosRec(set, newPrefix, n, k - 1, allCombos); 
        }
    }
	
	private static String reverseString(String toReverse) {
		String reversed = "";
		for (int i = 0; i < toReverse.length(); i++) {
			reversed += toReverse.charAt(toReverse.length() - i -1);
		}
		return reversed;
		
	}
	
	public static ArrayList<String> findLongestPalindromes(String s) {
		ArrayList<String> result = new ArrayList<String>();

		if (s.length() == 1) {
			result.add(s);

		}
		for (int i = 1; i < s.length() - 1; i++) {
			int left = i - 1;
			int right = i + 1;
			String currentPalindrome = "";

			if (s.charAt(i) != s.charAt(left)
					&& s.charAt(i) != s.charAt(right)) {
				// odd palindromes
				currentPalindrome += s.charAt(i);
				while (left >= 0 && right < s.length()) {
					if (s.charAt(left) == s.charAt(right)) {
						currentPalindrome += s.charAt(right);
						currentPalindrome = s.charAt(left) + currentPalindrome;
					}
					left--;
					right++;
				}
				result.add(currentPalindrome);
			} else {
				// even palindromes
				while (left >= 0 && right <= s.length()) {
					if (s.charAt(left) == s.charAt(i)) {
						currentPalindrome += s.charAt(left) + s.charAt(i);
					}
					if (s.charAt(right) == s.charAt(i)) {
						currentPalindrome += s.charAt(i) + s.charAt(right);
					}
				}
				left--;
				right++;
				result.add(currentPalindrome);
			}
		}
		return result;

	}

}
