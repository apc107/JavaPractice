import java.io.*;

class ReadString {
	public static void main(String args[]) {
		DataInputStream inStr= new DataInputStream(System.in);
		String Str;
		System.out.print("Enter a String: ");
		try {
			Str = inStr.readLine();
			System.out.println("You enterd "+Str);
		} catch (IOException e) {
			System.out.println("Error input");
		}
	}
}