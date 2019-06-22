package _01_Simple_Array_Algorithms;

import java.util.Arrays;

public class _00_1D_Array_Methods {
	// 1. Complete the method so that it returns the sum of all
	// of the integers in the array being passed in
	public static int sumIntArray(int[] values) {
		return Arrays.stream(values).sum();
	}

	// 2. Complete the method so that it returns the average of all
	// of the integers in the array being passed in
	public static double averageIntArray(int[] values) {
			return Arrays.stream(values).average().orElse(Double.NaN);
	}
	// 3. Complete the method so that it returns true if the integer
	// array contains the value specified by the second parameter.
	// It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {
		boolean result = false;

        for(int i : array){
            if(i == value){
                result = true;
                break;
            }
        }

        return result;
	}

	// 4. Complete the method so that it returns the index of the,
	// first instance that the specified value occurs in the array.
	// If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
        int i = 0; 
        while (i < arr.length) {
            if (arr[i] == value) { 
                return i; 
            } 
            else { 
                i = i + 1; 
            } 
        } 
        return -1; 
    } 
	}
