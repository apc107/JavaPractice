import java.util.Scanner;

public class p291 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a 4-digit integer: ");
		int number = scan.nextInt();
		scan.close();
		String[][] token = {{"", "one", "two", "three",
				"four", "five", "six", "seven", "eight", "nine"},
				{"ten", "eleven", "twelve", "thirteen", "fourteen",
					"fifteen", "sixteen", "seventeen", "eighteen", "ninteen"},
				{"twenty"},
				{"thirty"},
				{"fourty"},
				{"fifty"},
				{"sixty"},
				{"seventy"},
				{"eighty"},
				{"nighty"},
				{"hundred"},
				{"thousand"}
				};
		int thousands = number / 1000;
		int hundreds = number % 1000 /100;
		int tens = number % 100 / 10;
		int digit = number % 10;
		if (thousands != 0)
			System.out.print(token[0][thousands] + " " + token[11][0]);
		if (hundreds != 0)
			System.out.print(" and " + token[0][hundreds] + " " + token[10][0]);
		if (tens != 0 && tens > 1)
			System.out.print(" and " + token[tens][0] + "-" + token[0][digit]);
		else if (tens != 0 && tens <= 1)
			System.out.print(" and " + token[tens][digit]);
		System.out.println();
	}
}