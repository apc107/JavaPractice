// Java assignment p122 find max & min in 4 integers
// #08 Michael Y. C. SHih @ Java Programming Class, EEC, UCH

public class p122_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		
		if (a > b && a > c && a > d)
			System.out.println("Max: " + a);
		else if (b > a && b > c && b > d)
			System.out.println("Max: " + b);
		else if (c > a && c > b && c > d)
			System.out.println("Max: " + c);
		else
			System.out.println("Max: " + d);
		
		if (a < b && a < c && a < d)
			System.out.println("Min: " + a);
		else if (b < a && b < c && b < d)
			System.out.println("Min: " + b);
		else if (c < a && c < b && c < d)
			System.out.println("Min: " + c);
		else
			System.out.println("Min: " + d);
	}

}