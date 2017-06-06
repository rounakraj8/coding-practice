package string.subsequence;

/**
 * Number of subsequences of the form a^i b^j c^k
 * 
 * Given a string, count number of subsequences of the form a^ib^jc^k, i.e., it
 * consists of i ’a’ characters, followed by j ’b’ characters, followed by k ’c’
 * characters where i >= 1, j >=1 and k >= 1.
 * 
 * Note: Two subsequences are considered different if the set of array indexes
 * picked for the 2 subsequences are different.
 *
 * 
 * Expected Time Complexity : O(n)
 * 
 * @author rounak
 *
 */

public class NumberOfSubsequence {

	public static void main(String[] args) {

		System.out.println("abbc: " + countSubsequence("abbc"));

		System.out.println("abcabc: " + countSubsequence("abcabc"));
	}

	public static int countSubsequence(String str) {

		int aCount = 0;
		int bCount = 0;
		int cCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a')
				aCount = (1 + 2 * aCount);

			if (str.charAt(i) == 'b')
				bCount = (aCount + 2 * bCount);

			if (str.charAt(i) == 'c')
				cCount = (bCount + 2 * cCount);
		}

		return cCount;
	}

}
