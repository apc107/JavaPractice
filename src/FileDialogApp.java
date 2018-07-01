import java.awt.*;
import java.awt.event.*;

public class FileDialogApp extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Label label1 = new Label("");
	Label label2 = new Label("");
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		FileDialogApp app = new FileDialogApp();
	}

	@SuppressWarnings("deprecation")
	public FileDialogApp() {
		super("FileDialogApp");
		Panel panel = new Panel();
		Panel panel1 = new Panel();
		Panel panel2 = new Panel();
		Panel panel3 = new Panel();
		panel.setLayout(new GridLayout(3,1));
		Button button = new Button("Open FileDialog");
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.pink);

		panel1.add(button);
		panel2.add(label1);
		panel3.add(label2);
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		add("Center",panel);
		button.addActionListener(new ButtonHandler());
		addWindowListener(new WindowEventHandler());
		pack();
		setSize(400,200);
		show();
	}

	class ButtonHandler implements ActionListener {
		@SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent e) {
			FileDialog fd = new FileDialog(FileDialogApp.this);
			fd.show();
			label1.setText(fd.getDirectory());
			label2.setText(fd.getFile());
			validate();
		}
	}

	class WindowEventHandler extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}