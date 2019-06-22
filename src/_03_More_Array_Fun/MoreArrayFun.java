package _03_More_Array_Fun;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		Random r = new Random();
		String[] strings = { "a", "b", "c", "d", "e", "f", "g" };
		// printAllStrings(strings);
		// reversePrintStrings(strings);
		// printEveryOtherString(strings);
		printRandomString(strings);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static void printAllStrings(String[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void reversePrintStrings(String[] a) {
		for (int i = a.length - 1; i > -1; i--) {
			System.out.println(a[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void printEveryOtherString(String[] a) {
		for (int i = 0; i < a.length; i += 2) {
			System.out.println(a[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static void printRandomString(String[] a) {
		shuffleArray(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void shuffleArray(String[] ar) {
		Random rnd = ThreadLocalRandom.current();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			String a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}

}
