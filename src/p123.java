// Java assignment p123 Snake Eyes
// #08 Michael Y. C. Shih @ Java Programming Class, EEC, UCH

public class p123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diceA, diceB,count = 0;
		
		for (int i = 0; i < 500; i++) {
			diceA = (int)(Math.random() * 6) + 1;
			diceB = (int)(Math.random() * 6) + 1;
			
			if (diceA == 1 && diceB == 1)
				count += 1;
		}
		System.out.println("Snake Eyes = " + count);
	}
}