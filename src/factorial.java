import java.util.Scanner;

public class factorial {

	static int factorials (int i) {
		if (i<1)
			return 1;
		else
			return i*factorials(i-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter an integer: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();
		System.out.println(x + "! = " + factorials(x));
	}
}