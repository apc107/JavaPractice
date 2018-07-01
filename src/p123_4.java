// Assignment 01#05 due date 6/5/2018
// Page 123#04 Snake Eyes
// #08 Michael Y. C. Shih @ 107 Android Programming Class, EEC, UCH

import java.util.Scanner;

public class p123_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("How many times would you like to roll: ");
		int times = scan.nextInt();
		scan.close();
		
		int diceA = 0, diceB = 0, count = 0;
		for (int i = 0;i < times;i++) {
			diceA = roll();
			diceB = roll();
			if (diceA == 1 && diceB == 1)
				count += 1;
		}
		System.out.println("There are totally " + count + " snake eyes over " + times + " rolls");
	}
	static int roll() {
		return (int)(Math.random() * 6) + 1;
	}
}
