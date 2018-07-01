/* 
 * Assignment 02 due date 31/5/2018
 * Q: Sorting & searching Strings
 * #08 Michael Y. C. Shih @ 107 Android Programming Class, EEC, UCH
 */
public class InsertionSort {
	private static void printArr(String[] input) {
		for (String str:input)
			System.out.print(str + " ");
		System.out.println();
	}
	private static String[] insertionSort(String[] input) {
		String temp;
		for (int i = 1; i < input.length; i++)
			for (int j = i; j > 0; j--)
				if (input[j].compareTo(input[j - 1]) < 0) {
					temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
				}
		return input;
	}
	private static int binarySearch(String[] input, String key) {
		int left = 0, right = input.length - 1;
		while (left <= right) {
			int middle = (left + right) / 2;
			if (input[middle].equals(key))
				return middle;
			else if (input[middle].compareTo(key) > 0)
				right = middle - 1;
			else
				left = middle + 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sArr = {"abcd", " a123", "bca", " b123", "c123", "a321", "0789", " abcc", " accc" };
		String key = " a123";
		printArr(sArr);
		String[] sorted = insertionSort(sArr);
		printArr(sorted);
		int result = binarySearch(sorted,key);
		System.out.println((result > -1)?key + " found in " + (result + 1):"Not found!");
	}
}