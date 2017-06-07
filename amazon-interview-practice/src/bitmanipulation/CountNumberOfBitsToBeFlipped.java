package bitmanipulation;

/**
 * 
 * @author rounak
 *         http://www.geeksforgeeks.org/count-number-of-bits-to-be-flipped-to-convert-a-to-b/
 * 
 */

/*
 * Question: You are given two numbers A and B. Write a program to count number
 * of bits needed to be flipped to convert A to B.
 * 
 */

/*
 * Solution:
 * 
 * 1. Calculate XOR of A and B. a_xor_b = A ^ B
 * 
 * 2. Count the set bits in the above calculated XOR result.
 * countSetBits(a_xor_b)
 * 
 */

/*
 * Example:
 * 
 * A = 1001001 B = 0010101 a_xor_b = 1011100 No of bits need to flipped = set
 * bit count in a_xor_b i.e. 4
 */

public class CountNumberOfBitsToBeFlipped {

	public static void main(String[] args) {

		int a = 10;
		int b = 16;

		int XOR = a ^ b;

		// Using bitCount method present in this class
		System.out.println("Simple Division:\t" + bitCount(XOR));

		// Using bitCount method of Integer class
		System.out.println("Method Integer Class:\t" + Integer.bitCount(XOR));

		System.out.println("Bitwise 'AND' Operator:\t" + bitCountAndOperation(XOR));

		System.out.println("Brian Kernighan Algo:\t" + bitCountBrianKernighanAlgo(XOR));

	}

	public static int bitCount(int n) {
		int count = 0;

		while (n != 0) {
			if (n % 2 == 1)
				count++;
			n /= 2;
		}
		return count;
	}

	/*
	 * Using Bitwise AND Operation
	 * 
	 * Time Complexity: Theta(log n)
	 * 
	 * Space Complexity: O(1)
	 */

	public static int bitCountAndOperation(int n) {

		int count = 0;

		while (n > 0) {
			count += n & 1;
			n >>= 1;
		}
		return count;
	}

	/*
	 * Brian Kernighan Algorithm
	 * 
	 * Time Complexity: O(log n)
	 * 
	 * Space Complexity: O(1)
	 */

	public static int bitCountBrianKernighanAlgo(int n) {

		int count = 0;

		while (n > 0) {
			n &= (n - 1);
			count++;
		}
		return count;
	}

}
