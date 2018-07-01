import java.util.Scanner;

public class p65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an integer score: ");
		int score = s.nextInt();
		s.close();
		// int score=Integer.parseInt(args[0]);
		if (score<=40)
			System.out.println(score + " Fail!");
		else if (score>=60)
			System.out.println(score + " Pass!");
		else
			System.out.println(score + " Try again");
	}

}
