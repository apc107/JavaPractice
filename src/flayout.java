import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import FileDialogApp.WindowEventHandler;

class flayout {
	static int counter=15; //可以改變
	public static void main(String args[]) {
		Button b[]=new Button[counter];   //五個按鍵的參考
		Frame f=new Frame("FlowLayout sample");  //如果不加參數，則Frame沒有標題

		f.setLayout(new FlowLayout());
		for (int i=0;i<counter;i++) {
			String text="button "+Integer.toString(i);
			b[i]=new Button(text);   //產生按鍵物件
			f.add(b[i]);
		}
		f.setLocation(100,100);  //將位置移到(100,100)
		f.setSize(300,300);  //設定大小為300*300
		f.setVisible(true);  //設為可見的


	f.addWindowListener(new WindowEventHandler());
	}
	class WindowEventHandler extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}