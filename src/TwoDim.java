class TwoDim {
	public static void main(String args[]) {
		int two[][]=new int[3][4];

		for (int i=0; i<3; i++)
			for (int j=0; j<4; j++)
				two[i][j] = (int)(Math.random()*two.length);

		try {
			for (int i=0; i<3; i++) {
				for ( int j=0; j<4; j++)
					System.out.print(two[i][j]+"  ");
				System.out.println();
			}
		}
		catch  (Exception e) {
			System.out.println(e.toString()); 
			System.out.println(e.getMessage());
		}
	}
}