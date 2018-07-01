import java.util.Scanner;

public class P216_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the weight: ");
		Scanner scan = new Scanner(System.in);
		double weight = scan.nextDouble();
		scan.close();
		System.out.println("Total: " + (199+((weight<=5)?weight*50:250+(weight - 5)*30)));
	}
}