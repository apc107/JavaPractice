//import java.util.Random;
import java.util.Scanner;

public class p91_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low = 0, normal = 0, high = 0;
		//Random rd = new Random();
		//char score = (char)(rd.nextInt('G' - 'A') + 'A');
		
		Scanner scan = new Scanner(System.in);
		System.out.print("How many students are there in the class? ");
		int number = scan.nextInt();
		
		scan.close();
		
		System.out.print("The scores are: ");
		
		for (int i = 0 ; i < number ; i++) {
			char score = (char)(Math.random() * 6 + 'A');
			System.out.print(score + " ");
			switch (score) {
				case 'A':
					;
				case 'B':
					high++;
					break;
				case 'C':
					;
				case 'D':
					normal++;
					break;
				case 'E':
					;
				case 'F':
					low++;
					break;
			}
		}
		System.out.println();
		System.out.println("Low: " + low);
		System.out.println("Normal: " + normal);
		System.out.println("High: " + high);
	}
}