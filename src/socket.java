import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class socket {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket s = null;
		@SuppressWarnings("unused")
		Socket s1;
		@SuppressWarnings("unused")
		Scanner scan = new Scanner(System.in);
		
		try {
			s = new ServerSocket(5432);
		} catch (IOException e) {}
		while (true) {
			try {
				s1 = s.accept();
				
			} catch (IOException e) {}
		}
	}

}
