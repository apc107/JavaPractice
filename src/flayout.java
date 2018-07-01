import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import FileDialogApp.WindowEventHandler;

class flayout {
	static int counter=15; //�i�H����
	public static void main(String args[]) {
		Button b[]=new Button[counter];   //���ӫ��䪺�Ѧ�
		Frame f=new Frame("FlowLayout sample");  //�p�G���[�ѼơA�hFrame�S�����D

		f.setLayout(new FlowLayout());
		for (int i=0;i<counter;i++) {
			String text="button "+Integer.toString(i);
			b[i]=new Button(text);   //���ͫ��䪫��
			f.add(b[i]);
		}
		f.setLocation(100,100);  //�N��m����(100,100)
		f.setSize(300,300);  //�]�w�j�p��300*300
		f.setVisible(true);  //�]���i����


	f.addWindowListener(new WindowEventHandler());
	}
	class WindowEventHandler extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}