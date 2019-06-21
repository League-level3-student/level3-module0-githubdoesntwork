package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random r = new Random();
		int smallest;
		int largest;
		//1. make an array of 5 Strings
String[] strings = {"hi", "bye", "guy", "shy", "cry"};
		//2. print the third element in the array
System.out.println(strings[2]);
		//3. set the third element to a different value
strings[2]="die";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < strings.length; i++) {
			strings[i]="why";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		//7. make an array of 50 integers
		int[] integers = new int[50];
		//8. use a for loop to make every value of the integer array a random number
for (int i = 0; i < integers.length; i++) {
	integers[i]=r.nextInt(50);
	}
		//9. without printing the entire array, print only the smallest number on the array
smallest = integers[0];
largest = integers[0];
for (int i = 0; i < integers.length; i++) {
	if(integers[i]<integers[smallest]) {
		smallest = i;
	}
}
System.out.println(integers[smallest]);
		//10 print the entire array to see if step 8 was correct
for (int i = 0; i < integers.length; i++) {
	System.out.println(integers[i]);
}
		//11. print the largest number in the array.
for (int i = 0; i < integers.length; i++) {
	if(integers[i]>integers[largest]) {
		largest = i;
	}
}
System.out.println(integers[largest]);
		//12. print only the last element in the array
		System.out.println(integers[49]);
	}
}
