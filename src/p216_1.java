import java.util.Scanner;

public class p216_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the total amount: ");
		Scanner scan = new Scanner(System.in);
		int pay = scan.nextInt();
		scan.close();
		if (pay > 1000)
			pay *= 0.8;
		System.out.println("Please pay " + pay);
	}

}
