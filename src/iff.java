
public class iff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		
		score=Integer.parseInt(args[0]);
		
		if (score<=40)
			System.out.println("Fail");
		else if (score>=60)
			System.out.println("Pass");
		else
			System.out.println("Try again");
	}

}
