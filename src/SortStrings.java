
public class SortStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"abcd", " a123", "bca", " b123", "c123", "a321", " abcc", " accc"};
		printStr(str);
		QuickSort(str, 0, str.length - 1);
		printStr(str);
	}
	private static void printStr(String[] sArr) {
		for (String input:sArr)
			System.out.print("\"" + input + "\" ");
		System.out.println();
	}
	private static void QuickSort(String[] iArr, int left, int right) {
		int index = partition(iArr, left, right);
		if (left < index - 1)
			QuickSort(iArr, left, index - 1);
		if (index > right)
			QuickSort(iArr, index, right);
	}
	private static int partition(String[] iArr, int left, int right) {
		int i = left, j = right;
		String tmp;
		String pivot = iArr[(left + right) / 2];
		while (i <= j) {
			while (iArr[i].compareTo(pivot) < 0)
				i++;
			while (iArr[j].compareTo(pivot) > 0)
				j--;
			if (i <= j) {
				tmp = iArr[i];
				iArr[i] = iArr[j];
				iArr[j] = tmp;
				i++;
				j--;
			}
		}
		return i;
	}
}