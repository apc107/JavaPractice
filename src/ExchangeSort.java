/* 
 * Assignment 02 due date 31/5/2018
 * Q: Sorting & searching Strings
 * #08 Michael Y. C. Shih @ 107 Android Programming Class, EEC, UCH
 */
public class ExchangeSort {
	
	private static void printArray(String[] StringArray) {
		for (String s:StringArray)
			System.out.print(s + " ");
		System.out.println();
	}
	
	public static void StringExchange(String[] x) {
		String temp;
		for (int i = 0; i < x.length - 1; i++)
			for (int j = i + 1; j < x.length; j++)
				if(x[i].compareToIgnoreCase(x[j]) > 0) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
	}
	
	public static int binarySearch(String[] sortedArray, int left, int right, String key) {
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (sortedArray[mid].compareTo(key) == 0)
				return mid;
			else if (sortedArray[mid].compareTo(key) > 0)
				return binarySearch(sortedArray, left, mid - 1, key);
			return binarySearch(sortedArray, mid + 1, right, key);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] StringArray = {"abcd", " a123", "bca", " b123", "c123", "a321", "0789", " abcc", " accc" };
		String key = " a123";
		printArray(StringArray);
		StringExchange(StringArray);
		printArray(StringArray);
		int result = binarySearch(StringArray,0,StringArray.length,key);
		System.out.println((result > -1)?key + " found in " + (result + 1):"Not found!");
	}
}