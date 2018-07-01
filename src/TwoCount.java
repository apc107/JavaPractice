class TwoCount {
	public static void main(String args[]) {
		int ia[]=new int[10000000];
		int ca[]=new int[10];
		for (int i=0; i<ia.length; i++)
			ia[i]=(int) (Math.random()*100);

		for (int i=0; i<ia.length; i++) {
			int m = ia[i]/10;
			ca[m] = ca[m]+1;
		}

		for (int i=0; i<ca.length; i++)
			System.out.print(ca[i]+"  ");
		System.out.println();
	}
}