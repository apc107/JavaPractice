// BinarySearch.java
class BinarySearch {
	static final int fail=-1;
	//---資料先排序-----------------
	static int[] sort(int a[]) {
		int temp=0;
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a.length-i-1; j++)
				if (a[j]>a[j+1]) {
					temp=a[j]; //資料互換
					a[j]=a[j+1];
					a[j+1]=temp;
				}
		}
		return a;
	}
	//----搜尋--------------------------
	static int search(int a[],int key) {
		int top=0,bottom=a.length,middle;
		while (top<=bottom) {
			middle=(int)(top+bottom)/2;
			if (a[middle]==key)
				return middle;
			else if (key<a[middle])
				bottom=middle-1;
			else
				top=middle+1;
		}
		return fail;
	}
	//----列印資料-------------------------
	static void print(int[] a) {
		for (int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}

	public static void main(String args[]) {
		int a[]={2,45,34,7,98,100,23,41,86};
		a=sort(a);
		print(a);

		int key = (int) Integer.parseInt(args[0]);
		int result=search(a,key);
		if (result==fail)
			System.out.println("Not found");
		else
			System.out.println("Data is "+a[result]);
	}
}