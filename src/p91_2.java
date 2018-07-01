// Assignment 01#01 due date 6/5/2018
// Page 91#2 Interests
// #08 Michael Y. C. Shih @ 107 Android Programming Class, EEC, UCH

import java.util.Scanner;

public class p91_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the balance: ");
		double balance = Double.parseDouble(scan.next());
		
		System.out.print("Enter the interest rate: ");
		double interest = Double.parseDouble(scan.next());
		
		System.out.print("Enter the periods: ");
		int period = scan.nextInt();
		
		scan.close();
		
		for (int i=1;i<=period;i++)
			balance = balance * (1 + interest);
		System.out.println("The balance after " + period + " periods will be " + balance);
	}

}
