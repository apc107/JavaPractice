// Java assignment p91 Interest
// #08 Michael Y. C. Shih @ Java Programming Class, EEC, UCH

public class p91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance = 100000, interest = 0.015;
		
		for (int i = 0; i < 60; i++)
			balance *= (1 + interest / 12);
		
		System.out.println("Balance = " + balance);
	}

}
