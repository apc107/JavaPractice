// Java Assignment p106 Prime Numbers
// #08 Michael Y. C. Shih @ Java Programming Class, EEC, UCH

import java.util.Scanner;

public class p106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = scan.nextInt();
		scan.close();
		
		System.out.println("Prime numbers from 1 to " + num + " are:");
		
		for (int i = 2;i < num + 1;i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}
		
	}
	static boolean isPrime(int n) {
		if (n == 2) // 2 is the unique even Prime number
			return true;
		else if ( n % 2 == 0) // all multiples of 2 are not Prime
			return false;
		
		for (int i = 3;i * i <= n;i += 2) // check only odd numbers
			if (n % i == 0)
				return false;
		
		return true;
	}
}