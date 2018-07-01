// BubbleSort.java
class BubbleSort {
	static int[] sort(int a[]) {
		int temp=0;
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a.length-i-1; j++)
				if (a[j]>a[j+1]) {
					temp=a[j]; //¸ê®Æ¤¬´«
					a[j]=a[j+1];
					a[j+1]=temp;
				}
		}
	return a;
	}
	
	static void print(int[] a) {
		for (int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}

	public static void main(String args[]) {
		int a[]={2,45,34,7,98,100,23,41,86,30,15,20,3,8,9,23,67};

		System.out.print("Oringle :");print(a);
		a=sort(a);
		System.out.print("Now :");print(a);
	}
}