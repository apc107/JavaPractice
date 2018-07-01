/* 
 * Assignment 02 due date 31/5/2018
 * Q: Strings sorting and searching
 * #08 Michael Y. C. Shih @ 107 Android Programming Class, EEC, UCH
 */
public class JavaAssignment02 {
	
	public static void bubbleSort(String[] stringArray) {
		int n = stringArray.length;
		String temp;
		for (int i = 0; i < n; i++)
			for (int j = 1; j < (n - i); j++)
				if (stringArray[j - 1].compareTo(stringArray[j]) > 0) {
					temp = stringArray[j - 1];
					stringArray[j - 1] = stringArray[j];
					stringArray[j] = temp;
				}
	}
	
	private static int linearSearch(String[] sortedArray, String key) {
		for (int i = 0; i < sortedArray.length; i++)
			if (sortedArray[i].equals(key))
				return i;
		return -1;
	}
	
	private static void printArray(String[] stringArray) {
		for (String s:stringArray)
			System.out.print("\"" + s + "\"" + ", ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] StringArray = {"abcd", " a123", "bca", " b123", "c123", "a321", "0789", " abcc", " accc" };
		String key = " a123";
		printArray(StringArray);
		bubbleSort(StringArray);
		printArray(StringArray);
		int result = linearSearch(StringArray, key);
		System.out.println(result > -1?"Found: " + (result + 1):"Not found.");
	}
}