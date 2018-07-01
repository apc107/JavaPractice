import java.awt.*;
public class ButtonTest extends Frame {
	public static void main(String args[]) {
		ButtonTest test=new ButtonTest();  //產生Frame視窗
		test.setLayout(new FlowLayout());
		Button button1=new Button("按鍵1");  //產生按鍵
		button1.setSize(100,100);
		Button button2=new Button("按鍵2");
		button2.setSize(100,100);
		Button button3=new Button("按鍵3");
		button3.setSize(100,100);
		test.add(button1);        //將按鍵放入視窗
		test.add(button2);
		test.add(button3);
		test.setSize(500,500);
		test.setVisible(true);
		//dlg.show();
	}
}