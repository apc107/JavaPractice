import java.util.Scanner;

public class p305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter 3 integers: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		scan.close();
		if (x > y && x > z)
			System.out.println((x < (y + z) && x > Math.abs(y - z))?((y*y+z*z==x*x)?"It is a RIGHT triangle.":"It could be a triangle."):"It could not be a triangle.");
		else if (y > x && y > z)
			System.out.println((y < (x + z) && y > Math.abs(x - z))?((x*x+z*z==y*y)?"It is a RIGHT triangle.":"It could be a triangle."):"It could not be a triangle.");
		else
			System.out.println((z < (x + y) && z > Math.abs(x - y))?((x*x+y*y==z*z)?"It is a RIGHT triangle.":"It could be a triangle."):"It could not be a triangle.");
	}
}